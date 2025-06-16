package lab13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test {
    public static void main(String[] args){
        String url = "jdbc:postgresql://localhost:5432/FPP";
        String uname = "postgres"; // Username - Common
        String pass = "postgres"; // Password you created

        String query = "select * from person";

        try (Connection con = DriverManager.getConnection(url,uname,pass);) {

            System.out.println("Connection Success");
            PreparedStatement ps = con.prepareStatement(query);

            System.out.println( ps.executeQuery());


        }
        catch (SQLException e) {
                throw new RuntimeException(e);
        }
    }
}
