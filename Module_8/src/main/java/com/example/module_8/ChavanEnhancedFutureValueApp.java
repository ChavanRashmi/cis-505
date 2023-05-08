package com.example.module_8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class ChavanEnhancedFutureValueApp extends Application {
/*
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}*/
@Override
public void start(Stage primaryStage) throws Exception{

    primaryStage.setTitle("Future Value App");

    // Creating Labels

    Label lblMonthlyPayment = new Label("Monthly Payment: ");
    Label lblInterestRate = new Label("Interest Rate: ");
    Label lblInterestRateFormat = new Label();
    Label lblYears = new Label("Years");

    //Creating a Text fields

    //Creating Text Filed for Monthly Payment
    TextField textMonthlyPayment = new TextField();

    //Creating Text Filed for Interest Rate
    TextField textInterestRate = new TextField();

    // Create a Text Area
    TextArea textArea = new TextArea();
    textArea.setText("Enter your address here");
    textArea.setPrefColumnCount(15);
    textArea.setPrefHeight(120);
    textArea.setPrefWidth(300);

    // Creating a button
    Button btnClear = new Button("Clear");
    Button btnCalculate = new Button("Calculate");

    //Creating a combo box
    ComboBox<Integer> combo = new ComboBox<Integer>();

    //Setting the prompt text of the combo box
    combo.setPromptText("Select a Year");

    //Getting the observable list of the combo box
    ObservableList<Integer> list = combo.getItems();
    //Adding items to the combo box
    list.add(2023);
    list.add(2022);
    list.add(2021);
    list.add(2020);
    list.add(2019);


    lblMonthlyPayment.setTranslateX(150);
    lblMonthlyPayment.setTranslateY(25);

    lblInterestRate.setTranslateX(150);
    lblInterestRate.setTranslateY(25);

    lblYears.setTranslateX(150);
    lblYears.setTranslateY(25);

    GridPane gridPane = new GridPane();

    gridPane.setMinSize(400, 200);
    gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

    //Setting the vertical and horizontal gaps between the columns
    gridPane.setVgap(5.5);
    gridPane.setHgap(5.5);

    //setting the font color of the interest rate instruction to red
    lblInterestRateFormat.setTextFill(Color.RED);

    //Add the label to the grid pane
    gridPane.add(lblInterestRateFormat, 1,2);

    //Position of the label to the right of the pane
    //GridPane.setHaligment(lblInterestRateFormat, HPos.RIGHT);

    HBox actionBtnContainer = new HBox(); // creating a new HBox container

    actionBtnContainer.getChildren().addAll(lblYears, combo);
    actionBtnContainer.getChildren().add(lblMonthlyPayment);
    actionBtnContainer.getChildren().add(lblInterestRate);
    actionBtnContainer.getChildren().add(textArea);
    actionBtnContainer.getChildren().add(textMonthlyPayment);
    actionBtnContainer.getChildren().add(textInterestRate);

    actionBtnContainer.setPadding(new Insets(15,0,15,30));  // set the container padding
    actionBtnContainer.setSpacing(10); //set the container spacing
    actionBtnContainer.getChildren().add(btnClear); // Add btnClear to the container
    actionBtnContainer.getChildren().add(btnCalculate); //Add btnCalculate to the container
    gridPane.add(actionBtnContainer, 1,4); //Add the container to the Grid Pane

    StackPane layout  = new StackPane();
    layout.getChildren().add(gridPane);

    Scene scene = new Scene(layout, 300, 250);
    scene.getStylesheets().add("global.css");



    primaryStage.setScene(scene);
    primaryStage.show();
}

    public static void main(String[] args) {
        launch();
    }
}
