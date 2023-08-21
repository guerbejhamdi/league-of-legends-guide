plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.common"
    compileSdk = ConfigurationData.compileSdk

    defaultConfig {
        minSdk = ConfigurationData.minSdk

        testInstrumentationRunner =Dependencies.Libraries.testInstrumentationRunner
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
    implementation(Dependencies.Libraries.okhttp)
    implementation(Dependencies.Libraries.timber)

    implementation(Dependencies.Libraries.AndroidX.android_core_ktx)
    implementation(Dependencies.Libraries.AndroidX.appcompat)
    implementation(Dependencies.Libraries.android_materiel)
    testImplementation(Dependencies.Libraries.junit)
    androidTestImplementation(Dependencies.Libraries.junit_ext)
    androidTestImplementation(Dependencies.Libraries.espresso)
}