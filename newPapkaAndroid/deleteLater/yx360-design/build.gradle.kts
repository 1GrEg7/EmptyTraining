import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetTree
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("com.android.library")
}

kotlin {
    androidTarget {
        @Suppress("OPT_IN_USAGE")
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
            baseName = "yx-36-design-compose"
            isStatic = true
        }
    }

    sourceSets {
        all {
            languageSettings {
                optIn("org.jetbrains.compose.resources.ExperimentalResourceApi")
            }
        }
        commonMain.dependencies {
        }

        commonTest.dependencies {
        }

        androidMain.dependencies {
        }

        jvmMain.dependencies {

        }

        iosMain.dependencies {

        }
    }
}

android {
    namespace = "com.yx360.design"
    compileSdk = 34

    defaultConfig {
        minSdk = 26
    }

    buildTypes {
        release {
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
