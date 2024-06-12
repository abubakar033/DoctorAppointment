package com.example.doctorappointment.presentation.fragment.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doctorappointment.domian.entities.NearDoctorDTO
import com.example.doctorappointment.domian.usecase.HomeUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewmodel(private val homeUseCase: HomeUseCase) : ViewModel() {

    private val _homeDataState = MutableStateFlow<List<NearDoctorDTO>>(emptyList())
    val homeDataState: StateFlow<List<NearDoctorDTO>> = _homeDataState.asStateFlow()


    init {
        fetchHomeData()
    }
   private fun fetchHomeData() {
        viewModelScope.launch(Dispatchers.IO) {
            val data = homeUseCase.execute()
            _homeDataState.value = data
        }
    }
}