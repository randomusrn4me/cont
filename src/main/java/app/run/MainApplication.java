package app.run;

import app.view.FXMLControl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {



    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/effix.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Szam");
        stage.setScene(scene);
        stage.show();
        /*FXMLLoader loader = new FXMLLoader(MainApplication.class.getResource("/fxml/effix.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Szam");
        stage.setScene(scene);
        stage.show();*/

    }



    public static void main(String[] args) {
        launch(args);
    }

}
