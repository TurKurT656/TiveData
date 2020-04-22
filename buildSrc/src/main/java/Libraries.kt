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
        private const val CONSTRAINT_LAYOUT_VERSION = "2.0.0-beta4"

        const val core = "androidx.core:core-ktx:$CORE_VERSION"
        const val appCompat = "androidx.appcompat:appcompat:$APPCOMPAT_VERSION"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:$CONSTRAINT_LAYOUT_VERSION"

        object Lifecycle {

            private const val LIFECYCLE_VERSION = "2.2.0"

            const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$LIFECYCLE_VERSION"
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFECYCLE_VERSION"

        }

        object Navigation {

            private const val NAVIGATION_VERSION = "2.3.0-alpha05"

            const val navigationFragment =
                "androidx.navigation:navigation-fragment-ktx:$NAVIGATION_VERSION"
            const val navigationUI =
                "androidx.navigation:navigation-ui-ktx:$NAVIGATION_VERSION"

        }

    }

    object UI {

        private const val MATERIAL_VERSION = "1.2.0-alpha06"

        const val materialComponents = "com.google.android.material:material:$MATERIAL_VERSION"

    }

    object ThirdParty {

        private const val LIVE_EVENT_VERSION = "1.2.0"
        private const val TIMBER_VERSION = "4.7.1"

        const val liveEvent = "com.github.hadilq.liveevent:liveevent:$LIVE_EVENT_VERSION"
        const val timber = "com.jakewharton.timber:timber:$TIMBER_VERSION"

    }


}