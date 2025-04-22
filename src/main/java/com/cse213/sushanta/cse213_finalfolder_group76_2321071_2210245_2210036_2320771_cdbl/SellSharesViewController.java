package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SellSharesViewController {

    @FXML
    private TextArea commentTextArea;

    @FXML
    private TextField numberOfSharesTextField;

    @FXML
    private TextField perSharesPriceTextField;

    @FXML
    private TableColumn<?, ?> priceTableColumn;

    @FXML
    private TableView<?> sellSharesTableView;

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
