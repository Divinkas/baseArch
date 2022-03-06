package com.yatsenko.testhelper.ui

import android.os.Bundle
import com.yatsenko.testhelper.R
import com.yatsenko.testhelper.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}