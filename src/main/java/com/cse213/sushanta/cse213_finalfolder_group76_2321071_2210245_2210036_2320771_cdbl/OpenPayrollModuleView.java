package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class OpenPayrollModuleView {

    @FXML
    private TableColumn<?, ?> baseTableColumn;

    @FXML
    private TableColumn<?, ?> bonusTableColumn;

    @FXML
    private ComboBox<?> departmentComboBox;

    @FXML
    private TableColumn<?, ?> iDTableColumn;

    @FXML
    private TextField iDTextField;

    @FXML
    private ComboBox<?> monthComboBox;

    @FXML
    private TableColumn<?, ?> nameTableColumn;

    @FXML
    private TextField nameTextField;

    @FXML
    private TableView<?> payrollTableView;

    @FXML
    private TableColumn<?, ?> totalTableColumn;

    @FXML
    void downloadOnAction(ActionEvent event) {

    }

    @FXML
    void returntoDashboardOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HRManagerDashboard-view.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

}
