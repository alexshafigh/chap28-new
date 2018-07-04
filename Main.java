import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
	// write your code here
//        System.out.println("salam");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/world","root" , "123456789");
        //Statement
//        Statement stmnt = connection.createStatement();
//        ResultSet rst = stmnt.executeQuery("select * from city where CountryCode = 'USA'");

        //Prepared Statement

//        PreparedStatement pstmnt = connection.prepareStatement("select * from city where CountryCode = ?");
//        pstmnt.setString(1,"IRN");
//        ResultSet rst = pstmnt.executeQuery();
//        rst.first();
//        System.out.printf(" The Name Of Cities in %s Are \n" , rst.getString("CountryCode") );

//        while (rst.next()){
//            System.out.println(rst.getString("Name"));
//        }
    }
}
