package com.example.javafxapplication;

public interface Plugin {
    String getApplicationTitle();
    String getButtonText();
    String getInitialText();
    void buttonClicked();
    void setApplication(JavaFXApplication app);
}
