package com.example.doctorappointment.presentation.fragment.home


import androidx.lifecycle.lifecycleScope
import com.example.doctorappointment.presentation.adapter.NearDoctorAdapter
import com.example.doctorappointment.databinding.FragmentHomeBinding
import com.example.doctorappointment.domian.entities.NearDoctorDTO
import com.example.doctorappointment.presentation.base.BaseFragment
import com.example.doctorappointment.presentation.fragment.home.viewmodel.HomeViewmodel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private val homeViewmodel: HomeViewmodel by viewModel()
    private lateinit var nearDoctorAdapter: NearDoctorAdapter

    override fun onFragmentCreated() {
        setupRecyclerView()
        observeViewModel()
    }

    private fun setupRecyclerView() {
        nearDoctorAdapter = NearDoctorAdapter()
        binding.rvNearDoctor.adapter = nearDoctorAdapter

    }

    private fun observeViewModel() {
        viewLifecycleOwner.lifecycleScope.launch {
            homeViewmodel.homeDataState.collect { dataState ->
                nearDoctorAdapter.submitList(dataState)
            }
        }
    }
}
