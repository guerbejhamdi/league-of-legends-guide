plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android") version "2.44.2" apply false
}

android {
    namespace = "com.example.domain"
    compileSdk = ConfigurationData.compileSdk

    defaultConfig {
        minSdk = ConfigurationData.minSdk

        testInstrumentationRunner = Dependencies.Libraries.testInstrumentationRunner
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        named("debug") { }
        named("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {

    implementation(Dependencies.Libraries.AndroidX.android_core_ktx)
    implementation(Dependencies.Libraries.AndroidX.appcompat)
    implementation(Dependencies.Libraries.android_materiel)
    implementation(Dependencies.Libraries.hilt_android)
    implementation(project(mapOf("path" to ":common")))

    testImplementation(Dependencies.Libraries.junit)
    androidTestImplementation(Dependencies.Libraries.junit_ext)
    androidTestImplementation(Dependencies.Libraries.espresso)
}