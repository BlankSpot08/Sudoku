package components;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Header implements SubComponent {
    private Pane mainPane;
    private Label title;

    public Header() {}

    @Override
    public Pane createMainPane() {
        mainPane = new Pane();

        mainPane.getChildren().add(createTitle());

        return mainPane;
    }

    private Label createTitle() {
        title = new Label("Sudoku");

        return title;
    }
}
