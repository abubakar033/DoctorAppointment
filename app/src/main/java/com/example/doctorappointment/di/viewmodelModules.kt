package com.example.doctorappointment.di

import com.example.doctorappointment.presentation.fragment.home.viewmodel.HomeViewmodel
import com.example.doctorappointment.presentation.fragment.schedule.viewmodel.UpcomingScheduleViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModules = module {
    viewModel { HomeViewmodel(get()) }
    viewModel { UpcomingScheduleViewModel(get()) }


}