package com.example.doctorappointment.utils.diffutils

import androidx.recyclerview.widget.DiffUtil
import com.example.doctorappointment.domian.entities.NearDoctorDTO

class NearDoctorDiffCallback : DiffUtil.ItemCallback<NearDoctorDTO>() {
    override fun areItemsTheSame(oldItem: NearDoctorDTO, newItem: NearDoctorDTO): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: NearDoctorDTO, newItem: NearDoctorDTO): Boolean {
        return oldItem == newItem
    }
}