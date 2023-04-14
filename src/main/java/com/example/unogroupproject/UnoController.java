package com.example.unogroupproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UnoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onUnoButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onRedButtonClick() {  }

    @FXML
    protected void onBlueButtonClick() {}

    @FXML
    protected void onGreenButtonClick() {}

    @FXML
    protected void onYellowButtonClick() {}

    @FXML
    protected void onGetHelpClick() {}

    @FXML
    protected void onQuitClick() {}
}