package day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MyTest {

    public static void main(String[] args) {

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println("请输入日期。如2017-11-01");
            Scanner scan = new Scanner(System.in);
            String read = scan.nextLine();
            Date date = formatter.parse(read);
            System.out.println("退后一天日期为：" + formatter.format(addDateOneDay(date)));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("录入错误，程序结束！");
        }

    }

    public static Date addDateOneDay(Date date) {
        if (null == date) {
            return date;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date); // 设置当前日期
        c.add(Calendar.DATE, 1); // 日期加1天
        date = c.getTime();
        return date;
    }

}