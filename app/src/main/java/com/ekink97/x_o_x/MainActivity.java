package com.ekink97.x_o_x;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, restart;
    private TextView playerTurn,textViewResult;
    private boolean xTurn= true;
    private String[][] playerMatrix = new String[3][3];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt11);
        bt2 = findViewById(R.id.bt12);
        bt3 = findViewById(R.id.bt13);
        bt4 = findViewById(R.id.bt21);
        bt5 = findViewById(R.id.bt22);
        bt6 = findViewById(R.id.bt23);
        bt7 = findViewById(R.id.bt31);
        bt8 = findViewById(R.id.bt32);
        bt9 = findViewById(R.id.bt33);
        playerTurn = findViewById(R.id.editTextTextTurn);
        textViewResult = findViewById(R.id.textViewResult);
        restart = findViewById(R.id.NewGame);
        playerTurn.setText("X Turn");

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1.setText("");
                bt1.setEnabled(true);
                bt2.setText("");
                bt2.setEnabled(true);
                bt3.setText("");
                bt3.setEnabled(true);
                bt4.setText("");
                bt4.setEnabled(true);
                bt5.setText("");
                bt5.setEnabled(true);
                bt6.setText("");
                bt6.setEnabled(true);
                bt7.setText("");
                bt7.setEnabled(true);
                bt8.setText("");
                bt8.setEnabled(true);
                bt9.setText("");
                bt9.setEnabled(true);
                xTurn= true;
                textViewResult.setText("");
                playerTurn.setText("X Turn");
                playerMatrix[0][0] = null;
                playerMatrix[0][1] = null;
                playerMatrix[0][2] = null;
                playerMatrix[1][0] = null;
                playerMatrix[1][1] = null;
                playerMatrix[1][2] = null;
                playerMatrix[2][0] = null;
                playerMatrix[2][1] = null;
                playerMatrix[2][2] = null;

            }
        });


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn){
                    bt1.setText("X");
                    playerMatrix[0][0] = "X";
                    playerTurn.setText("O Turn");
                    xTurn = false;
                }else{
                    bt1.setText("O");
                    playerMatrix[0][0] = "O";
                    playerTurn.setText("X Turn");
                    xTurn = true;
                }
                bt1.setEnabled(false);
                updateLabel();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn){
                    bt2.setText("X");
                    playerMatrix[0][1] = "X";
                    playerTurn.setText("O Turn");
                    xTurn = false;
                }else{
                    bt2.setText("O");
                    playerMatrix[0][1] = "O";
                    playerTurn.setText("X Turn");
                    xTurn = true;
                }
                bt2.setEnabled(false);
                updateLabel();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(xTurn){
                    bt3.setText("X");
                    playerMatrix[0][2] = "X";
                    playerTurn.setText("O Turn");
                    xTurn = false;
                }else{
                    bt3.setText("O");
                    playerMatrix[0][2] = "O";
                    playerTurn.setText("X Turn");
                    xTurn = true;
                }
                bt3.setEnabled(false);
                updateLabel();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn){
                    bt4.setText("X");
                    playerMatrix[1][0] = "X";
                    playerTurn.setText("O Turn");
                    xTurn = false;
                }else{
                    bt4.setText("O");
                    playerMatrix[1][0] = "O";
                    playerTurn.setText("X Turn");
                    xTurn = true;;
                }
                bt4.setEnabled(false);
                updateLabel();
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn){
                    bt5.setText("X");
                    playerMatrix[1][1] = "X";
                    playerTurn.setText("O Turn");
                    xTurn = false;
                }else{
                    bt5.setText("O");
                    playerMatrix[1][1] = "O";
                    playerTurn.setText("X Turn");
                    xTurn = true;
                }
                bt5.setEnabled(false);
                updateLabel();
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn){
                    bt6.setText("X");
                    playerMatrix[1][2] = "X";
                    playerTurn.setText("O Turn");
                    xTurn = false;
                }else{
                    bt6.setText("O");
                    playerMatrix[1][2] = "O";
                    playerTurn.setText("X Turn");
                    xTurn = true;
                }
                bt6.setEnabled(false);
                updateLabel();
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn){
                    bt7.setText("X");
                    playerMatrix[2][0] = "X";
                    playerTurn.setText("O Turn");
                    xTurn = false;
                }else{
                    bt7.setText("O");
                    playerMatrix[2][0] = "O";
                    playerTurn.setText("X Turn");
                    xTurn = true;
                }
                bt7.setEnabled(false);
                updateLabel();
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn){
                    bt8.setText("X");
                    playerMatrix[2][1] = "X";
                    playerTurn.setText("O Turn");
                    xTurn = false;
                }else{
                    bt8.setText("O");
                    playerMatrix[2][1] = "O";
                    playerTurn.setText("X Turn");
                    xTurn = true;
                }
                bt8.setEnabled(false);
                updateLabel();
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn){
                    bt9.setText("X");
                    playerMatrix[2][2] = "X";
                    playerTurn.setText("O Turn");
                    xTurn = false;
                }else{
                    bt9.setText("O");
                    playerMatrix[2][2] = "O";
                    playerTurn.setText("X Turn");
                    xTurn = true;
                }
                bt9.setEnabled(false);
                updateLabel();
            }
        });
    }
    private void updateLabel(){
        if(Score()){
            if(xTurn){
                textViewResult.setText("O is Winner");
                bt1.setEnabled(false);
                bt2.setEnabled(false);
                bt3.setEnabled(false);
                bt4.setEnabled(false);
                bt5.setEnabled(false);
                bt6.setEnabled(false);
                bt7.setEnabled(false);
                bt8.setEnabled(false);
                bt9.setEnabled(false);
            }
            else {
                textViewResult.setText("X is Winner");
                bt1.setEnabled(false);
                bt2.setEnabled(false);
                bt3.setEnabled(false);
                bt4.setEnabled(false);
                bt5.setEnabled(false);
                bt6.setEnabled(false);
                bt7.setEnabled(false);
                bt8.setEnabled(false);
                bt9.setEnabled(false);
            }
        }
    }


    private boolean Score() {
        for (int i = 0; i < 3; i++) {
            if (playerMatrix[i][0] != null && playerMatrix[i][1] != null && playerMatrix[i][2] != null && playerMatrix[i][0].equals(playerMatrix[i][1]) && playerMatrix[i][0].equals(playerMatrix[i][2])) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (playerMatrix[0][i] != null && playerMatrix[1][i] != null && playerMatrix[2][i] != null && playerMatrix[0][i].equals(playerMatrix[1][i]) && playerMatrix[0][i].equals(playerMatrix[2][i])) {
                return true;
            }
        }
        if (playerMatrix[0][0] != null && playerMatrix[1][1] != null && playerMatrix[2][2] != null && playerMatrix[0][0].equals(playerMatrix[1][1]) && playerMatrix[0][0].equals(playerMatrix[2][2])) {
            return true;
        }
        if (playerMatrix[0][2] != null && playerMatrix[1][1] != null && playerMatrix[2][0] != null && playerMatrix[0][2].equals(playerMatrix[1][1]) && playerMatrix[0][2].equals(playerMatrix[2][0])) {
            return true;
        }
        else {
            textViewResult.setText("Draw");
            return false;
        }
    }
}