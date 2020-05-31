package team3.mtms;

import java.io.IOException;
import java.sql.SQLException;
import movie.customer.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // 
        DatabaseConnector dbConnector = DatabaseConnector.getInstance();
        dbConnector.init();

        LoginSystem ls = new LoginSystem();
        ls.checkLogin();
    }
}