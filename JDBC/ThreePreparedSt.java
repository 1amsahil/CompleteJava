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

        System.out.print("Id : ");
        int id = sc.nextInt();

        System.out.print("Name : ");
        String name = sc.next();

        System.out.print("Marks : ");
        double marks = sc.nextDouble();

        PreparedStatement ps = con.prepareStatement("Insert into student Values (?,?,?) ;");
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setDouble(3,marks);

        ps.execute();

        con.close();

    }
}
