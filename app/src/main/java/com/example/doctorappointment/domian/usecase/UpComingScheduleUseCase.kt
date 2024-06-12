package com.example.doctorappointment.domian.usecase

import com.example.doctorappointment.domian.entities.UpcomingScheduleDTO
import com.example.doctorappointment.domian.repository.UpcomingScheduleRepo

class UpComingScheduleUseCase(private val upcomingScheduleRepo: UpcomingScheduleRepo) {
    fun execute(): List<UpcomingScheduleDTO> {
        return upcomingScheduleRepo.getUpcomingScheduleList()
    }
}
