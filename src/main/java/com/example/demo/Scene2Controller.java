package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Scene2Controller {

    @FXML
    private AnchorPane Scene2AnchorPane;

    @FXML
    private Button newGame;

    @FXML
    void inicio(ActionEvent event) throws IOException {
        new SceneSwitch(Scene2AnchorPane, "Scene3.fxml");
    }

}