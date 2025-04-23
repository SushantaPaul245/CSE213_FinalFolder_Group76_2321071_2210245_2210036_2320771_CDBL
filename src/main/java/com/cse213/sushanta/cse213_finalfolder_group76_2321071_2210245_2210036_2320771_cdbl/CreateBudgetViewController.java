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

public class CreateBudgetViewController {

    @FXML
    private TableView<CreateBudget> budgetTableView;

    @FXML
    private TableColumn<CreateBudget, String> eventNameTableColumn;

    @FXML
    private TextField eventNameTextField;

    @FXML
    private TableColumn<CreateBudget, Integer> foodCostTableColumn;

    @FXML
    private TextField foodCostTextField;

    @FXML
    private TableColumn<CreateBudget, Integer> meterialsCostTableColumn;

    @FXML
    private TextField meterialsCostTextField;

    @FXML
    private TableColumn<CreateBudget, Integer> othersCostTableColumn;

    @FXML
    private TextField othersCostTextField;

    @FXML
    private TableColumn<CreateBudget, Integer> servicesCostTableColumn;

    @FXML
    private TextField servicesCostTextField;

    @FXML
    private TextArea totalCostTextArea;

    @FXML
    private TableColumn<CreateBudget, Integer> venueCostTableColumn;

    @FXML
    private TextField venueCostTextField;

    @FXML
    void addTableOnAction(ActionEvent event) {

    }

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
    void submitBudgetForApprovalOnAction(ActionEvent event) {

    }

    @javafx.fxml.FXML
    public void initialize() {
        eventNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("EventName"));
        venueCostTableColumn.setCellValueFactory(new PropertyValueFactory<>("VenueCost"));
        foodCostTableColumn.setCellValueFactory(new PropertyValueFactory<>("FoodCost"));
        meterialsCostTableColumn.setCellValueFactory(new PropertyValueFactory<>("MaterialsCost"));
        servicesCostTableColumn.setCellValueFactory(new PropertyValueFactory<>("ServicesCost"));
        othersCostTableColumn.setCellValueFactory(new PropertyValueFactory<>("OthersCost"));
    }


    }
