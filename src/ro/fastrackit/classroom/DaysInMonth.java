package ro.fastrackit.classroom;


import java.text.SimpleDateFormat;
import java.util.Calendar;

class dates
{
    public static void main(String args[])
    {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(df.format(cal.getTime()));
        for (int i = 1; i < maxDay; i++)
        {
            cal.set(Calendar.DAY_OF_MONTH, i + 1);
            System.out.println(df.format(cal.getTime()));
        }
    }
}