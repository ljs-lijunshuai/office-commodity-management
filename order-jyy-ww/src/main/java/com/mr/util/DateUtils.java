package com.mr.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by yangx on 2019/9/18.
 */
public class DateUtils {


    public static String[] getWeekDate(){
        String[] weekDates = new String[7];
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar startCalendar = Calendar.getInstance();
        startCalendar.set(Calendar.DAY_OF_WEEK, 1);
        setMinTime(startCalendar);

        for (int i=0;i<7;i++){

            if(i!=0){
                // 获取之前的日期
                startCalendar.setTime(startCalendar.getTime());
                // 在之前日期的基础上+1天
                startCalendar.add(Calendar.DATE,1);
            }

            // 获取当前循环日期并且赋值
            weekDates[i]=sdf.format(startCalendar.getTime());

        }

        return weekDates;
    }

    private static void setMinTime(Calendar calendar){
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
    }
}
