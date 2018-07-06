import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
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

        //Callable Statement
//        CallableStatement clstmnt = connection.prepareCall("{call MYSP1(?,?)}");
//        String input = "USA";
//        clstmnt.setString(1,input);
//
//        ResultSet rst = clstmnt.executeQuery();
//        int count = clstmnt.getInt(2);
//        rst.first();
//        while (rst.next()){
//            System.out.println(rst.getString("Name"));
//        }
//        System.out.printf(" Total Number Of cities in %s Are %d " ,input , count);
        //get access to db metadadta
//        DatabaseMetaData dnmt = connection.getMetaData();
//        System.out.println(dnmt.getDriverName());
          //write blob

        try {

            //write BLOB
//            PreparedStatement pstmnt = connection.prepareStatement("update city set resume = ? where id = '1'");
//            File file = new File("C:\\workspace.xml");
//            FileInputStream fis = new FileInputStream(file);
//            pstmnt.setBinaryStream(1,fis);
//            pstmnt.executeUpdate();
//            fis.close();

            //read blob

            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("Select *  from city where id = '1'");
            rs.first();
            File file = new File ("d:\\a.xml");
            FileOutputStream fos = new FileOutputStream(file);

            InputStream is = rs.getBinaryStream("resume");
            byte[] buffer = new byte[1024];
            while (is.read(buffer) >0 )
                fos.write(buffer);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
}
