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

public class ClientTransactionViewController {

    @FXML
    private TableColumn<?, ?> clientIDTableColumn;

    @FXML
    private TextField clientIDTextField;

    @FXML
    private TableColumn<?, ?> clientNameTableColumn;

    @FXML
    private TextField clientNameTextField;

    @FXML
    private TableView<?> clientTableView;

    @FXML
    private TableColumn<?, ?> numberOfSharesTableColumn;

    @FXML
    private TableColumn<?, ?> sharesPriceTableColumn;

    @FXML
    private ComboBox<?> sharesTypeComboBox;

    @FXML
    private TableColumn<?, ?> sharesTypeTableColumn;

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
    void searchOnAction(ActionEvent event) {

    }

}
