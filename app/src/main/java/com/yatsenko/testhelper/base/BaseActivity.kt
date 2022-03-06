package com.yatsenko.testhelper.base

import androidx.appcompat.app.AppCompatActivity
import com.yatsenko.testhelper.TestApplication

open class BaseActivity : AppCompatActivity() {

    protected val testApplication get() = application as TestApplication
}