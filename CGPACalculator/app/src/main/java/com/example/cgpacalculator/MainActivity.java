package com.example.cgpacalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button gpaButton, cgpaButton, exitButton;
    private TextView textView;
     AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gpaButton = findViewById(R.id.gpaID);
        cgpaButton = findViewById(R.id.cgpaID);
        exitButton = findViewById(R.id.allertButtonID);

        gpaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent = new Intent(MainActivity.this,GpaActivity.class );
               startActivity(intent);
                Toast.makeText(getApplicationContext(),"GPA Button is Clicked", Toast.LENGTH_SHORT).show();

            }
        });
        builder = new AlertDialog.Builder(this);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    exitConfirmation();
            }
        });


        cgpaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,CgpaActivity.class );
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"CGPA Button is  Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void exitConfirmation(){
        builder.setMessage("Do you want to close this application ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.setTitle("Exit Confirmation");
        alert.show();
    }
}
