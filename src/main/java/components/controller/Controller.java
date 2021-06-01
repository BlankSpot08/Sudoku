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
        VBox mainPane = new VBox(5);

        mainPane.getChildren().addAll(createNumberCommands(), createNewGameButton(), createGiveUpButton());

        return mainPane;
    }

    private GridPane createNumberCommands() {
        GridPane gridPane = new GridPane();
        gridPane.setId("numpad");

        gridPane.setHgap(5);
        gridPane.setVgap(5);

        int number = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++, number++) {
                Button button = new Button(String.valueOf(number));
                button.setPrefHeight(98);
                button.setPrefWidth(98);

                gridPane.add(button, j, i);
            }
        }

        return gridPane;
    }

    private Button createNewGameButton() {
        Button newGame = new Button("New Game");
        newGame.setId("new-game-button");

        newGame.setPrefHeight(75);
        newGame.setPrefWidth(303);

        newGame.setOnAction(e -> {
            board.createNewBoard();
        });

        return newGame;
    }

    private Button createGiveUpButton() {
        Button giveUp = new Button("Give Up");
        giveUp.setId("give-up-button");

        giveUp.setPrefHeight(75);
        giveUp.setPrefWidth(303);

        giveUp.setOnAction(e -> {
            board.giveUp();
        });

        return giveUp;
    }
}
