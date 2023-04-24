import com.android.build.api.dsl.Packaging

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.kapt")
    id("org.jetbrains.kotlin.plugin.parcelize")
}

android {
    namespace = "com.camilogo1200.todocompose"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.camilogo1200.todocompose"
        minSdk = 28
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }

    fun Packaging.() {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.10.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.1")
    implementation("androidx.compose.ui:ui:${rootProject.extra.get("composeUiVersion")}")
    implementation("androidx.compose.ui:ui-tooling-preview:${rootProject.extra.get("composeUiVersion")}")
    implementation("androidx.compose.material:material:1.4.2")
    implementation("androidx.core:core-ktx:1.10.0")
    testImplementation("junit:junit:4.13.2")

    //Room
    implementation("androidx.room:room-runtime:${rootProject.extra.get("roomVersion")}")
    annotationProcessor("androidx.room:room-compiler:${rootProject.extra.get("roomVersion")}")

    // To use Kotlin annotation processing tool (kapt)
    kapt("androidx.room:room-compiler:${rootProject.extra.get("roomVersion")}")

    // optional - Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:${rootProject.extra.get("roomVersion")}")
    // optional - Test helpers
    testImplementation("androidx.room:room-testing:${rootProject.extra.get("roomVersion")}")
    // optional - Paging 3 Integration
    implementation("androidx.room:room-paging:${rootProject.extra.get("roomVersion")}")


    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${rootProject.extra.get("composeUiVersion")}")
    debugImplementation("androidx.compose.ui:ui-tooling:${rootProject.extra.get("composeUiVersion")}")
    debugImplementation("androidx.compose.ui:ui-test-manifest:${rootProject.extra.get("composeUiVersion")}")
}