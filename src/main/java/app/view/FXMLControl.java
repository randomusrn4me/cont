package app.view;

import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.util.Random;


public class FXMLControl implements Initializable {

    private int a = 0, b = 0, res = 0;
    private boolean wasCorrect = false;

    @FXML
    private Label num1;

    @FXML
    private Label num2;

    @FXML
    private TextField resultBox;

    @FXML
    private Button nextButton;

    @FXML
    private Button checkButton;

    @FXML
    private Label resultLabel;

    @FXML
    private Label resLabel;


    @FXML
    void checkButPushed() {
        int be = Integer.parseInt(resultBox.getText());
        resultBox.clear();
        if(!wasCorrect){
            resLabel.setText(""+be);
            if(res == be){
                wasCorrect = true;
                resultLabel.setText("OK, press next!");
            } else {
                wasCorrect = false;
                resultLabel.setText("Try again!");
            }
        }
    }

    @FXML
    void nextButPushed() {
        wasCorrect = false;
        resultBox.setPromptText("");
        resultBox.clear();
        Random rand = new Random();
        a = rand.nextInt(9)+1;
        b = rand.nextInt(9)+1;
        res = a + b;
        updateLabels(a, b);
    }

    void updateLabels(int a, int b){
        resultLabel.setText("");
        resLabel.setText("?");
        num1.setText(""+a);
        num2.setText(""+b);
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Random rand = new Random();
        a = rand.nextInt(9)+1;
        b = rand.nextInt(9)+1;
        res = a + b;
        updateLabels(a, b);
    }

}