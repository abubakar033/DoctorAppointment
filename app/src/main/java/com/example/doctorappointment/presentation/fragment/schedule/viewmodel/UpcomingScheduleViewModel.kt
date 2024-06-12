package com.example.doctorappointment.presentation.fragment.schedule.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doctorappointment.domian.entities.UpcomingScheduleDTO
import com.example.doctorappointment.domian.usecase.UpComingScheduleUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class UpcomingScheduleViewModel(private val upComingScheduleUseCase: UpComingScheduleUseCase) : ViewModel() {

    private val _upcomingScheduleState = MutableStateFlow<List<UpcomingScheduleDTO>>(emptyList())
    val upcomingScheduleState: StateFlow<List<UpcomingScheduleDTO>> = _upcomingScheduleState.asStateFlow()


    init {

        fetchUpcomingSchedules()
    }
   private fun fetchUpcomingSchedules() {
        viewModelScope.launch(Dispatchers.IO) {
            val data = upComingScheduleUseCase.execute()
            _upcomingScheduleState.value = data
        }
    }

}