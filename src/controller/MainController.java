package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.FileWriter;
import java.io.IOException;
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
    public void addGradeButton(ActionEvent actionEvent) throws IOException {
        int grade = Integer.parseInt(studentGradeField.getText());
        grades.add(grade);

        model.Student student = new model.Student(studentNumberField.getText(), grades);
        double avg = student.getAverage();

        outputLabel.setText("Average : " + avg);
        studentGradeField.clear();

        FileWriter writer = new FileWriter("save.txt", true);
        writer.write(
                nameField.getText()+ " " +
                    emailField.getText()+  " " +
                    studentNumberField.getText()+ " " +
                    grades.toString() + "\n" );
        writer.close();

    }
}
