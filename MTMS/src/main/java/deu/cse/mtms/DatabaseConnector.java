/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.mtms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LG
 */
public class DatabaseConnector {
    private static final DatabaseConnector dbConnector = new DatabaseConnector();
    private static final String url = "jdbc:mysql://35.223.119.57:3306/testdb";
    private static final String id = "root";
    private static final String pw = "root";
    private Connection conn = null;
    private Statement stmt = null;
    
    public boolean init(){   
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //jdbc:mysql://35.223.119.57:3306/testdb?characterEncoding=utf8&amp;useSSL=false&amp;autoReconnection=true
            //jdbc:mysql://35.223.119.57:3306/testdb
            //String url = "jdbc:mysql://35.223.119.57:3306/testdb?characterEncoding=utf8&amp;useSSL=false&amp;autoReconnection=true";
            conn = DriverManager.getConnection(url, id, pw);
            stmt = conn.createStatement();
            System.out.println("연결 성공");
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
