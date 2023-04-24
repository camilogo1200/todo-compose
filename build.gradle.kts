val composeUiVersion by rootProject.extra { " 1.4.2" }
val kotlinVersion by rootProject.extra { "1.8.10" }
val roomVersion by rootProject.extra { "2.5.0"}
plugins {
    id("com.android.application").version("8.0.0") apply false
    id("com.android.library").version("8.0.0") apply false
    id("org.jetbrains.kotlin.android") version("1.8.20") apply false
}