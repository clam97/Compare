package day5;

public class Getdata {

    private String orderid;
    private String phone;
    private String addr;
    private String oname;
    private String money;
    private String orderdate;
    private String sta;
    private String type;

    private String orderids;
    private String phones;
    private String addrs;
    private String onames;
    private double moneys;
    private String orderdates;
    private String stas;
    private String types;

    public void setData(String inString){

        String[] terget = inString.split(",");
        System.out.println("获取一条记录---------------------------------");
        for (int i = 0; i <terget.length ; i++) {
            System.out.print(terget[i] + " ");
        }

        orderid = terget[0];
        phone = terget[1];
        addr = terget[2];
        oname = terget[3];
        money = terget[4];
        orderdate = terget[5];
        sta = terget[6];
        type = terget[7];

        double mmoney = Double.parseDouble(money);
        //String aa = String.valueOf(mymoney);
        System.out.println("money is the what? "+money);
        String message = Selectdata.selectdata(orderid);
        System.out.println("=========================");
        System.out.println(message);
        if (message==null){
            System.out.println(orderid+"这个订单不存在");
        }else {
            String[] mydata = message.split(",");
            orderids = mydata[0];
            phones = mydata[1];
            addrs = mydata[2];
            onames = mydata[3];
            moneys = Double.parseDouble(mydata[4]);
            orderdates = mydata[5];
            stas = mydata[6];
            types = mydata[7];

            //double mymoneys = Double.valueOf(moneys);

                if (phones.equals(phone) && addrs.equals(addr) && onames.equals(oname)){
                    if (moneys-mmoney<=0){
                        if (orderdates.equals(orderdate)){
                            if (stas.equals(sta)){
                                System.out.println(orderids+"  订单信息正确！");
                            }else {
                                System.out.println(orderids+"订单交易类型有误！");
                            }
                        }
                        else {
                            System.out.println(orderids+"这个订单的日期有误！");
                        }
                    }
                    else {
                        System.out.println(orderids+"这个订单的金额不正确！");
                    }
                }else {
                    System.out.println(orderids+"这个订单的姓名电话或者地址有误！");
                }



        }



    }


}
