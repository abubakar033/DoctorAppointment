package com.example.doctorappointment.presentation.holder

import androidx.recyclerview.widget.RecyclerView
import com.example.doctorappointment.databinding.NearDoctorRvItemBinding
import com.example.doctorappointment.domian.entities.NearDoctorDTO

class NearDoctorViewHolder(private val binding: NearDoctorRvItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: NearDoctorDTO) {
        binding.tvDoctorName.text = item.name
        binding.tvDoctorProfession.text = item.category
        binding.tvSchedule.text = item.date
        binding.tvDate.text = item.time
    }
}