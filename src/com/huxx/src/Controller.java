package com.huxx.src;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private Button downBtn;
    @FXML private TextField url;
    @FXML private TextField id;
    @FXML private PasswordField pw;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        downBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String cafeUrl = String.valueOf(url.getCharacters());
                String naverId = String.valueOf(id.getCharacters());
                String naverPw = String.valueOf(pw.getCharacters());

                Crawler crawler = new Crawler();

                try {
                    crawler.imageCrawler(cafeUrl,naverId,naverPw);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

    }
}
