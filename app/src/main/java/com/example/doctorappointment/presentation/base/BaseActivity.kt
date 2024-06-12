package com.example.doctorappointment.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding


abstract class BaseActivity<VB : ViewBinding>(var bindingInflater: (LayoutInflater) -> VB) : AppCompatActivity() {
    private var _binding: ViewBinding? = null
    val binding: VB
        get() = _binding as VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater.invoke(layoutInflater)
        setContentView(requireNotNull(_binding).root)
        initViews()
    }


    abstract fun initViews()

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}
