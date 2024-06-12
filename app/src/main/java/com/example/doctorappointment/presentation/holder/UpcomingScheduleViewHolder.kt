package com.example.doctorappointment.presentation.holder

import androidx.recyclerview.widget.RecyclerView
import com.example.doctorappointment.databinding.DoctorRvItemBinding
import com.example.doctorappointment.domian.entities.UpcomingScheduleDTO

class UpcomingScheduleViewHolder(private val binding: DoctorRvItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: UpcomingScheduleDTO) {
        binding.tvDoctorName.text = item.name
        binding.tvDoctorProfession.text = item.category
        binding.tvSchedule.text = item.date
        binding.tvDate.text = item.time
    }
}