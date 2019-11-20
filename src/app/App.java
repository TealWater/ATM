package app;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class App {
    public static void main(String[] args) throws Exception {
        // try{ //test 1
        //     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankAccounts", "root", "cookingG6");
        //     System.out.println("Hello");
        // }
        // catch(Exception e){
        //     System.out.println(e);
        //}

        //test 2
        // database.addAcct(0001, "John", "Deez","1200 Raceway Place", 5000.25);
        // database.addAcct(0002, "Mac", "Nutz","1250 Tradeway Place", 50000.25);


        //test 3
        //database.deposit(1, 500);

        //test 4
        database.withdrawal(1, 500);
    }
}