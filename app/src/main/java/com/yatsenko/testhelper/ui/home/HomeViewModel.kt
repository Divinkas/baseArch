package com.yatsenko.testhelper.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.yatsenko.testhelper.base.BaseViewModel
import kotlinx.coroutines.launch

class HomeViewModel : BaseViewModel() {

    private val _deviceInfoLiveData = MutableLiveData<String>()
    val deviceInfoLiveData: LiveData<String>
        get() = _deviceInfoLiveData

    fun loadDeviceInfo() {
        viewModelScope.launch {
            _deviceInfoLiveData.postValue("pzdz tvoy tel stariy")
        }
    }
}