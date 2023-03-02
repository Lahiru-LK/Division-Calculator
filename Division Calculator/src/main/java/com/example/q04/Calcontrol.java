package com.example.q04;
import javafx.fxml.FXML;
import java.awt.*;


import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import sun.util.locale.LocaleUtils;


public class Calcontrol {
//------------------------------
    @FXML
    private TextField num01;
    @FXML
    private TextField num02;

//-----------------------------------
    @FXML
    private Label lab1;





    public void DivideClick()
    {
        if (num01.getText().trim().isEmpty() && num02.getText().trim().isEmpty() )
        {
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setContentText("Please Enter Value !!");
            a.setTitle("Empty field ");
            a.setAlertType(Alert.AlertType.WARNING);
            a.showAndWait();
            num01.setText("");
            num02.setText("");
            lab1.setText(String.valueOf(""));
        }
        else if (num01.getText().trim().isEmpty())
        {
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setContentText("Please Enter Value Field 01 !!");
            a.setTitle("Empty field ");
            a.setAlertType(Alert.AlertType.WARNING);

            a.showAndWait();
            num01.setText("");
            num02.setText("");
            lab1.setText(String.valueOf(""));
        }
        else if (num02.getText().trim().isEmpty())
        {
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setContentText("Please Enter Value Field 02 !!");
            a.setTitle("Empty field ");
            a.setAlertType(Alert.AlertType.WARNING);

            a.showAndWait();
            num01.setText("");
            num02.setText("");
            lab1.setText(String.valueOf(""));
        }
        else
        {
            try
            {
                float n1 = Float.parseFloat(num01.getText());
                float n2 = Float.parseFloat(num02.getText());
                if (n2 == 0.0)
                {
                    Alert a = new Alert(Alert.AlertType.NONE);
                    a.setContentText("Please Enter Value of Field 02 !! ");
                    a.setTitle("Not use 0 ");
                    a.setAlertType(Alert.AlertType.WARNING);

                    a.showAndWait();
                    num01.setText("");
                    num02.setText("");
                    lab1.setText(String.valueOf(""));
                }
                else
                {
                    float divCal = n1/n2;
                    lab1.setText(String.valueOf(divCal));
                }
            } catch (NumberFormatException e)
            {
                Alert a = new Alert(Alert.AlertType.NONE);
                a.setContentText("Please Enter only Numeric Value !!");
                a.setTitle("Not a number ");
                a.setAlertType(Alert.AlertType.WARNING);

                a.showAndWait();
                num01.setText("");
                num02.setText("");
                lab1.setText(String.valueOf(""));
            }
        }
    }
}
