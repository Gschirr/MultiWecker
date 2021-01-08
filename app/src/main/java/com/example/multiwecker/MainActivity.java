package com.example.multiwecker;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //private Button newRoutineButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Another way to implement a Button onClick Event
        /*Button newRoutineButton = findViewById(R.id.createRoutine);
        newRoutineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent second = new Intent(MainActivity.this, createRoutine.class);
                startActivity(second);
            }
        });*/
    }

    public void switchToRoutineView(View view) {
        Intent create = new Intent(MainActivity.this, createRoutine.class);
        startActivity(create);
    }

    public void switchToChooseRoutineView(View view) {
        Intent choose = new Intent(MainActivity.this, chooseRoutine.class);
        startActivity(choose);
    }

}