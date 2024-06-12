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


class ScheduleFragment : BaseFragment<FragmentScheduleBinding>(FragmentScheduleBinding::inflate) {

    override fun onFragmentCreated() {
        setupViewPagerWithTabs()
        customizeTabViews()
        setupTabSelectionListener()
    }

    private fun setupViewPagerWithTabs() {
        val adapter = ViewPagerAdapter(requireActivity())
        binding.viewpager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewpager) { tab, position ->
            tab.text = adapter.getPageTitle(position)
        }.attach()

        addSpaceToTabs()
    }

    private fun customizeTabViews() {
        val adapter = binding.viewpager.adapter as ViewPagerAdapter
        for (i in 0 until binding.tabLayout.tabCount) {
            val tab = binding.tabLayout.getTabAt(i)
            tab?.customView = createTabView(adapter.getPageTitle(i)!!, i)
        }
    }

    private fun setupTabSelectionListener() {
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                updateTabTextColor(tab, R.color.light_blue_100)
                addSpaceToTabs()
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                updateTabTextColor(tab, R.color.light_gray)
            }

            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }

    private fun createTabView(tabText: String, itemPosition: Int): View {
        val view = LayoutInflater.from(requireContext()).inflate(R.layout.custom_tablayout_item, null)
        val textView = view.findViewById<TextView>(R.id.tv_tab_item)
        val colorRes = if (itemPosition == 0) R.color.light_blue_100 else R.color.light_gray
        textView.setTextColor(ContextCompat.getColor(requireContext(), colorRes))
        textView.text = tabText
        return view
    }

    private fun updateTabTextColor(tab: TabLayout.Tab, colorResId: Int) {
        tab.customView?.findViewById<TextView>(R.id.tv_tab_item)?.setTextColor(
            ContextCompat.getColor(requireContext(), colorResId)
        )
    }

    private fun addSpaceToTabs() {
        for (i in 0 until binding.tabLayout.tabCount) {
            val tab = (binding.tabLayout.getChildAt(0) as ViewGroup).getChildAt(i)
            val params = tab.layoutParams as ViewGroup.MarginLayoutParams
            params.setMargins(0, 0, 20, 0)
            tab.requestLayout()
        }
    }
}
