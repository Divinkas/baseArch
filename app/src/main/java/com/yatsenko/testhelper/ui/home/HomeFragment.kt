package com.yatsenko.testhelper.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.yatsenko.testhelper.R
import com.yatsenko.testhelper.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment() {

    private val viewModel: HomeViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment_home, container, false)
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
        tvOpenDeviceInfo.setOnClickListener {
            viewModel.loadDeviceInfo()
        }

        tvQrHelp.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.toQrScreen())
        }
    }

    private fun observeLiveData() {
        viewModel.deviceInfoLiveData.observe(this) { deviceInfo ->
            tvDeviceInfoValue.text = deviceInfo
        }
    }
}