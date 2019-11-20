package app;

import java.sql.*;
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
        //ArrayList<String> list = new ArrayList<String>();
        while(result.next()){
          // System.out.println( result.getString("pin") ); //Debugging
           if (Integer.parseInt(result.getString("pin")) == pin){ //Does the pin exist?
                System.out.println("true");
                /**************************/
                //Update table
                PreparedStatement update = con.prepareStatement("UPDATE checkingAccount SET " +
                 " balance = balance + '"+amount+"' WHERE pin= '"+pin+"' ");
                update.executeUpdate();
                System.out.println("updated table");
                return;
           }//end of if
        }//end of while
        System.out.println("pin not valid"); //Pin does not exist
        
    }catch(Exception e) {
        System.out.println(e);
    }//end of try/catch
}//end of deposit method

public static void withdrawal(int pin, double amount){
    try{
        Connection con = connect();

        //check the pin
        PreparedStatement post = con.prepareStatement("SELECT pin FROM checkingAccount");
        post.executeQuery();

        ResultSet result = post.getResultSet();
        //ArrayList<String> list = new ArrayList<String>();
        while(result.next()){
          // System.out.println( result.getString("pin") ); //Debugging
           if (Integer.parseInt(result.getString("pin")) == pin){ //Does the pin exist?
                System.out.println("true");
                /**************************/
                //Update table
                PreparedStatement update = con.prepareStatement("UPDATE checkingAccount SET " +
                 " balance = balance - '"+amount+"' WHERE pin= '"+pin+"' ");
                update.executeUpdate();
                System.out.println("updated table");
                return;
           }//end of if
        }//end of while
        System.out.println("pin not valid"); //Pin does not exist
        
    }catch(Exception e) {
        System.out.println(e);
    }//end of try/catch
}//end of deposit method



}//end of class

