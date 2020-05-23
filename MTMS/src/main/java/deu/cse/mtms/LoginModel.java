package deu.cse.mtms;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {

    private String query;

    public boolean checkLogin(String id, String pw, Boolean admin) {
        ResultSet rs = null;
        try {
            if (admin) {
                query = "SELECT * FROM admin WHERE admin_id = '" + id + "'";
                rs = DatabaseConnector.getInstance().getStatement().executeQuery(query);
                rs.next(); // 칼럼 받아오는 코드
                if (rs.getString("admin_pw").equals(pw)) {
                    // mypage 내 정보 추가 하기.
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
