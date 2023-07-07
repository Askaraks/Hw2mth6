package com.example.hw2mth6.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    private lateinit var binding: VB
    protected abstract fun inflateViewBinding(): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateViewBinding()
        setContentView(binding.root)

        initView()
        initListener()
    }

    open fun initView() {} // инициализация вьюшек
    open fun initListener() {} // обработка всех кликов
}