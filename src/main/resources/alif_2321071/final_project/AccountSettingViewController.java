package alif_2321071.alif_2321071;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AccountSettingViewController {

    @FXML
    private TextArea commentTextArea;

    @FXML
    private TextField confirmPasswordTextField;

    @FXML
    private TextField currentPasswordTextField;

    @FXML
    private TextField newPasswordTextField;

    @FXML
    void backOnActionB(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ClientDashboard-view.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    @FXML
    void changePasswordOnActionCP(ActionEvent event) {

    }

}
