
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

class ChessBoard extends Application {
    public void start(Stage primaryStage) throws IOException {
        Button ok = new Button("OK");
        Scene scene = new Scene(ok, 320, 240);
        primaryStage.setTitle("Hello!");
        primaryStage.setScene(scene);
        primaryStage.show();
        Stage stage = new Stage();
        Game g = new Game(true);
        g.gameStart();
    }


    public static void main(String[] args) {
        launch();
    }
}