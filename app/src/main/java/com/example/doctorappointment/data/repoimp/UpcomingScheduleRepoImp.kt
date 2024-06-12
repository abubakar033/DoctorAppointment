package com.example.doctorappointment.data.repoimp

import com.example.doctorappointment.data.datasources.LocalDataSource
import com.example.doctorappointment.domian.entities.UpcomingScheduleDTO
import com.example.doctorappointment.domian.repository.UpcomingScheduleRepo

class UpcomingScheduleRepoImp(private val localDataSource: LocalDataSource) : UpcomingScheduleRepo {
    override fun getUpcomingScheduleList(): List<UpcomingScheduleDTO> {
        return  localDataSource.upcomingScheduleDoctor.toList();
    }
}