package team3.mtms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginSystem {
    private String query;
    private String id;
    private String pw;
    private boolean admin;
    
    public boolean checkLogin() throws IOException {
        ResultSet rs = null;
        
        System.out.println("로그인을 진행해 주세요\n ID:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        id = br.readLine();
        System.out.println(id);
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = br.readLine();
        System.out.println(pw);
        br = new BufferedReader(new InputStreamReader(System.in));
        admin = Boolean.valueOf(br.readLine());
        System.out.println(admin);
        
        try {
            if (admin) {
                query = "SELECT * FROM admin WHERE admin_id = '" + id + "'";
                rs = DatabaseConnector.getInstance().getStatement().executeQuery(query);
                rs.next(); // 칼럼 받아오는 코드
                if (rs.getString("admin_pw").equals(pw)) {
                    // mypage 내 정보 추가 하기.
                    System.out.println(id + "관리자님 환영합니다.");
                } else {
                    return false;
                }
            }
            else if(!admin) {
                query = "SELECT * FROM user WHERE user_id = '" + id + "'";
                rs = DatabaseConnector.getInstance().getStatement().executeQuery(query);
                rs.next(); // 칼럼 받아오는 코드
                if (rs.getString("user_pw").equals(pw)) {
                    // mypage 내 정보 추가 하기.
                    System.out.println(id + "고객님 환영합니다.");
                } else {
                    return false;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
