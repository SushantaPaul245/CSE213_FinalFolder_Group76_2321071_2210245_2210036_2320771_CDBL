package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}