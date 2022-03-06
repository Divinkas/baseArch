package com.yatsenko.testhelper.base

import androidx.lifecycle.ViewModel
import com.yatsenko.core.CoreApi
import org.koin.core.KoinComponent
import org.koin.core.inject

open class BaseViewModel : ViewModel(), KoinComponent {

    protected val coreSdk: CoreApi by inject()
}