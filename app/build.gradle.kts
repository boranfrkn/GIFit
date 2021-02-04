plugins {
    id(ANDROID_APPLICATION)
    id(DAGGER_HILT_ANDROID_PLUGIN) // TODO: Why this doesn't work but above works?
    id(COMMON_MODULE_PLUGIN)
}


android.buildFeatures.compose = true

dependencies {
    FEATURE_SPLASH

    BASE
    COMPOSE
    DAGGER_HILT
    KOTLIN_STANDARD_LIBRARY
}