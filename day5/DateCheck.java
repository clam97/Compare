package day5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCheck {
    public int datacheck(String date){

        String standard="";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhss");
        standard = sdf.format(new Date()).substring(0,8);
        System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"+standard);
        if (date.equals(standard)){
            return 1;
        }else {
            return 0;
        }


    }


}
