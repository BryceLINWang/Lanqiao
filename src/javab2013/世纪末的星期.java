package javab2013;

import java.util.Calendar;

public class 世纪末的星期 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        for(int year=1999;year<10000;year+=100){
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,11);//12月默认从0始
            calendar.set(Calendar.DAY_OF_MONTH,31);
            System.out.println(year+" "+calendar.get(calendar.DAY_OF_WEEK));
            if(calendar.get(calendar.DAY_OF_WEEK)==1) {//默认星期天开始 从1起
             break;
            }
        }
    }
}
