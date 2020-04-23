package io.omido.tivedata.app

import android.app.Application
import io.omido.tivedata.BuildConfig
import io.omido.tivedata.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        // Plant Timber logger in
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())

        // Koin di initialization
        startKoin {
            androidContext(this@App)
            androidLogger(Level.DEBUG)
            modules(
                viewModelModule
            )
        }
    }


}