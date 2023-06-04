package com.example.gradebookapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField courseName;

    @FXML
    private Button clearTexts;

    @FXML
    private Button LoadData;

    @FXML
    private ComboBox gradeComboBox = new ComboBox();

    @FXML
    private TextArea resultTextCSV;

    @FXML
    void onHelloButtonClick(ActionEvent event) {
        System.out.println("Clicked a button");
    }

    // Method to initialize items and data
    @FXML
    public void initialize() {
        // Aadding items to the Combo Box
        ObservableList<String> list = FXCollections.observableArrayList("A","B","C","D","F");
        gradeComboBox.setItems(list);
    }

    // Decalring a method to perform Event action for selecting a Grade from combobox
    String gradeValue = "Default";
    @FXML
    void selectGradeFromcombo(ActionEvent event) {
        gradeValue = gradeComboBox.getSelectionModel().getSelectedItem().toString();
    }

    // Method to perform an Action Event after clicking the Save button
    // saves the data to the csv file - Grades.csv
    @FXML
    public void onSaveDataButtonClick(ActionEvent event) throws FileNotFoundException {
        System.out.println(firstName.getText());
        System.out.println(lastName.getText());
        System.out.println(courseName.getText());
        System.out.println(gradeValue);

        List<String[]> dataLines = new ArrayList<>();
        dataLines.add(new String[]
                {firstName.getText(),lastName.getText(),courseName.getText(),gradeValue});

        String[] record = {firstName.getText(),lastName.getText(),courseName.getText(),gradeValue};
        final String filename = "./grade.csv";
        System.out.println(record);
        saveDataToFile(filename, dataLines);
    }

    // Method to clear all the fields
    @FXML
    public void onclearFields(ActionEvent event) {
        firstName.setText("");
        lastName.setText("");
        courseName.setText("");
        gradeComboBox.getSelectionModel().clearSelection();
    }

    public String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }
        return escapedData;
    }

    public String convertToCSV(String[] data) {
        return Stream.of(data)
                .map(this::escapeSpecialCharacters)
                .collect(Collectors.joining(","));
    }

    // Generic method to call to save any csv file
    // Call this method when save button is clicked to save data to file.
    public void saveDataToFile(String filename, List<String[]> datas) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(new File(filename),true))) {
            datas.stream()
                    .map(this::convertToCSV)
                    .forEach(pw::append);
        }
    }

    // Methods to load csv file into the area
    public void loadCSVFILE() throws IOException {
        final String filename = "./grade.csv";
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
            resultTextCSV.setText(records.toString());
            br.close();
        } catch (Exception e) {
            System.out.println(e);
            resultTextCSV.setText("Could not load file");
        }
    }

    // Method to invoke a load file method when the load grades button is clicked
    @FXML
    void onLoadCsvData(ActionEvent event) throws IOException {
        loadCSVFILE();
    }

}
