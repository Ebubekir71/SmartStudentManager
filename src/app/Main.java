package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/main.fxml"));
        Parent root = loader.load();


        stage.setScene(new Scene(root, 400, 300));
        stage.setTitle("Smart Student Manager");
        stage.show();
    }

    public static void main(String[] args)  {
        launch(args);

    }
}