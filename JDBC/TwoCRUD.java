package JDBC;
import java.sql.*;
import java.util.Scanner;

public class TwoCRUD {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/JDBC";
        String user = "postgres";
        String pass = "9811";

        Connection con = DriverManager.getConnection(url,user,pass);
        System.out.println("Connection Established");

        Statement st = con.createStatement();

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\nPress :- \n'1' Insert Data \n'2' Read Data \n'3' Update Data \n'4' Delete Data \nPress '0' for Exit");
            System.out.print("\nEnter : ");
            int val = sc.nextInt();

            if(val == 0)
            {
                break;
            }
            else if(val == 1)
            {
                System.out.println("\nInsert Data ");
                System.out.print("Enter Id : ");
                int id = sc.nextInt();

                System.out.print("Enter Name : ");
                String name = sc.next();

                System.out.print("Enter Marks : ");
                double marks = sc.nextDouble();

                st.execute("Insert into student Values("+id+" , '"+name+"' , "+marks+") ;");
            }
            else if(val == 2)
            {
                System.out.println("\nRead Data ");
                ResultSet rs = st.executeQuery("Select * From student ;");
                while(rs.next())
                {
                    System.out.println("Id : "+ rs.getInt(1)+", Name : "+rs.getString(2)+", Marks : "+rs.getDouble(3));
                }
            }

            else if(val ==3)
            {
                System.out.println("\nUpdate Data");
                System.out.println("Press :- \n'1' Update ID \n'2' Update Name \n'3' Update Marks");
                System.out.print("\nEnter : ");
                int opt = sc.nextInt();

                if(opt == 1)
                {
                    System.out.print("Enter Id : ");
                    int id = sc.nextInt();

                    System.out.print("Enter Updated Id : ");
                    int uid = sc.nextInt();

                    st.execute("Update student Set id = "+uid+" Where id = "+id+";");
                }
                else if(opt == 2)
                {
                    System.out.print("Enter Id : ");
                    int id = sc.nextInt();

                    System.out.print("Enter Updated Name : ");
                    String uname = sc.next();

                    st.execute("Update student Set name = '"+uname+"' Where id = "+id+";");
                }
                else
                {
                    System.out.print("Enter Id : ");
                    int id = sc.nextInt();

                    System.out.print("Enter Updated Marks : ");
                    double um = sc.nextDouble();

                    st.execute("Update student Set marks = "+um+" Where id = "+id+";");
                }


            }

            else if(val == 4)
            {
                System.out.println("\nDelete Data");

                System.out.print("Enter the Id : ");
                int id = sc.nextInt();

                st.execute("Delete From student Where id = "+id+" ;");

                System.out.println("Successfully Delete");
            }

            else
            {
                System.out.println("\nPlease Enter a Valid Number ");
            }

            System.out.println();
        }

        sc.close();
        con.close();
        System.out.println("Connection Close");

    }
}
