plugins {
    id(BuildScript.VERSIONS_PLUGIN) version (BuildScript.VERSIONS_PLUGIN_VERSION)
}

buildscript {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        maven(url = "https://developer.huawei.com/repo/")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(url = "https://jitpack.io")
        maven(url = "https://developer.huawei.com/repo/")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}