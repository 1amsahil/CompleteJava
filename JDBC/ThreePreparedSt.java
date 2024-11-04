package JDBC;
import java.sql.*;
import java.util.Scanner;

public class ThreePreparedSt {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:postgresql://localhost:5432/JDBC";
        String user = "postgres";
        String pass = "9811";

        Connection con = DriverManager.getConnection(url,user,pass);
        System.out.println(" Connection Established ");

        System.out.println("Id : ");
        int id = sc.nextInt();

        System.out.println("Name : ");
        String name = sc.nextLine();

        System.out.println("Marks : ");
        double marks = sc.nextDouble();

        PreparedStatement ps = con.prepareStatement("Insert into student Values (?,?,?) ;");


    }
}
