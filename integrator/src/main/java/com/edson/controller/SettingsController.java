package com.edson.controller;

import java.io.IOException;

import com.edson.App;
import com.edson.util.ConfigurationPathUtil;

import javafx.fxml.FXML;

public class SettingsController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot(ConfigurationPathUtil.viewPath + "primary");
    }
}