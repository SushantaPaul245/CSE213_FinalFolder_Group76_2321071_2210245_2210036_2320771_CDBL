package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddNewEmployeeView {

    @FXML
    private TextField adressTextField;

    @FXML
    private TextField contactnumberTextField;

    @FXML
    private ComboBox<?> departmentComboBox;

    @FXML
    private TextField emplyeeIdTextField;

    @FXML
    private DatePicker joiningDateDatePicker;

    @FXML
    private TextField nameTextField;

    @FXML
    void SaveOnAction(ActionEvent event) {

    }

    @FXML
    void returnToDashboardOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HRManagerDashboard-view.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

}
