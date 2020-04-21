plugins {
    id(Plugins.Android.application)
    kotlin(Plugins.Kotlin.android)
    kotlin(Plugins.Kotlin.androidExtensions)
}

android {
    compileSdkVersion(Config.compileSdkVersion)
    buildToolsVersion = Config.buildToolsVersion

    defaultConfig {
        applicationId = Config.applicationId
        minSdkVersion(Config.minSdkVersion)
        targetSdkVersion(Config.targetSdkVersion)
        versionCode = Config.versionCode
        versionName = Config.versionName
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

}

dependencies {
    implementation(Libraries.Core.kotlinStdlib)
    implementation(Libraries.AndroidX.appCompat)
    implementation(Libraries.AndroidX.core)
}
