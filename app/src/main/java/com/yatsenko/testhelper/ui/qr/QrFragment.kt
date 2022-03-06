package com.yatsenko.testhelper.ui.qr

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yatsenko.testhelper.R
import com.yatsenko.testhelper.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class QrFragment : BaseFragment() {

    private val viewModel: QrViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment_qr, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initComponents()
        setupListeners()
        observeLiveData()
    }

    private fun initComponents() {
    }

    private fun setupListeners() {
    }

    private fun observeLiveData() {
    }
}