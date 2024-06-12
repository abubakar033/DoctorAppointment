package com.example.doctorappointment.presentation.fragment.schedule.upcoming

import com.example.doctorappointment.presentation.adapter.UpcomingScheduleAdapter
import com.example.doctorappointment.domian.entities.UpcomingScheduleDTO
import com.example.doctorappointment.databinding.FragmentUpcomingScheduleBinding
import com.example.doctorappointment.presentation.base.BaseFragment



import androidx.lifecycle.lifecycleScope
import com.example.doctorappointment.presentation.fragment.schedule.viewmodel.UpcomingScheduleViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel


class UpcomingScheduleFragment : BaseFragment<FragmentUpcomingScheduleBinding>(FragmentUpcomingScheduleBinding::inflate){
    private lateinit var adapter: UpcomingScheduleAdapter
    private val upcomingScheduleViewModel : UpcomingScheduleViewModel by viewModel()

    override fun onFragmentCreated() {
        setupAdapter()
        observeData()

    }

    private fun observeData() {
        viewLifecycleOwner.lifecycleScope.launch(Dispatchers.Main) {
            upcomingScheduleViewModel.upcomingScheduleState.collect { dataState ->
                adapter.submitList(dataState)
            }
        }
    }

    private fun setupAdapter() {
        adapter = UpcomingScheduleAdapter()
        binding.rvUpcomingSchedule.adapter = adapter
    }


}