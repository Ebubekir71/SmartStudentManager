package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    @FXML
    private TextField nameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField studentNumberField;
    @FXML
    private TextField studentGradeField;
    @FXML
    private Label outputLabel;

    private List<Integer> grades = new ArrayList<>();


    @FXML
    public void addGradeButton(ActionEvent actionEvent) {

    }
}
