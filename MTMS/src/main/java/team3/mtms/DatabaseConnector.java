package team3.mtms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnector {
    private static final DatabaseConnector dbConnector = new DatabaseConnector();
    private static final String url = "jdbc:mysql://35.223.119.57:3306/testdb?useSSL=false";
    private static final String id = "root";
    private static final String pw = "root";
    private Connection conn = null;
    private Statement stmt = null;
    
    public boolean init(){   
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, id, pw);
            stmt = conn.createStatement();
            System.out.println("서버에 접속하셨습니다.");
            return true;
        }
        catch(ClassNotFoundException e){
            System.out.println("에러 : 드라이버 로딩 실패");
            return false;
        }
        catch(SQLException e){
            System.out.println("에러 : " + e);
            return false;
        }
    }
    
    public Statement getStatement() {
        return this.stmt;
    }
    
    public static DatabaseConnector getInstance() {
        return dbConnector;
    }
}
