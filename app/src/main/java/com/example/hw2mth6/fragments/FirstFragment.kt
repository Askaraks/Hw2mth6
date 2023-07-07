package com.example.hw2mth6.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.hw2mth6.base.BaseFragment
import com.example.hw2mth6.R
import com.example.hw2mth6.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment<FragmentFirstBinding>() {

    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(inflater, container, false)
    }

    override fun initListener() {
        super.initListener()

        binding.button.setOnClickListener {
            val text = binding.editText.text.toString()
            val secondFragment = SecondFragment()
            val bundle = Bundle().apply {
                putString("text", text)
            }
            secondFragment.arguments = bundle
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, secondFragment).addToBackStack(null).commit()
        }
    }

}