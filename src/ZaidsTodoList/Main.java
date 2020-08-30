package ZaidsTodoList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
        primaryStage.setTitle("Todo List");
        primaryStage.setScene(new Scene(root, 900, 800));
        primaryStage.show();
        root.getStylesheets().add(getClass().getResource("Styless.css").toExternalForm());

    }


    public static void main(String[] args) {
        launch(args);
    }
}
