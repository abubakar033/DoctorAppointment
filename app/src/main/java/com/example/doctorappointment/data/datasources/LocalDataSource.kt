package com.example.doctorappointment.data.datasources

import com.example.doctorappointment.domian.entities.NearDoctorDTO
import com.example.doctorappointment.domian.entities.UpcomingScheduleDTO

class LocalDataSource {
    val nearDoctorList = mutableListOf(
        NearDoctorDTO(1, "Dr. Joseph Brostito", "Sunday, 12 June", "11:00 - 12:00 AM", "Dental Specialist" , "1.2KM"),
        NearDoctorDTO(2, "Dr. Emily Carter", "Monday, 13 June", "09:00 - 10:00 AM", "Cardiologist", "1.2KM"),
        NearDoctorDTO(3, "Dr. Sarah Lee", "Tuesday, 14 June", "02:00 - 03:00 PM", "Neurologist", "1.2KM"),
        NearDoctorDTO(4, "Dr. Michael Smith", "Wednesday, 15 June", "10:00 - 11:00 AM", "Dermatologist", "1.2KM"),
        NearDoctorDTO(5, "Dr. Olivia Brown", "Thursday, 16 June", "01:00 - 02:00 PM", "Pediatrician", "1.2KM"),
        NearDoctorDTO(6, "Dr. William Johnson", "Friday, 17 June", "03:00 - 04:00 PM", "Orthopedic", "1.2KM"),
        NearDoctorDTO(7, "Dr. Ava Davis", "Saturday, 18 June", "11:00 AM - 12:00 PM", "Ophthalmologist", "1.2KM"),
        NearDoctorDTO(8, "Dr. James Wilson", "Sunday, 19 June", "08:00 - 09:00 AM", "Gastroenterologist", "1.2KM"),
        NearDoctorDTO(9, "Dr. Isabella Martinez", "Monday, 20 June", "12:00 - 01:00 PM", "Oncologist", "1.2KM")
    )


    val upcomingScheduleDoctor = mutableListOf(
        UpcomingScheduleDTO(1, "Dr. Joseph Brostito", "Sunday, 12 June", "11:00 - 12:00 AM", "Dental Specialist"),
        UpcomingScheduleDTO(2, "Dr. Emily Carter", "Monday, 13 June", "09:00 - 10:00 AM", "Cardiologist"),
        UpcomingScheduleDTO(3, "Dr. Sarah Lee", "Tuesday, 14 June", "02:00 - 03:00 PM", "Neurologist"),
        UpcomingScheduleDTO(4, "Dr. Michael Smith", "Wednesday, 15 June", "10:00 - 11:00 AM", "Dermatologist"),
        UpcomingScheduleDTO(5, "Dr. Olivia Brown", "Thursday, 16 June", "01:00 - 02:00 PM", "Pediatrician"),
        UpcomingScheduleDTO(6, "Dr. William Johnson", "Friday, 17 June", "03:00 - 04:00 PM", "Orthopedic"),
        UpcomingScheduleDTO(7, "Dr. Ava Davis", "Saturday, 18 June", "11:00 AM - 12:00 PM", "Ophthalmologist"),
        UpcomingScheduleDTO(8, "Dr. James Wilson", "Sunday, 19 June", "08:00 - 09:00 AM", "Gastroenterologist"),
        UpcomingScheduleDTO(9, "Dr. Isabella Martinez", "Monday, 20 June", "12:00 - 01:00 PM", "Oncologist")
    )

}