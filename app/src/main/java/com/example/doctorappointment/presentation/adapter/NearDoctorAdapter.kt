package com.example.doctorappointment.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.doctorappointment.databinding.NearDoctorRvItemBinding
import com.example.doctorappointment.domian.entities.NearDoctorDTO
import com.example.doctorappointment.presentation.holder.NearDoctorViewHolder
import com.example.doctorappointment.utils.diffutils.NearDoctorDiffCallback

class NearDoctorAdapter : ListAdapter<NearDoctorDTO, NearDoctorViewHolder>(
    NearDoctorDiffCallback()
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NearDoctorViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = NearDoctorRvItemBinding.inflate(inflater, parent, false)
        return NearDoctorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NearDoctorViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}