package com.example.doctorappointment.domian.usecase

import com.example.doctorappointment.domian.entities.NearDoctorDTO
import com.example.doctorappointment.domian.repository.HomeRepo

class HomeUseCase(private val homeRepo: HomeRepo) {

    fun execute(): List<NearDoctorDTO> {
        return homeRepo.getNearDoctor()
    }
}