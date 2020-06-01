package movie.customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import team3.mtms.DatabaseConnector;

public class PromotionList extends Subject {

    private int count = -1; // 알림 갯수를 저장하는 변수
    private ResultSet rs = null;
    private String query = null;
    private String content = null;
    
    public PromotionList() throws SQLException {
        observers = new LinkedList<>();
        setPromotionCount(); // 초기 알림 값 설정
    }
    
    public void setPromotionCount() throws SQLException {
        query = "SELECT COUNT(*) FROM promotion"; //
        try {
            rs = DatabaseConnector.getInstance().getStatement().executeQuery(query);
            if(rs.next()) { // count를 올바르게 불러왔을 때
                if(count < rs.getInt(1)){
                    count = rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getPromotionCount() throws SQLException {
        query = "SELECT COUNT(*) FROM promotion"; //
        try {
            rs = DatabaseConnector.getInstance().getStatement().executeQuery(query);
            if(rs.next()) { // count를 올바르게 불러왔을 때
                if(count < rs.getInt(1)){
                    count = rs.getInt(1);
                    System.out.println("count: " + count);
                    getPromotion(count);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void getPromotion(int index) {
        query = "SELECT content FROM promotion WHERE promotion_num=" + index;
        try {
            rs = DatabaseConnector.getInstance().getStatement().executeQuery(query);
            if(rs.next()) { // 내용을 올바르게 불러왔을 때 
                content = rs.getString("content");
                notifyObservers();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        observers.forEach((observer) -> {
            observer.update(content);
        });
    }
}