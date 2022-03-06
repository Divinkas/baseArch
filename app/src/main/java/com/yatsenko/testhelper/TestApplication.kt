package com.yatsenko.testhelper

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import com.yatsenko.testhelper.di.KoinInstaller
import timber.log.Timber

class TestApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        KoinInstaller().install(this)
    }
}