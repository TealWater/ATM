package app;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;


public class database {
    private final static String user = "root";
    private final static String pass = "cookingG6";

public static Connection connect(){
    try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankAccounts", user, pass);
        System.out.println("Hello");
        return con;
    }
    catch(Exception e){
        System.out.println(e);
        return null;
    }
}//end of connecnt()

/**
 * 
 * @param pin ATM pin
 * @param first First name
 * @param last Last name
 * @param address Street Address (not including state and zip)
 * @param total checking account balance
 */
public static void addAcct(int pin, String first, String last, String address, double total){
    try{
        Connection con = connect();
        PreparedStatement insert = con.prepareStatement("INSERT INTO checkingAccount(pin, firstN, lastN, address, balance)"+ 
        "VALUES ('"+pin+"', '"+first+"', '"+last+"', '"+address+"', '"+total+"')");
        insert.executeUpdate();
    }catch(Exception e) {
        System.out.println(e);
    }
}


public static void deposit(int pin, double amount){
    try{
        Connection con = connect();

        //check the pin
        PreparedStatement post = con.prepareStatement("SELECT pin FROM checkingAccount");
        post.executeQuery();

        ResultSet result = post.getResultSet();
        Array list;
        
            list = result.getArray("pin");
        for(int a : list){
            System.out.println(list[a]);
        }
    }catch(Exception e) {
        System.out.println(e);
    }
}//end of deposit method

}//end of class

