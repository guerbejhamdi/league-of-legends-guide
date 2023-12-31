plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.jvm") version "1.9.10" apply false
    id("com.google.dagger.hilt.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = ConfigurationData.applicationId
    compileSdk = ConfigurationData.compileSdk

    defaultConfig {
        applicationId = ConfigurationData.applicationId
        minSdk = ConfigurationData.minSdk
        targetSdk = ConfigurationData.targetSdk
        versionCode = ConfigurationData.versionCode
        versionName = ConfigurationData.versionName

        testInstrumentationRunner = Dependencies.Libraries.testInstrumentationRunner
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        named("debug") {
            isMinifyEnabled = false
            isShrinkResources = false
            isDebuggable = true
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-DEBUG"
            signingConfig = signingConfigs.getByName("debug")
        }
        named("release") {
            isMinifyEnabled = true
            isShrinkResources = true
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.Libraries.AndroidX.android_core_ktx)
    implementation(Dependencies.Libraries.AndroidX.lifecycle_runtime_ktx)
    implementation(Dependencies.Libraries.Compose.activity_compose)
    implementation(platform(Dependencies.Libraries.Compose.compose_bom))
    implementation(Dependencies.Libraries.Compose.compose_ui)
    implementation(Dependencies.Libraries.Compose.compose_ui_graphics)
    implementation(Dependencies.Libraries.Compose.ui_preview)
    implementation(Dependencies.Libraries.Compose.compose_material3)
    implementation(Dependencies.Libraries.glide)

    //Hilt
    ksp(Dependencies.Libraries.hilt_compiler)
    implementation(Dependencies.Libraries.hilt_android)
    implementation(Dependencies.Libraries.hilt_navigation_compose)
    implementation(project(mapOf("path" to ":data")))
    implementation(project(mapOf("path" to ":domain")))
    implementation(project(mapOf("path" to ":common")))

    // logger
    implementation(Dependencies.Libraries.timber)




    implementation(Dependencies.Libraries.retrofit)
    implementation(Dependencies.Libraries.retrofit_converter_gson)

    //test
    testImplementation(Dependencies.Libraries.junit)
    androidTestImplementation(Dependencies.Libraries.junit_ext)
    androidTestImplementation(Dependencies.Libraries.espresso)
    androidTestImplementation(platform(Dependencies.Libraries.Compose.compose_bom))
    androidTestImplementation(Dependencies.Libraries.Compose.compose_ui_test_junit)
    debugImplementation(Dependencies.Libraries.Compose.compose_ui_tooling)
    debugImplementation(Dependencies.Libraries.Compose.compose_ui_test_manifest)
}
