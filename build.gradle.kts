buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Libraries.Gradle.androidGradlePlugin)
        classpath(Libraries.Gradle.kotlinGradlePlugin)
        classpath(Libraries.AndroidX.Navigation.navigationPlugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean").configure {
    delete("build")
}
