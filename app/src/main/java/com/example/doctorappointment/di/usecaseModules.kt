package com.example.doctorappointment.di

import com.example.doctorappointment.domian.usecase.HomeUseCase
import com.example.doctorappointment.domian.usecase.UpComingScheduleUseCase
import org.koin.dsl.module

val useCaseModules = module {
    factory { UpComingScheduleUseCase(get()) }
    factory { HomeUseCase(get()) }
}