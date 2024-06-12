package com.example.doctorappointment.di

import com.example.doctorappointment.data.datasources.LocalDataSource
import org.koin.dsl.module

val dataSourceModules = module {
    single { LocalDataSource() }
}