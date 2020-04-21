buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Libraries.Gradle.androidGradlePlugin)
        classpath(Libraries.Gradle.kotlinGradlePlugin)
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
