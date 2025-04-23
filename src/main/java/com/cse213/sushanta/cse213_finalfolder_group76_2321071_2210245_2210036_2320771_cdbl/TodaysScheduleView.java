package com.cse213.sushanta.cse213_finalfolder_group76_2321071_2210245_2210036_2320771_cdbl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TodaysScheduleView {

    @FXML
    private TableColumn<?, ?> employeeTableColumn;

    @FXML
    private TextField employeeTextField;

    @FXML
    private TableColumn<?, ?> timeTableColumn;

    @FXML
    private TextField timeTextField;

    @FXML
    private TableView<?> todaysScheduleTableView;

    @FXML
    private TableColumn<?, ?> visitorNameTableColumn;

    @FXML
    private TextField visitorNameTextField;

    @FXML
    void refreshOnAction(ActionEvent event) {

    }

}
