package com.example.javafxapplication;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {
    private TextField textField;
    private Plugin plugin;

    public JavaFXApplication(Plugin p) {
        this.plugin = p;
        p.setApplication(this);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));

        Button button = new Button();
        if (plugin != null)
            button.setText(plugin.getButtonText());
        else
            button.setText("OK");
        button.setOnAction(e -> {
            if (plugin != null)
                plugin.buttonClicked();
        });

        textField = new TextField();
        if (plugin != null)
            textField.setText(plugin.getInitialText());
        textField.setPrefWidth(200);

        root.setRight(button);
        root.setLeft(textField);

        Scene scene = new Scene(root, 300, 80);
        primaryStage.setTitle(plugin.getApplicationTitle());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public String getInput() {
        return textField.getText();
    }

    public void launch(String[] args) {
        launch(args);
    }
}
