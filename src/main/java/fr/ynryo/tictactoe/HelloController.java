package fr.ynryo.tictactoe;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class HelloController {
    @FXML
    private VBox Main;

    @FXML
    private Label main_title;

    Font font = Font.loadFont(getClass().getResourceAsStream("/resources/fonts/Lexend.ttf"), 20);

    // Appliquer la police au label
        main_title.setFont(font);

}
