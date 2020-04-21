object Libraries {

    private const val KOTLIN_VERSION = "1.3.72"

    object Gradle {

        private const val ANDROID_GRADLE_VERSION = "3.6.3"

        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
        const val androidGradlePlugin = "com.android.tools.build:gradle:$ANDROID_GRADLE_VERSION"

    }

    object Core {

        const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$KOTLIN_VERSION"

    }

    object AndroidX {

        private const val CORE_VERSION = "1.2.0"
        private const val APPCOMPAT_VERSION = "1.1.0"

        const val core = "androidx.core:core-ktx:$CORE_VERSION"
        const val appCompat = "androidx.appcompat:appcompat:$APPCOMPAT_VERSION"

    }


}