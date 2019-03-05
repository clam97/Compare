package day5;

import java.sql.*;

public class Selectdata {

    public static String selectdata(String orderid){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String message = null ;
        String sql = "Select *from myorder where orderid = '"+orderid+"'";

        try {
            conn = JdbcUtils_DBCP.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
           // System.out.println(rs.next());

                while (rs.next()){
                    String orderids = rs.getString("orderid");
                    String phones = rs.getString("phone");
                    String addrs = rs.getString("addr");
                    String onames = rs.getString("oname");
                    double moneys = rs.getDouble("money");
                    Date dates = rs.getDate("orderdate");
                    int stas = rs.getInt("sta");
                    int types = rs.getInt("type");

                    System.out.println("money-----"+moneys);
                    message = orderids+","+phones+","+addrs+","+onames+","+moneys+","+dates+","+stas+","+types;
                    System.out.println("message------------"+message);
                }

        } catch (SQLException e) {
            System.out.println("sssssssssssssssssssssss");
            e.printStackTrace();

        }
        System.out.println("ret==="+message);
        return message;
    }

    public static void main(String[] args) {

        System.out.println(Selectdata.selectdata("1998752123"));
    }
}
