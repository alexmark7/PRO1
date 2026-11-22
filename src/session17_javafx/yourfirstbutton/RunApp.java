package session17_javafx.yourfirstbutton;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RunApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // ===== 1. Greeting: buttons change the label =====
        Label label = new Label("Hello, World!");

        Button moonButton = new Button("Set Moon!");
        moonButton.setOnAction(event -> label.setText("Hello, Moon!"));

        Button sunButton = new Button("Set Sun!");
        sunButton.setOnAction(event -> label.setText("Hello, Sun!"));

        // ===== 2. Text Field: read, print, or clear one line =====
        Label textFieldHeading = new Label("Text Field");
        TextField textField = new TextField();
        textFieldHeading.setLabelFor(textField);
        textField.setPromptText("Enter a line of text...");
        Label output = new Label();
        output.setWrapText(true);

        Button buttonTextField = new Button("Click me");
        buttonTextField.setOnAction(event -> {
            output.setText(textField.getText());
            textField.clear();
        });

        Button printTextButton = new Button("Print Text");
        printTextButton.setOnAction(event -> System.out.println(textField.getText()));

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(event -> textField.clear());

        // ===== 3. CheckBox: selected, unselected, or indeterminate =====
        CheckBox checkBox = new CheckBox("Pick me!");
        checkBox.setAllowIndeterminate(true);

        Button printStateButton = new Button("Print State");
        printStateButton.setOnAction(event -> {
            if (checkBox.isIndeterminate()) {
                System.out.println("Indeterminate");
            } else if (checkBox.isSelected()) {
                System.out.println("Selected");
            } else {
                System.out.println("Unselected");
            }
        });

        // ===== 4. Text Area: write, append, or print multiple lines =====
        Label textAreaHeading = new Label("Text Area");
        TextArea textArea = new TextArea();
        textAreaHeading.setLabelFor(textArea);
        textArea.setWrapText(true);
        textArea.setPrefRowCount(10);
        textArea.setPrefColumnCount(30);

        Label appendLabel = new Label("Text to append");
        TextField appendField = new TextField();
        appendLabel.setLabelFor(appendField);
        appendField.setPromptText("Enter text to append...");

        Button appendButton = new Button("Append");
        appendButton.setOnAction(event -> {
            String text = appendField.getText();
            if (!text.isEmpty()) {
                // Add a line break only if the area doesn't already end with one.
                if (!textArea.getText().isEmpty() && !textArea.getText().endsWith("\n")) {
                    textArea.appendText("\n");
                }
                textArea.appendText(text);
                appendField.clear();
            }
        });

        Button printAreaButton = new Button("Print Text");
        printAreaButton.setOnAction(event -> System.out.println(textArea.getText()));

        // ===== 5. Radio Buttons: pick one size from a ToggleGroup =====
        ToggleGroup sizeGroup = new ToggleGroup();
        RadioButton small = new RadioButton("Small");
        RadioButton medium = new RadioButton("Medium");
        RadioButton large = new RadioButton("Large");
        small.setToggleGroup(sizeGroup);
        medium.setToggleGroup(sizeGroup);
        large.setToggleGroup(sizeGroup);
        medium.setSelected(true);

        Button printSizeButton = new Button("Print Size");
        printSizeButton.setOnAction(event -> {
            if (sizeGroup.getSelectedToggle() instanceof RadioButton selectedSize) {
                System.out.println("Selected size: " + selectedSize.getText());
            }
        });

        // ===== 6. ComboBox: choose a color or type your own =====
        Label colorHeading = new Label("ComboBox");
        ComboBox<String> colorBox = new ComboBox<>();
        colorHeading.setLabelFor(colorBox);
        colorBox.getItems().addAll("Red", "Green", "Blue");
        colorBox.setValue("Green");
        colorBox.setPromptText("Choose a color");
        colorBox.setEditable(true);
        colorBox.setOnAction(event -> System.out.println("Selected: " + colorBox.getValue()));

        // ===== Layout: stack sections with visible dividers =====
        // The 10 is the gap in pixels between the elements in each box.
        VBox box = new VBox(10,
                new Label("Greeting"), label, new HBox(10, moonButton, sunButton),
                new Separator(),
                textFieldHeading, textField, new HBox(10, buttonTextField, printTextButton, clearButton), output,
                new Separator(),
                new Label("CheckBox"), checkBox, printStateButton,
                new Separator(),
                textAreaHeading, textArea, appendLabel, appendField, new HBox(10, appendButton, printAreaButton),
                new Separator(),
                new Label("Radio Buttons"), new HBox(10, small, medium, large), printSizeButton,
                new Separator(),
                colorHeading, colorBox
        );
        box.setPadding(new Insets(16));

        ScrollPane scrollPane = new ScrollPane(box);
        scrollPane.setFitToWidth(true);
        Scene scene = new Scene(scrollPane);
        primaryStage.setScene(scene);
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);

        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(300);
        primaryStage.setTitle("My Application");
        primaryStage.setOnCloseRequest(event -> System.exit(0));

        primaryStage.show();
    }
}
