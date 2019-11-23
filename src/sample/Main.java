package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = new BorderPane();
        FXMLLoader listLoader = new FXMLLoader(getClass().getResource("listView.fxml"));
        root.setCenter(listLoader.load());
        ListController listController = listLoader.getController();


        FXMLLoader textLoader = new FXMLLoader(getClass().getResource("label.fxml"));
        root.setRight(textLoader.load());
        TextController textController = textLoader.getController();

        Model model = new Model();
        listController.initModel(model);
        textController.initModel(model);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
