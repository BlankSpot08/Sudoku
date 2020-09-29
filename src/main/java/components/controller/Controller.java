package components.controller;

import components.SubComponent;
import components.board.Board;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Controller implements SubComponent {
    private final Board board;

    public Controller(Board board) {
        this.board = board;
    }
    @Override
    public Pane createMainPane() {
        VBox mainPane = new VBox();

        mainPane.getChildren().addAll(createNumberCommands(), createCommands());

        return mainPane;
    }

    private GridPane createNumberCommands() {
        GridPane gridPane = new GridPane();

        int number = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++, number++) {
                gridPane.add(new Button(String.valueOf(number)), j, i);
            }
        }

        return gridPane;
    }

    private GridPane createCommands() {
        GridPane gridPane = new GridPane();

        Button newGame = new Button("New Game");
        newGame.setOnAction(e -> {
            board.createNewBoard();
        });

        Button giveUp = new Button("Give Up");
        giveUp.setOnAction(e -> {
            board.giveUp();
        });

        gridPane.add(newGame, 0, 0);
        gridPane.add(giveUp,  1, 0);

        return gridPane;
    }
}
