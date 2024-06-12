package com.example.doctorappointment.data.repoimp

import com.example.doctorappointment.data.datasources.LocalDataSource
import com.example.doctorappointment.domian.entities.NearDoctorDTO
import com.example.doctorappointment.domian.repository.HomeRepo

class HomeRepoImp(private val localDataSource: LocalDataSource) : HomeRepo {
    override fun getNearDoctor(): List<NearDoctorDTO> {
  return  localDataSource.nearDoctorList;
    }
}