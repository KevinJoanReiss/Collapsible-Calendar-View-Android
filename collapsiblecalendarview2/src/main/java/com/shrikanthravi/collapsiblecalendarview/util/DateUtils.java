package com.shrikanthravi.collapsiblecalendarview.util;

import android.content.Context;

import com.shrikanthravi.collapsiblecalendarview.R;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public static String getFormattedDateString(Context context, Date date) {
        return getMonthString(context, date) + " " + getYearString(date);
    }

    private static String getMonthString(Context context, Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);

        switch (month) {
            case 0:
                return context.getString(R.string.calendar_january);
            case 1:
                return context.getString(R.string.calendar_february);
            case 2:
                return context.getString(R.string.calendar_march);
            case 3:
                return context.getString(R.string.calendar_april);
            case 4:
                return context.getString(R.string.calendar_may);
            case 5:
                return context.getString(R.string.calendar_june);
            case 6:
                return context.getString(R.string.calendar_july);
            case 7:
                return context.getString(R.string.calendar_august);
            case 8:
                return context.getString(R.string.calendar_september);
            case 9:
                return context.getString(R.string.calendar_october);
            case 10:
                return context.getString(R.string.calendar_november);
            case 11:
                return context.getString(R.string.calendar_december);
            default:
                return "";

        }
    }

    private static String getYearString(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return String.valueOf(cal.get(Calendar.YEAR));
    }
}

