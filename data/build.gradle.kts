plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android") version "2.48" apply false
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.data"
    compileSdk = ConfigurationData.compileSdk

    buildFeatures {
        buildConfig = true
    }

    defaultConfig {
        minSdk = ConfigurationData.minSdk

        testInstrumentationRunner = Dependencies.Libraries.testInstrumentationRunner
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        named("debug") {
            buildConfigField("String", "BASE_URL", "\"" + Dependencies.Environments.debugBaseUrl + "\"")
            buildConfigField("String", "LOL_VERSION", "\"" + Dependencies.Environments.lolVersion  + "\"")
        }
        named("release") {
            isMinifyEnabled = true
            buildConfigField("String", "BASE_URL", "\"" + Dependencies.Environments.releaseBaseUrl + "\"")
            buildConfigField("String", "LOL_VERSION", "\"" + Dependencies.Environments.lolVersion  + "\"")
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
    implementation(Dependencies.Libraries.retrofit)
    implementation(Dependencies.Libraries.retrofit_converter_gson)

    implementation(Dependencies.Libraries.hilt_android)
    implementation(project(mapOf("path" to ":domain")))
    implementation(project(mapOf("path" to ":common")))
    testImplementation(Dependencies.Libraries.junit)
    androidTestImplementation(Dependencies.Libraries.junit_ext)
    androidTestImplementation(Dependencies.Libraries.espresso)
}