package org.jetbrains.dokka.gradle

import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

/**
 * Convenient override to **append** source sets to [GradleDokkaSourceSetBuilder.dependentSourceSets]
 */
fun GradleDokkaSourceSetBuilder.dependsOn(sourceSet: KotlinSourceSet) {
    dependsOn(DokkaSourceSetID(sourceSet.name))
}

/**
 * Convenient override to **append** source sets to [GradleDokkaSourceSetBuilder.dependentSourceSets]
 */
fun GradleDokkaSourceSetBuilder.dependsOn(@Suppress("DEPRECATION") sourceSet: com.android.build.gradle.api.AndroidSourceSet) {
    dependsOn(DokkaSourceSetID(sourceSet.name))
}

/**
 * Convenient override to **append** source sets to [GradleDokkaSourceSetBuilder.dependentSourceSets]
 */
fun GradleDokkaSourceSetBuilder.dependsOn(@Suppress("UnstableApiUsage") sourceSet: com.android.build.api.dsl.AndroidSourceSet) {
    dependsOn(DokkaSourceSetID(sourceSet.name))
}

/**
 * Extension allowing configuration of Dokka source sets via Kotlin Gradle plugin source sets.
 */
fun GradleDokkaSourceSetBuilder.kotlinSourceSet(kotlinSourceSet: KotlinSourceSet) {
    configureWithKotlinSourceSet(kotlinSourceSet)
}

