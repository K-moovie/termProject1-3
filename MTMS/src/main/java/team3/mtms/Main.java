package team3.mtms;

public class Main {

    public static void main(String[] args) {
        // 
        DatabaseConnector dbConnector = DatabaseConnector.getInstance();
        dbConnector.init();
        
        LoginSystem ls = new LoginSystem();
        ls.checkLogin();
    }
}
