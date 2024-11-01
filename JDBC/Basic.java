// Java DataBase Connectivity :-
// JDBC is an API(Application programming interface) used in Java programming to interact with databases. The classes and interfaces of JDBC allow the application to send requests made by users to the specified database
package JDBC;

import java.sql.*;

public class Basic {

    public static void main(String[] args) throws Exception {

//            1. import packages
//            2. load and register
//            3. create connection
//            4. create statement
//            5. execute statement
//            6. process the result
//            7. close

        Class.forName("org.postgresql.Driver");

        String url ="jdbc:postgresql://localhost:5432/BankDataBase";
        String user = "postgres";
        String pass = "9811";

        Connection con  = DriverManager.getConnection(url,user,pass);
        System.out.println("Connection Established");

        Statement st =  con.createStatement();
        ResultSet rs = st.executeQuery("Select fname From employee where id = 5 ;");
        rs.next();

        String result = rs.getString("fname");
        System.out.println("First Name : "+result);

        con.close();
        System.out.println("Connection Closed");

    }
}
