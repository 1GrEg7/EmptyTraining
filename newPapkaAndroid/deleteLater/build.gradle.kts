// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(coreLibs.plugins.kotlin.multiplatform) apply false
    alias(coreLibs.plugins.compose)
    alias(coreLibs.plugins.compose.compiler)
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
//        classpath(libs.gradle) // Проверьте актуальность версии
//        classpath(libs.kotlin.gradle.plugin) // Версия Kotlin
        classpath("com.android.tools.build:gradle:7.0.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
    }
}


subprojects {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        kotlinOptions {
            // Interpreting Compose Compiler Metrics:
            // https://github.com/androidx/androidx/blob/ci-workflow-bot/update-prebuilts-2023-10-16-18-15/6537620715-73/compose/compiler/design/compiler-metrics.md
            // use "-PenableComposeCompilerReports=true" to enable. Make sure to always run this on a release build to ensure accurate results.
            // use --rerun-tasks to check the metrics without caching
            if (project.findProperty("enableComposeCompilerReports") == "true") {
                freeCompilerArgs += listOf(
                    "-P",
                    "plugin:androidx.compose.compiler.plugins.kotlin:reportsDestination=${project.buildDir}/compose_compiler"
                )
                freeCompilerArgs += listOf(
                    "-P",
                    "plugin:androidx.compose.compiler.plugins.kotlin:metricsDestination=${project.buildDir}/compose_compiler"
                )
            }
        }
    }
}
