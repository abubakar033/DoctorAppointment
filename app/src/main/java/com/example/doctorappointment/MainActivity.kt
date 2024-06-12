package com.example.doctorappointment

import androidx.navigation.fragment.NavHostFragment
import com.example.doctorappointment.databinding.ActivityMainBinding
import com.example.doctorappointment.presentation.base.BaseActivity
import com.ismaeldivita.chipnavigation.ChipNavigationBar

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate){


    override fun initViews() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val chipNavigationBar: ChipNavigationBar = findViewById(R.id.menu)
        chipNavigationBar.setOnItemSelectedListener { id ->
            when (id) {
                R.id.home -> navController.navigate(R.id.home)
                R.id.schedule -> navController.navigate(R.id.schedule)
                R.id.comingSoon -> navController.navigate(R.id.comingSoon)
            }
        }

        chipNavigationBar.setItemSelected(R.id.home, true)
    }


}