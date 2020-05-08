module deu.cse.mtms {
    requires javafx.controls;
    requires javafx.fxml;

    opens deu.cse.mtms to javafx.fxml;
    exports deu.cse.mtms;
}