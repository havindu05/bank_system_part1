package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

public class PinNumberController {

    @FXML
    private PasswordField txtPinNUmber;

    @FXML
    void btn0(ActionEvent event) {
        txtPinNUmber.appendText("0");
    }

    @FXML
    void btn1(ActionEvent event) {
        txtPinNUmber.appendText("1");
    }

    @FXML
    void btn2(ActionEvent event) {
        txtPinNUmber.appendText("2");
    }

    @FXML
    void btn3(ActionEvent event) {
        txtPinNUmber.appendText("3");
    }

    @FXML
    void btn4(ActionEvent event) {
        txtPinNUmber.appendText("4");
    }

    @FXML
    void btn5(ActionEvent event) {
        txtPinNUmber.appendText("5");
    }

    @FXML
    void btn6(ActionEvent event) {
        txtPinNUmber.appendText("6");
    }

    @FXML
    void btn7(ActionEvent event) {
        txtPinNUmber.appendText("7");
    }

    @FXML
    void btn8(ActionEvent event) {
        txtPinNUmber.appendText("8");
    }

    @FXML
    void btn9(ActionEvent event) {
        txtPinNUmber.appendText("9");
    }

    @FXML
    void btnCancel(ActionEvent event) {
        String current = txtPinNUmber.getText();
        if (!current.isEmpty()) {
            txtPinNUmber.setText(current.substring(0, current.length() - 1));
        }
    }

    @FXML
    void btnFunction(ActionEvent event) {
        txtPinNUmber.clear();
    }

    @FXML
    void btnNext(ActionEvent event) {

    }

    @FXML
    void btnSpace(ActionEvent event) {
        txtPinNUmber.appendText(" ");
    }

    public void btnF(ActionEvent actionEvent) {

    }
}
