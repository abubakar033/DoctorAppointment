package com.example.doctorappointment.domian.repository

import com.example.doctorappointment.domian.entities.UpcomingScheduleDTO

interface UpcomingScheduleRepo {

    fun getUpcomingScheduleList() : List<UpcomingScheduleDTO>
}