package day5;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static day5.MyTest.addDateOneDay;

public class OperateCSVfile implements Runnable {


    public String operateCSVfile(String url){
       double csvmoney = 0;
       String Todate =null;
       File inFile = new File("/home/wwj/File/"+url); // 读取的CSV文件

       //File outFile = new File("/home/wwj/File/out.csv");//写出的CSV文件
       String inString = "";
       try {
           BufferedReader reader = new BufferedReader(new FileReader(inFile));
           while ((inString = reader.readLine())!=null){
               Getdata getdata = new Getdata();
               getdata.setData(inString);

               System.out.println(inString);
           }

       } catch (FileNotFoundException e) {
           System.out.println("没找到文件！");
       } catch (IOException e) {
           System.out.println("读写文件出错！");
       }

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = formatter.parse(url);
            Todate = formatter.format(addDateOneDay(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return Todate ;

   }

    @Override
    public void run() {

    }
}

