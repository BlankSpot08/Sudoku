package components;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Header implements SubComponent {
    private Pane mainPane;
    private Label title;

    public Header() {  }

    @Override
    public Pane createMainPane() {
        mainPane = new Pane();

        mainPane.setId("title");
        mainPane.getChildren().add(createTitle());

        return mainPane;
    }

    private Label createTitle() {
        title = new Label("Sudoku");

        return title;
    }
}
