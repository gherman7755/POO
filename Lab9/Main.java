package com.company;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application{

    public static void main(String[] args) {
        Application.launch(args);
    }

    double x, y;

    @Override
    public void start(Stage stage) throws Exception {
        Label lbl = new Label();
        Button btn = new Button();
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        btn.setText("Click!");

        btn.setOnAction(event -> {
            try {
                double x = Double.parseDouble(tf1.getText().replace(',', '.'));
                double y = Double.parseDouble(tf2.getText().replace(',', '.'));
                String ans = String.valueOf(x / y);

                if(x == 13 || y == 13 || ans.contains("13")){
                    throw new UnluckyException();
                }

                lbl.setText("Answer: " + ans);
            } catch (Exception e){
                if(e.getMessage().contains("input"))
                    lbl.setText("Invalid input");
                else if(e.getMessage().contains("empty")){
                    lbl.setText("Fill all the gaps");
                }
                else if(e.getMessage().contains("Unlucky")){
                    lbl.setText("Unlucky Error (there is 13 somewhere)");
                }
            }

        });

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, tf1, tf2, btn, lbl);
        Scene scene = new Scene(root, 250, 200);

        stage.setScene(scene);
        stage.setTitle("Hello");
        stage.show();
    }
}
