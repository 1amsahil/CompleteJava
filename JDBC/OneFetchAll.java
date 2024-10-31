package JDBC;
import java.sql.*;

public class OneFetchAll {
    public static void main(String[] args) throws Exception{

        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/BankDataBase";
        String user = "postgres";
        String pass = "9811";

        Connection con = DriverManager.getConnection(url,user,pass);
        System.out.println("Connection Established");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * From employee ;");

        while(rs.next())
        {
            System.out.print("Id : "+rs.getInt(1)+" ");
            System.out.print("First name : "+rs.getString(2)+", ");
            System.out.print("Last name : "+rs.getString(3)+", ");
            System.out.print("Email : "+rs.getString(4)+", ");
            System.out.print("Department : "+rs.getString(5)+", ");
            System.out.print("Salary : "+rs.getDouble(6)+", ");
            System.out.println("Joining Date : "+rs.getString(7));
        }

        con.close();
        System.out.println("Connection Closed");
    }
}
