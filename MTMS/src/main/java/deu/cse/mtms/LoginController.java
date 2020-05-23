package deu.cse.mtms;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.scene.layout.AnchorPane;

public class LoginController implements Initializable {

    @FXML
    private AnchorPane login_stage;
    @FXML
    private TextField field_id;
    @FXML
    private PasswordField field_pw;
    @FXML
    private Button butt_login;
    @FXML
    private CheckBox check_admin;
    private LoginModel loginModel = new LoginModel();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        butt_login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (loginModel.checkLogin(field_id.getText(), field_pw.getText(), check_admin.isSelected())) {
                    System.out.println("로그인 성공");
                }
                else {
                    System.out.println("로그인 실패");
                }
            }
        });
    }

}
