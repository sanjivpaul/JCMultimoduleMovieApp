plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.multimoduleprojectbasics"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.multimoduleprojectbasics"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures {
        compose = true
    }
}

dependencies {

//    implementation(libs.androidx.core.ktx)
    implementation(Deps.core)
//    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(CoroutinesLifecycleScope.lifeCycleRuntime)
//    implementation(libs.androidx.activity.compose)

//    Jetpack Compose
    implementation(JetpackCompose.composeActivity)
    implementation(platform(libs.androidx.compose.bom))
//    implementation(JetpackCompose.composeBom)
//    implementation(libs.androidx.ui)
    implementation(JetpackCompose.composeUi)
//    implementation(libs.androidx.ui.graphics)
    implementation(JetpackCompose.composeUiGraphic)
//    implementation(libs.androidx.ui.tooling.preview)
    implementation(JetpackCompose.composeUiToolingPreview)
//    implementation(libs.androidx.material3)
    implementation(JetpackCompose.composeMaterial3)

    // testImplementation
//    testImplementation(libs.junit)
    testImplementation(TestImplementation.junit)

//    Android test implementations
//    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(AndroidTestImplementation.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(AndroidTestImplementation.espresso)
    androidTestImplementation(platform(libs.androidx.compose.bom))

//    androidTestImplementation(libs.androidx.ui.test.junit4)
    androidTestImplementation(ComposeAndroidTestImplementation.composeUiTest)

//    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(ComposeDebugImplementation.toolingUi)
//    debugImplementation(libs.androidx.ui.test.manifest)
    debugImplementation(ComposeDebugImplementation.manifestTest)
}