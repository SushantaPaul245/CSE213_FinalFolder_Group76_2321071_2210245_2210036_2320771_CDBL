package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewEmployeeListView {

    @FXML
    private ComboBox<?> departmentComboBox;

    @FXML
    private TableColumn<?, ?> departmentTableColumn;

    @FXML
    private TableView<?> employeeTableView;

    @FXML
    private TableColumn<?, ?> idTableColumn;

    @FXML
    private TextField idTextField;

    @FXML
    private TableColumn<?, ?> nameTableColumn;

    @FXML
    private TextField nameTextField;

    @FXML
    private ComboBox<?> positionComboBox;

    @FXML
    private TableColumn<?, ?> positionTableColumn;

    @FXML
    void returnToDashboardOnAction(ActionEvent event) {

    }

    @FXML
    void searchOnAction(ActionEvent event) {

    }

}
