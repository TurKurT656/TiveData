plugins {
    id(Plugins.Android.library)
    kotlin(Plugins.Kotlin.android)
    kotlin(Plugins.Kotlin.androidExtensions)
}

android {
    compileSdkVersion(Config.compileSdkVersion)
    buildToolsVersion = Config.buildToolsVersion

    defaultConfig {
        minSdkVersion(Config.minSdkVersion)
        targetSdkVersion(Config.targetSdkVersion)
        versionCode = Config.versionCode
        versionName = Config.versionName

        consumerProguardFiles("consumer-rules.pro")
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
    implementation(Libraries.AndroidX.Lifecycle.liveData)
}
