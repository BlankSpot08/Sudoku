import components.AlertBox;
import components.board.Board;
import components.Header;
import components.SubComponent;
import components.controller.Controller;

import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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

        window.setOnCloseRequest(e -> {
            e.consume();

            closeProgram(window);
        });

        window.getIcons().add(new Image("/Sudoku.png"));

        window.show();
    }

    public Scene createScene(Stage window) {
        mainPane = new BorderPane();

        SubComponent header = new Header();
        mainPane.setTop(header.createMainPane());

        mainPane.setCenter(createCenterMainPane());

        mainScene = new Scene(mainPane, 1000, 750);
        mainScene.getStylesheets().add("Choo.css");

        return mainScene;
    }

    public HBox createCenterMainPane() {
        HBox hBox = new HBox(25);

        Board board = new Board(new Easy());

        Controller controller = new Controller(board);

        hBox.getChildren().addAll(board.createMainPane(), controller.createMainPane());

        return hBox;
    }

    private void closeProgram(Stage window) {
        AlertBox alertBox = new AlertBox(window.getX(), window.getY(), window.getHeight(), window.getWidth());

        BooleanProperty answer = alertBox.display("Exit Program", "Are you sure?");

        if (answer.getValue()) {
            window.close();
        }
    }
}
