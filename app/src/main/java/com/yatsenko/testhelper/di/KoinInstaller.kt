package com.yatsenko.testhelper.di

import android.app.Application
import com.yatsenko.core.CoreApi
import com.yatsenko.testhelper.TestApplication
import com.yatsenko.testhelper.ui.home.HomeViewModel
import com.yatsenko.testhelper.ui.qr.QrViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class KoinInstaller {

    private val appModule = module {
        single { androidApplication() as TestApplication }
        single { CoreApi() }
    }

    private val viewModelModule = module {
        viewModel { HomeViewModel() }
        viewModel { QrViewModel() }
    }

    fun install(application: Application) {
        startKoin {
            androidLogger()
            androidContext(application)
            modules(appModule)
            modules(viewModelModule)
        }
    }
}