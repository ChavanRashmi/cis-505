package com.example.gradebookapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.layout.StackPane;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class ChavanGradeBookApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Grade Book App");

        // Creating Labels

        Label lblFirstName = new Label("First Name: ");
        Label lblLastName = new Label("Last Name: ");
        Label lblCourseName = new Label("Course Name: ");

        //Creating Text Field
        TextField textFirstName = new TextField();

        //Creating Text Field
        TextField textLastName = new TextField();

        // Create a Text Area
        TextArea textArea = new TextArea();
        textArea.setText("Enter your Course Name here: ");
        textArea.setPrefColumnCount(15);
        textArea.setPrefHeight(120);
        textArea.setPrefWidth(300);

        // Creating a button
       // Button btnClear = new Button("Clear");
        Button btnCalculate = new Button("Calculate");

        //Creating a combo box
        ComboBox<String> combo = new ComboBox<String>();

        //Setting the prompt text of the combo box
        combo.setPromptText("Show your grade");

        //Getting the observable list of the combo box
        ObservableList<String> list = combo.getItems();
        //Adding items to the combo box
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5.5);
        gridPane.setHgap(5.5);

        //setting the font color of the interest rate instruction to red
       // lblInterestRateFormat.setTextFill(Color.RED);

        //Add the label to the grid pane
        gridPane.add(lblFirstName,1,2);
        gridPane.add(lblLastName,1,2);
        gridPane.add(lblCourseName,1,2);

        //Position of the label to the right of the pane
        GridPane.setHalignment(lblFirstName, HPos.RIGHT);
        GridPane.setHalignment(lblLastName, HPos.RIGHT);
        GridPane.setHalignment(lblCourseName, HPos.RIGHT);


        HBox actionBtnContainer = new HBox(); // creating a new HBox container

        actionBtnContainer.setPadding(new Insets(15,0,15,30));  // set the container padding
        actionBtnContainer.setSpacing(10); //set the container spacing
        actionBtnContainer.getChildren().add(btnClear); // Add btnClear to the container
        actionBtnContainer.getChildren().add(btnCalculate); //Add btnCalculate to the container

        gridPane.add(actionBtnContainer, 1,4); //Add the container to the Grid Pane
        actionBtnContainer.getChildren().addAll(lblYears, combo);

        StackPane layout  = new StackPane();
        layout.getChildren().add(gridPane);
        // Group group = new Group();
        Scene scene = new Scene(layout, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}
}