package com.example.gradebookapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ChavanGradeBookApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Tax Calculator");
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(pane, 300, 275);

        Text sceneTitle = new Text("Grade Book Form");
        sceneTitle.setFont(Font.font("Arial", FontWeight.NORMAL,20));
        pane.add(sceneTitle, 0, 0, 2, 1);
        Label fname = new Label("FirstName:");
        fname.setStyle("-fx-font-family: Arial;");
        pane.add(fname, 0, 1);
        Label lname = new Label("LastName:");
        lname.setStyle("-fx-font-family: Arial;");
        pane.add(lname, 1, 0);
        final TextField fnameField = new TextField();
        fnameField.setStyle("-fx-font-family: Arial;");
        pane.add(fnameField, 2, 0);
        Label course = new Label("Course Name");
        course.setStyle("-fx-font-family: Arial;");
        pane.add(course,0,4);
        final TextField lnameField = new TextField();
        lnameField.setStyle("-fx-font-family: Arial;");
        pane.add(lnameField, 1, 2);
        final TextField courseName = new TextField();
        courseName.setStyle("-fx-font-family: Arial;");
        pane.add(courseName, 1, 3);
        Button calculateButton = new Button("Save Data");
        calculateButton.setStyle("-fx-font-family: Arial;");

        ComboBox comboBox = new ComboBox();

        comboBox.getItems().add("A");
        comboBox.getItems().add("B");
        comboBox.getItems().add("C");
        comboBox.getItems().add("D");
        comboBox.getItems().add("E");
        comboBox.getItems().add("F");
        HBox comBox = new HBox(comboBox);
        comBox.setStyle("-fx-font-family: Arial;");
        pane.add(comBox, 1, 5);

        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(calculateButton);
        pane.add(hbox, 1, 4);

        final Text Message = new Text();
        pane.add(Message, 1, 6);

        calculateButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                String fname = fnameField.getText();
                String lname = lnameField.getText();
                String course = courseName.getText();
//                fname.setStyle("-fx-font-family: Arial;");
//                lname.setStyle("-fx-font-family: Arial;");
//                course.setStyle("-fx-font-family: Arial;");
                //save to file.
                final String fileName = "grades.csv";
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                    writer.write(fname+","+lname+","+course);
                    writer.close();
                } catch (Exception e) {

                }
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}