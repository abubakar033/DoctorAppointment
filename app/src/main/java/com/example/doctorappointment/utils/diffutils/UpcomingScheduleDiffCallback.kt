package com.example.doctorappointment.utils.diffutils

import androidx.recyclerview.widget.DiffUtil
import com.example.doctorappointment.domian.entities.UpcomingScheduleDTO

class UpcomingScheduleDiffCallback : DiffUtil.ItemCallback<UpcomingScheduleDTO>() {
    override fun areItemsTheSame(oldItem: UpcomingScheduleDTO, newItem: UpcomingScheduleDTO): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: UpcomingScheduleDTO, newItem: UpcomingScheduleDTO): Boolean {
        return oldItem == newItem
    }
}