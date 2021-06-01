package components.board;

import components.SubComponent;
import utilities.Sudoku;
import javafx.beans.property.IntegerProperty;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import utilities.difficulty.Difficulty;

public class Board implements SubComponent {
    private final Sudoku sudokuGenerator = new Sudoku();

    private final Difficulty difficulty;
    private IntegerProperty[][][] sudoku;
    private Button[][][] board;

    public Board(Difficulty difficulty) {
        this.difficulty = difficulty;

        sudoku = sudokuGenerator.generate();

        sudokuGenerator.print(sudoku);
    }

    @Override
    public Pane createMainPane() {
        Pane mainPane = new Pane();

        mainPane.getChildren().add(createSudokuBoard());

        return mainPane;
    }

    private GridPane createSudokuBoard() {
        GridPane outerPane = new GridPane();
        outerPane.setId("sudoku");

        board = createBoard();

        GridPane[][] innerBoardPane = createInnerBoardPane();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                outerPane.add(innerBoardPane[i][j], j, i);
            }
        }

        return outerPane;
    }

    private GridPane[][] createInnerBoardPane() {
        final GridPane[][] innerBoardPane = new GridPane[3][3];

        for (int i = 0; i < innerBoardPane.length; i++) {
            for (int j = 0; j < innerBoardPane[i].length; j++) {
                innerBoardPane[i][j] = new GridPane();
                innerBoardPane[i][j].setId("3x3-inner");

                for (int k = 0, z = j; k < 3; k++, z+=3) {
                    for (int l = 0; l < 3; l++) {
                        innerBoardPane[i][j].add(board[i][z][l], l, k);
                    }
                }
            }
        }

        return innerBoardPane;
    }

    private Button[][][] createBoard() {
        Button[][][] board = new Button[3][9][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                for (int k = 0; k < board[i][j].length; k++) {
                    board[i][j][k] = new Button();
                    board[i][j][k].setPrefWidth(72);
                    board[i][j][k].setPrefHeight(72);

                    final int finalI = i;
                    final int finalJ = j;
                    final int finalK = k;

                    board[i][j][k].setOnKeyReleased(e -> {
                        String input = e.getText();
                        if (checkIfInputIsDigit(input)) {
                            board[finalI][finalJ][finalK].setText(input);
                        }
                    });

                    if (difficulty.getAPassNumber()) {
                        board[i][j][k].setText(String.valueOf(sudoku[i][j][k].get()));
                    }
                }
            }
        }

        return board;
    }

    public Button[][][] giveUp() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                for (int k = 0; k < board[i][j].length; k++) {
                    board[i][j][k].setText(String.valueOf(sudoku[i][j][k].get()));
                }
            }
        }

        return board;
    }

    public Button[][][] createNewBoard() {
        sudoku = sudokuGenerator.generate();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                for (int k = 0; k < board[i][j].length; k++) {
                    board[i][j][k].setText("");
                    if (difficulty.getAPassNumber()) {
                        board[i][j][k].setText(String.valueOf(sudoku[i][j][k].get()));
                    }
                }
            }
        }

        return board;
    }

    private boolean checkIfInputIsDigit(String input) {
        return input.matches("[0-9]");
    }
}