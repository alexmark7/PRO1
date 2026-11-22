package session17_javafx.Calculator.presentation;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {
    @Override
    public void start(Stage primaryStage) {
        // ===== Row 1: Number inputs =====
        TextField firstNumber = new TextField();
        firstNumber.setPromptText("Number 1");
        firstNumber.setAccessibleText("Number 1");
        firstNumber.setPrefWidth(120);

        TextField secondNumber = new TextField();
        secondNumber.setPromptText("Number 2");
        secondNumber.setAccessibleText("Number 2");
        secondNumber.setPrefWidth(120);
        HBox row1 = new HBox(10, firstNumber, secondNumber);

        // ===== Row 2: Operation buttons =====
        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");
        HBox row2 = new HBox(10, addButton, subtractButton, multiplyButton, divideButton);

        // ===== Row 3: Result or error message =====
        Label result = new Label("Result: 0");
        result.setWrapText(true);
        HBox row3 = new HBox(10, result);

        // ===== Button actions: read both numbers and show the answer =====
        addButton.setOnAction(event -> {
            try {
                double first = Double.parseDouble(firstNumber.getText().trim());
                double second = Double.parseDouble(secondNumber.getText().trim());
                result.setText("Result: " + (first + second));
            } catch (NumberFormatException e) {
                result.setText("Error: Enter two valid numbers.");
            }
        });

        subtractButton.setOnAction(event -> {
            try {
                double first = Double.parseDouble(firstNumber.getText().trim());
                double second = Double.parseDouble(secondNumber.getText().trim());
                result.setText("Result: " + (first - second));
            } catch (NumberFormatException e) {
                result.setText("Error: Enter two valid numbers.");
            }
        });

        multiplyButton.setOnAction(event -> {
            try {
                double first = Double.parseDouble(firstNumber.getText().trim());
                double second = Double.parseDouble(secondNumber.getText().trim());
                result.setText("Result: " + (first * second));
            } catch (NumberFormatException e) {
                result.setText("Error: Enter two valid numbers.");
            }
        });

        divideButton.setOnAction(event -> {
            try {
                double first = Double.parseDouble(firstNumber.getText().trim());
                double second = Double.parseDouble(secondNumber.getText().trim());
                if (second == 0) {
                    result.setText("Error: Cannot divide by zero.");
                } else {
                    result.setText("Result: " + (first / second));
                }
            } catch (NumberFormatException e) {
                result.setText("Error: Enter two valid numbers.");
            }
        });

        VBox root = new VBox(10, row1, row2, row3);
        root.setPadding(new Insets(12));
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(new Scene(root, 320, 150));
        primaryStage.show();
    }
}
