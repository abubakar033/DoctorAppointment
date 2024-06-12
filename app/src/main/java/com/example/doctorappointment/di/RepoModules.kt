package com.example.doctorappointment.di

import com.example.doctorappointment.data.repoimp.HomeRepoImp
import com.example.doctorappointment.data.repoimp.UpcomingScheduleRepoImp
import com.example.doctorappointment.domian.repository.HomeRepo
import com.example.doctorappointment.domian.repository.UpcomingScheduleRepo
import org.koin.dsl.module

val repoModules = module {
    factory  <HomeRepo>{ HomeRepoImp(get()) }
    factory <UpcomingScheduleRepo>{ UpcomingScheduleRepoImp(get()) }
}