plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.core.network"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

//    implementation(libs.androidx.core.ktx)
    implementation(Deps.core)
//    implementation(libs.androidx.appcompat)
    implementation(Deps.appCompat)
//    implementation(libs.material)
    implementation(Deps.androidMaterial)
//    testImplementation(libs.junit)
    testImplementation(TestImplementation.junit)
//    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(AndroidTestImplementation.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(AndroidTestImplementation.espresso)

//    Retrofit
    implementation(Retrofit.retrofit)
    implementation(Retrofit.okHttp)
    implementation(Retrofit.gsonConvertor) // convert json response to model classes

//    Dagger Hilt
    implementation(DaggerHilt.hilt)
    kapt(DaggerHilt.hiltCompiler)
}