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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientTransactionViewController {

    @FXML
    private TableColumn<ClientTransaction,Integer> clientIDTableColumn;

    @FXML
    private TextField clientIDTextField;

    @FXML
    private TableColumn<ClientTransaction,String> clientNameTableColumn;

    @FXML
    private TextField clientNameTextField;

    @FXML
    private TableView<ClientTransaction> clientTableView;

    @FXML
    private TableColumn<ClientTransaction,Integer> numberOfSharesTableColumn;

    @FXML
    private TableColumn<ClientTransaction,Integer> sharesPriceTableColumn;

    @FXML
    private ComboBox<String> sharesTypeComboBox;

    @FXML
    private TableColumn<ClientTransaction,String> sharesTypeTableColumn;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Event Manager /Event Manager Dashboard-view.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    @FXML
    void searchOnAction(ActionEvent event) {

    }
    @FXML
    public void initialize() {
        sharesTypeComboBox.getItems().addAll("Buy", "Sell");

    }

}
