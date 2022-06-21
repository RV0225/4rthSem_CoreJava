package Unit_05;

import java.sql.*;

public class Sampleclass {
    public static void main(String[] args) throws SQLException {
    Connection myConn = null;
    Statement myStmt = null;
    ResultSet myRs = null;
    try {
    myConn =
    DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDatabase
    ", "root" , "root@123");
    myStmt = myConn.createStatement();
    int a = myStmt.executeUpdate("INSERT INTO jdbc_tbl VALUES (5, 'Mysql',
    'Akbar', '2021-02-18')");
    myRs = myStmt.executeQuery("select * from jdbc_tbl");
    05/06/2022, 10:36 OneNote
    https://onedrive.live.com/redir?resid=C31BA4CEE57E1260%21520&page=Edit&wd=target%282nd Year %28Hill%5C%29.one%7C2e13a09b-dcc6-444e-9cb3… 4/4
    while (myRs.next()) {
    System.out.println(myRs.getString("jdbc_id") + ", " +
    myRs.getString("title") + ", " + myRs.getString("author") + ", " +
    myRs.getString("submission_date"));
    }
    }
    catch (Exception exc) {
    exc.printStackTrace();
    }
    finally {
    myRs.close();
    myStmt.close();
    myConn.close();
    }
    }
}
