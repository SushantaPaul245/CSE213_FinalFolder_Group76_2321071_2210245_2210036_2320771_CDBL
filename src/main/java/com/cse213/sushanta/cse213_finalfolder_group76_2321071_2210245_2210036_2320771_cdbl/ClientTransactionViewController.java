package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    void backOnAction(ActionEvent event) {

    }

    @FXML
    void searchOnAction(ActionEvent event) {

    }

}
