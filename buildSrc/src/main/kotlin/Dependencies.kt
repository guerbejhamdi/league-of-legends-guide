object Dependencies {

    object Versions {
        const val hiltVersion = "2.48"
        const val hiltCompilerVersion = "2.48"
        const val hiltNavigationComposeVersion = "1.0.0-alpha03"
        const val coreKtxVersion = "1.9.0"
        const val lifecyleRuntimeKtx = "2.6.1"
        const val activityComposeVersion = "1.7.2"
        const val retrofitVersion = "2.9.0"
        const val retrofitConverterVersion = "2.9.0"
        const val junitVersion = "4.13.2"
        const val junitExtVersion = "1.1.5"
        const val espresso = "3.5.1"
        const val composeBom = "2023.03.00"
        const val appcompatVersion = "1.6.1"
        const val materiel = "1.9.0"
        const val timber = "5.0.1"
        const val okhttpVersion = "4.9.1"
        const val glideVersion = "2.2.3"
    }


    object Libraries {
        const val hilt_android = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
        const val hilt_navigation_compose = "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationComposeVersion}"
        const val hilt_compiler = "com.google.dagger:hilt-android-compiler:${Versions.hiltCompilerVersion}"
        const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
        const val retrofit_converter_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitConverterVersion}"
        const val junit = "junit:junit:${Versions.junitVersion}"
        const val junit_ext = "androidx.test.ext:junit:${Versions.junitExtVersion}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
        const val android_materiel = "com.google.android.material:material:${Versions.materiel}"
        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttpVersion}"
        const val glide = "com.github.skydoves:landscapist-glide:${Versions.glideVersion}"

        object AndroidX {
            const val android_core_ktx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
            const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompatVersion}"
            const val lifecycle_runtime_ktx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecyleRuntimeKtx}"
        }

        object Compose{
            const val compose_bom = "androidx.compose:compose-bom:${Versions.composeBom}"
            const val activity_compose = "androidx.activity:activity-compose:${Versions.activityComposeVersion}"
            const val compose_ui = "androidx.compose.ui:ui"
            const val compose_ui_graphics = "androidx.compose.ui:ui-graphics"
            const val ui_preview = "androidx.compose.ui:ui-tooling-preview"
            const val compose_material3 = "androidx.compose.material3:material3"
            const val compose_ui_test_junit = "androidx.compose.ui:ui-test-junit4"
            const val compose_ui_tooling = "androidx.compose.ui:ui-tooling"
            const val compose_ui_test_manifest = "androidx.compose.ui:ui-test-manifest"

        }
    }

    object Environments {
        const val debugBaseUrl = "https://ddragon.leagueoflegends.com/cdn"
        const val releaseBaseUrl = "https://ddragon.leagueoflegends.com/cdn"
        const val lolVersion = "13.16.1"
    }


}




