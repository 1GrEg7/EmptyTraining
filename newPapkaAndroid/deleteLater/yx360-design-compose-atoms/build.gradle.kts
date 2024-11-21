import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetTree
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
    //alias(coreLibs.plugins.kotlin.multiplatform)
    alias(coreLibs.plugins.compose)
    alias(coreLibs.plugins.compose.compiler)
    //alias(libs.plugins.androidLibrary)
    id("com.android.library")
    id("org.jetbrains.kotlin.multiplatform")

}


kotlin {
    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions{
            jvmTarget.set(JvmTarget.JVM_17)
            freeCompilerArgs.addAll("-Xjdk-release=${JavaVersion.VERSION_17}")
        }
        // https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-test.html

        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        instrumentedTestVariant {
            sourceSetTree.set(KotlinSourceSetTree.test)
            dependencies {

            }
        }
    }

    jvm()

    js()

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs()

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "yx-360-design-compose"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            api(project(":yx360-design-compose"))

            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation(compose.material3)
            implementation(compose.material)
            implementation(compose.components.resources)

            implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.0")
        }

        commonTest.dependencies {}

        androidMain.dependencies {
            implementation(project.dependencies.platform(coreLibs.androidx.compose.bom))

            implementation(libs.androidx.core.ktx)
            implementation(libs.androidx.lifecycle.runtime.ktx)
            implementation(libs.androidx.activity.compose)

            implementation(coreLibs.androidx.compose.ui)
            implementation(coreLibs.androidx.compose.uiGraphics)
            implementation(coreLibs.androidx.compose.uiToolingPreview)
            implementation(coreLibs.androidx.compose.material3)
        }

        jvmMain.dependencies {}

        iosMain.dependencies {}
        // To support yx360-design-legacy modules,
        // we have to split expect/actual definitions to separated src dir
        commonMain.configure {
            kotlin.srcDirs("./src/commonMain/kotlin-cmp")
        }
        androidMain.configure {
            kotlin.srcDirs("./src/androidMain/kotlin-actuals")
        }
    }
}

android {
    namespace = "com.yx360.design.compose.atoms"
    compileSdk = 34

    defaultConfig {
        minSdk = 26

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    sourceSets["main"].apply {
        manifest.srcFile("src/androidMain/AndroidManifest.xml")
        res.srcDirs("src/androidMain/res")
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    compose.resources {
        publicResClass = true
        packageOfResClass = "com.yx360.design.compose.atoms.resources"
        generateResClass = always
    }
    buildFeatures {
        compose = true
    }

    dependencies{
        debugImplementation(compose.uiTooling)
    }
}
