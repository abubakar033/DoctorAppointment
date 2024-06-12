package com.example.doctorappointment.presentation.fragment.schedule


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.doctorappointment.R
import com.example.doctorappointment.presentation.adapter.ViewPagerAdapter
import com.example.doctorappointment.databinding.FragmentScheduleBinding
import com.example.doctorappointment.presentation.base.BaseFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class ScheduleFragment : BaseFragment<FragmentScheduleBinding>(FragmentScheduleBinding::inflate){

    override fun onFragmentCreated() {
        val adapter = ViewPagerAdapter(requireActivity())
        binding.viewpager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewpager) { tab, position ->
            tab.text = adapter.getPageTitle(position)
        }.attach()

        addSpace(binding.tabLayout)
        for (i in 0 until binding.tabLayout.getTabCount()) {
            val tab: TabLayout.Tab = binding.tabLayout.getTabAt(i)!!
            if (tab != null) {
                tab.setCustomView(createTabView(adapter.getPageTitle(i)!! , 0))
            }
        }


        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {

                if (tab.customView != null) {
                    val textView = tab.customView!!.findViewById<TextView>(R.id.tv_tab_item)
                    textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.light_blue_100))
                }
                addSpace(binding.tabLayout)
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                if (tab.customView != null) {
                    val textView = tab.customView!!.findViewById<TextView>(R.id.tv_tab_item)
                    textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.light_gray))
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

    }

    private fun createTabView(tabText: String , itemPosition : Int): View {
        val view = LayoutInflater.from(requireContext()).inflate(R.layout.custom_tablayout_item, null)
        val textView = view.findViewById<TextView>(R.id.tv_tab_item)
        if (itemPosition ==0){
            textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.light_blue_100))
        }
        else{
            textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.light_gray))
        }
        textView.text = tabText
        return view
    }

    private fun addSpace(mTabLayout: TabLayout){
        for (i in 0 until mTabLayout.getTabCount()) {
            val tab = (mTabLayout.getChildAt(0) as ViewGroup).getChildAt(i)
            val p = tab.layoutParams as MarginLayoutParams
            p.setMargins(0, 0, 20, 0)
            tab.requestLayout()
        }
    }




}