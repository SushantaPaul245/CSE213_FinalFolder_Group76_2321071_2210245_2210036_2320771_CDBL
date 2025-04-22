package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class TransferSharesViewController {

    @FXML
    private TableColumn<TransferShares,String> accountNameTableColumn;

    @FXML
    private TextField accountNameTextField;

    @FXML
    private TableColumn<TransferShares,String> accountNumberTableColumn;

    @FXML
    private TextField accountNumberTextField;

    @FXML
    private TextArea commentTextArea;

    @FXML
    private TextField numberOfSharesTextField;

    @FXML
    private TableColumn<TransferShares,String> sharesTableColumn;

    @FXML
    private TableView<TransferShares> transferSharesTableView;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ClientDashboard-view.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    @FXML
    void confirmOnAction(ActionEvent event) {

    }

    @FXML
    public void initialize() {
        accountNumberTableColumn.setCellValueFactory(new PropertyValueFactory<>("AccountNumber"));
        accountNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("AccountName"));
        sharesTableColumn.setCellValueFactory(new PropertyValueFactory<>("Shares"));

    }



}
