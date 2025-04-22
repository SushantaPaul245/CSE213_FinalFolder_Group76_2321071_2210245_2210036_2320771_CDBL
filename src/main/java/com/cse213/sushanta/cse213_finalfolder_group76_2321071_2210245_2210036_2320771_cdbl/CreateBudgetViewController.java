package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CreateBudgetViewController {

    @FXML
    private TableView<?> budgetTableView;

    @FXML
    private TableColumn<?, ?> eventNameTableColumn;

    @FXML
    private TextField eventNameTextField;

    @FXML
    private TableColumn<?, ?> foodCostTableColumn;

    @FXML
    private TextField foodCostTextField;

    @FXML
    private TableColumn<?, ?> meterialsCostTableColumn;

    @FXML
    private TextField meterialsCostTextField;

    @FXML
    private TableColumn<?, ?> othersCostTableColumn;

    @FXML
    private TextField othersCostTextField;

    @FXML
    private TableColumn<?, ?> servicesCostTableColumn;

    @FXML
    private TextField servicesCostTextField;

    @FXML
    private TextArea totalCostTextArea;

    @FXML
    private TableColumn<?, ?> venueCostTableColumn;

    @FXML
    private TextField venueCostTextField;

    @FXML
    void addTableOnAction(ActionEvent event) {

    }

    @FXML
    void backOnAction(ActionEvent event) {

    }

    @FXML
    void submitBudgetForApprovalOnAction(ActionEvent event) {

    }

}
