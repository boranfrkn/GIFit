plugins {
    id(ANDROID_LIBRARY)
    id(DAGGER_HILT_ANDROID_PLUGIN)
    id(COMMON_MODULE_PLUGIN)
}

dependencies {
    BASE
    DAGGER_HILT
    KOTLIN_STANDARD_LIBRARY
    KTOR
    KOTLINX_SERIALIZATION

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