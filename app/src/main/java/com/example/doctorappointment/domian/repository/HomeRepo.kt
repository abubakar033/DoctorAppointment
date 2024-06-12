package com.example.doctorappointment.domian.repository

import com.example.doctorappointment.domian.entities.NearDoctorDTO

interface HomeRepo {
    fun getNearDoctor() : List<NearDoctorDTO>
}