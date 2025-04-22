package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BuySharesViewController {

    @FXML
    private TableView<?> buySharesTableView;

    @FXML
    private TextArea commentTextArea;

    @FXML
    private TextField expectPerSharesPriceTextField;

    @FXML
    private TextField numberOfSharesTextField;

    @FXML
    private TableColumn<?, ?> priceTableColumn;

    @FXML
    private TableColumn<?, ?> sharesTableColumn;

    @FXML
    private TextArea totalNumberOfSharesTextArea;

    @FXML
    private TextArea totalSharesPriceTextArea;

    @FXML
    void addTableOnAction(ActionEvent event) {

    }

    @FXML
    void backOnAction(ActionEvent event) {

    }

}
