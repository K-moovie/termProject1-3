package team3.mtms;

import movie.manage.MovieManage;
import movie.customer.*;
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
        
        System.out.println("로그인을 진행해 주세요\n아이디를 입력해주세요.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        id = br.readLine();
        if(id.matches("^ad.*$")) // 관리자 아이디는 ad로 시작하므로 정규표현식을 사용하여 admin 여부를 판단한다. 
            admin = true;
        System.out.println("비밀번호를 입력해주세요.");
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = br.readLine();
        try {
            if (admin) {
                query = "SELECT * FROM admin WHERE admin_id = '" + id + "'";
                rs = DatabaseConnector.getInstance().getStatement().executeQuery(query);
                rs.next(); // 칼럼 받아오는 코드
                if (rs.getString("admin_pw").equals(pw)) {
                    // mypage 내 정보 추가 하기
                    System.out.println(id + " 관리자님 환영합니다.");
                    MovieManage movieManage = new MovieManage();
                    movieManage.menu();
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
                    MyInformation.getInsetance().setMyInformation(rs.getString("user_id"), rs.getString("name"), rs.getString("rating"), rs.getString("phone_num"), rs.getInt("age"));
                    CustomerMenu customerMenu = new CustomerMenu();
                    customerMenu.menu();
                } else {
                    return false;
                }
            }

        } catch (SQLException e) {
            System.out.println("올바른 ID, PW가 아닙니다. 다시 로그인해 주세요.");
            return false;
        }
        return true;
    }
}
