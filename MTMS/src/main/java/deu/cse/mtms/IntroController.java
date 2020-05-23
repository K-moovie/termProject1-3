package deu.cse.mtms;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class IntroController implements Initializable {

    @FXML
    Button butt_main;

    @FXML
    AnchorPane intro_stage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        intro_stage.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    System.out.println("Clicked ME!!");
                    Stage stage = (Stage) intro_stage.getScene().getWindow();

                    Parent login = null;
                    login = FXMLLoader.load(getClass().getResource("LoginView.fxml"));

                    Scene scene = new Scene(login);

                    stage.setScene(scene);

                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
