module deu.cse.mtms {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql; // 추가
    
    opens deu.cse.mtms to javafx.fxml;
    exports deu.cse.mtms;
}