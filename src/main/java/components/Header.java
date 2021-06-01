package components;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Header implements SubComponent {
    private BorderPane mainPane;
    private Label title;

    public Header() {  }

    @Override
    public Pane createMainPane() {
        mainPane = new BorderPane();

        mainPane.setId("title");
        mainPane.setCenter(createTitle());

        return mainPane;
    }

    private Label createTitle() {
        title = new Label("Sudoku");
        title.setAlignment(Pos.CENTER);
        title.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 50));

        return title;
    }
}
