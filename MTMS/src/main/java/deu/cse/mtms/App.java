package deu.cse.mtms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("IntroView"));
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    /// 정대겸 테스트 파일 ///
    public static void main(String[] args) {
         if(DatabaseConnector.getInstance().init());
        {
            System.setProperty("prism.lcdtext", "false");
            System.setProperty("prism.text", "t2k");
            launch(args);
        }
        launch();
    }
}