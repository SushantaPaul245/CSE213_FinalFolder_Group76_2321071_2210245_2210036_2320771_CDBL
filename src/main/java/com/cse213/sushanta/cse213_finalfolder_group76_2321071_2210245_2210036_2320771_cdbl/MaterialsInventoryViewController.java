package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    void returnToDashboardOnAction(ActionEvent event) {

    }

    @FXML
    void searchOnAction(ActionEvent event) {

    }

}
