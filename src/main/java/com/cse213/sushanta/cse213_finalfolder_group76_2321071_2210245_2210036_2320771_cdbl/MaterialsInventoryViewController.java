package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MaterialsInventoryViewController {

    @FXML
    private TableColumn<?, ?> itemNameTableColumn;

    @FXML
    private SplitMenuButton itemTypeComboBox;

    @FXML
    private TableColumn<?, ?> itemTypeTableColumn;

    @FXML
    private TableView<?> materialsInventoryTableView;

    @FXML
    private TableColumn<?, ?> quantityAvailableTableColumn;

    @FXML
    private TextField storageLocationTextField;

    @FXML
    private SplitMenuButton supplierComboBox;

    @FXML
    private TableColumn<?, ?> supplierLocationTableColumn;

    @FXML
    void returnToDashboardOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HRManagerDashboard-view.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    void searchOnAction(ActionEvent event) {

    }

}
