package com.example.doctorappointment.presentation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.doctorappointment.presentation.fragment.ComingSoonFragment
import com.example.doctorappointment.presentation.fragment.schedule.upcoming.UpcomingScheduleFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 5
    }
   private  val fragmentTitles = listOf(
        "Completed Schedule",
        "Upcoming Schedule",
        "Emergency Schedule",
        "Onsite Schedule",
        "Doctors Meeting"
    )
     fun getPageTitle(position: Int): String? {
       return fragmentTitles[position]
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ComingSoonFragment()
            1 -> UpcomingScheduleFragment()
            2 -> ComingSoonFragment()
            3 -> ComingSoonFragment()
            4 -> ComingSoonFragment()
            else -> throw IllegalStateException("Invalid position")
        }
    }
}
