import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.DetektPlugin
import io.gitlab.arturbosch.detekt.report.ReportMergeTask

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.detekt) apply true
}

val mergeDetektReports by tasks.registering(ReportMergeTask::class) {
    output.set(rootProject.layout.buildDirectory.file("reports/detekt/detekt.sarif"))
}

subprojects {
    apply<DetektPlugin>()

    detekt {
        config.setFrom(rootProject.file(".detekt/detekt.yml"))
        buildUponDefaultConfig = true
    }

    tasks.withType<Detekt>().configureEach detekt@{
        finalizedBy(mergeDetektReports)
        mergeDetektReports.configure {
            input.from(this@detekt.sarifReportFile)
        }
    }

    dependencies {
        detektPlugins(project(":code-quality"))
    }
}
