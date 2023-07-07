package com.example.hw2mth6.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.hw2mth6.base.BaseFragment
import com.example.hw2mth6.databinding.FragmentSecondBinding

class SecondFragment : BaseFragment<FragmentSecondBinding>() {

    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(inflater, container, false)
    }

    override fun initView() {
        super.initView()

        val result = arguments?.getString("text")
        binding.textView.text = result

    }

}