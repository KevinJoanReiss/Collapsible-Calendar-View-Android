package com.shrikanthravi.collapsiblecalendarview

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.shrikanthravi.collapsiblecalendarview.widget.CollapsibleCalendar
import com.shrikanthravi.collapsiblecalendarview.widget.CollapsibleCalendar.CalendarListener
import java.util.Calendar
import java.util.GregorianCalendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.elevation = 0f
        window.statusBarColor = resources.getColor(R.color.google_red)
        val collapsibleCalendar = findViewById<CollapsibleCalendar>(R.id.collapsibleCalendarView)
        //To hide or show expand icon
        collapsibleCalendar.setExpandIconVisible(true)
        val today: Calendar = GregorianCalendar()
        collapsibleCalendar.addEventTag(today[Calendar.YEAR], today[Calendar.MONTH], today[Calendar.DAY_OF_MONTH])
        today.add(Calendar.DATE, 1)
        collapsibleCalendar.addEventTag(today[Calendar.YEAR], today[Calendar.MONTH], today[Calendar.DAY_OF_MONTH], Color.BLUE)
        println("Testing date " + collapsibleCalendar.selectedDay.day + "/" + collapsibleCalendar.selectedDay.month + "/" + collapsibleCalendar.selectedDay.year)
        collapsibleCalendar.setCalendarListener(object : CalendarListener {
            override fun onDaySelect() {}
            override fun onItemClick(v: View) {}
            override fun onDataUpdate() {}
            override fun onMonthChange() {}
            override fun onWeekChange(position: Int) {}
        })
    }
}