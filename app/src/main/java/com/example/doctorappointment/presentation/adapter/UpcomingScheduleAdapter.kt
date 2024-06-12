package com.example.doctorappointment.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.doctorappointment.databinding.DoctorRvItemBinding
import com.example.doctorappointment.domian.entities.UpcomingScheduleDTO
import com.example.doctorappointment.presentation.holder.UpcomingScheduleViewHolder
import com.example.doctorappointment.utils.diffutils.UpcomingScheduleDiffCallback

class UpcomingScheduleAdapter : ListAdapter<UpcomingScheduleDTO, UpcomingScheduleViewHolder>(
    UpcomingScheduleDiffCallback()
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpcomingScheduleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DoctorRvItemBinding.inflate(inflater, parent, false)
        return UpcomingScheduleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UpcomingScheduleViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}