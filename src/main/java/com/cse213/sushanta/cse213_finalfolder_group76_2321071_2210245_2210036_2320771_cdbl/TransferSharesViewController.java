package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TransferSharesViewController {

    @FXML
    private TableColumn<?, ?> accountNameTableColumn;

    @FXML
    private TextField accountNameTextField;

    @FXML
    private TableColumn<?, ?> accountNumberTableColumn;

    @FXML
    private TextField accountNumberTextField;

    @FXML
    private TextArea commentTextArea;

    @FXML
    private TextField numberOfSharesTextField;

    @FXML
    private TableColumn<?, ?> sharesTableColumn;

    @FXML
    private TableView<?> transferSharesTableView;

    @FXML
    void backOnAction(ActionEvent event) {

    }

    @FXML
    void confirmOnAction(ActionEvent event) {

    }

}
