package com.example.doctorappointment.domian.entities

data class NearDoctorDTO(val  id : Int, val name :String,
                         val date :String, val time :String
                         , val category :String,val  location : String)
