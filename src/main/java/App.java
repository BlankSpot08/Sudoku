import components.board.Board;
import components.Header;
import components.SubComponent;
import components.controller.Controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import utilities.difficulty.Easy;

public class App extends Application {
    private BorderPane mainPane;
    private Scene mainScene;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) {
        window.setScene(createScene(window));
        window.setTitle("Sudoku");
        window.setResizable(false);
        window.centerOnScreen();
        window.show();
    }

    private Scene createScene(Stage window) {
        mainPane = new BorderPane();

        SubComponent header = new Header();
        mainPane.setTop(header.createMainPane());

        Board board = new Board(new Easy());
        mainPane.setLeft(board.createMainPane());

        Controller controller = new Controller(board);
        mainPane.setRight(controller.createMainPane());

        mainScene = new Scene(mainPane);
//        mainScene.getStylesheets().add(getClass().getResource("Choo.css").toString());

        return mainScene;
    }
}
