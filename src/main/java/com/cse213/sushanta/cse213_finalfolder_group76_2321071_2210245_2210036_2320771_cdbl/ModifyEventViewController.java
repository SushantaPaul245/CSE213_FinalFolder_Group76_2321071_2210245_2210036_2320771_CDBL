package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ModifyEventViewController {

    @FXML
    private TextArea changedescriptionTextArea;

    @FXML
    private TextArea commentTextArea;

    @FXML
    private DatePicker modifyEventDatePicker;

    @FXML
    private TextField modifyEventNameTextField;

    @FXML
    private TextField modifyFinishingTimeTextField;

    @FXML
    private TextField modifyStartingTimeTextField;

    @FXML
    private TextField modifyVenueTextField;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EventManagerDashboard-view.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void modifyAndSaveOnAction(ActionEvent event) {

    }

}
