package com.example.javafxapplication;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;

public class CalcPlugin implements Plugin {
    private JavaFXApplication application;

    public void setApplication(JavaFXApplication app) {
        this.application = app;
    }

    public String getButtonText() {
        return "Calculate";
    }

    public String getInitialText() {
        return "10/2+6";
    }

    public void buttonClicked() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Result");
        alert.setHeaderText(null);
        alert.setContentText("The result of " + application.getInput() + " is " + (10 / 2 + 6));
        alert.showAndWait();
    }

    public String getApplicationTitle() {
        return "My Great Calculator";
    }
}
