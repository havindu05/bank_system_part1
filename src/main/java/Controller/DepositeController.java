package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DepositeController {

    @FXML
    private TextField txtCashPrice;

    @FXML
    private TextField txtMoneyShow;

    public String getDepositAmount() {
        return txtCashPrice.getText();
    }

    public void initialize() {
        txtMoneyShow.setText("Account Balance - Rs:250,000.00");
        txtMoneyShow.setEditable(false);
    }

    @FXML
    void btnDeposite(ActionEvent event) {
        try {

            double depositAmount = Double.parseDouble(txtCashPrice.getText());
            if (depositAmount <= 0) {
                showAlert("Enter a valid amount!");
                return;
            }

            String currentText = txtMoneyShow.getText().replaceAll("[^0-9.]", "");
            double currentBalance = Double.parseDouble(currentText);


            double newBalance = currentBalance + depositAmount;

            txtMoneyShow.setText("Account Balance - Rs:" + String.format("%,.2f", newBalance));

            txtCashPrice.clear();

            showAlert("Deposit Successful!");

        } catch (NumberFormatException e) {
            showAlert("Enter a valid number!");
        }
    }

    @FXML
    void btnCancel(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/HomePage.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Home Page");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
