plugins {
    id(ANDROID_APPLICATION)
    id(DAGGER_HILT_ANDROID_PLUGIN)
    id(COMMON_MODULE_PLUGIN)
}

android {
    buildFeatures.compose = true

    composeOptions {
        kotlinCompilerExtensionVersion = Libraries.Compose.COMPOSE_VERSION
    }
}

dependencies {
    FEATURE_FAVORITES
    FEATURE_SEARCH
    FEATURE_SPLASH
    FEATURE_HISTORY
    LAYER_UI

    BASE
    COMPOSE
    COMPOSE_NAVIGATION
    COMPOSE_VIEWMODEL
    DAGGER_HILT
    KOTLIN_STANDARD_LIBRARY

    ANDROID_TEST
    COROUTINES_TEST
    LOCAL_TEST_JUNIT5
}

kapt {
    correctErrorTypes = true
}

moduleConfigurations {
    useJUnitRunner5 = true
}