package com.example.hw2mth6

import com.example.hw2mth6.base.BaseActivity
import com.example.hw2mth6.databinding.ActivityMainBinding
import com.example.hw2mth6.fragments.FirstFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun inflateViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }
    override fun initView() {
        super.initView()
        supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, FirstFragment()).commit()
    }
}