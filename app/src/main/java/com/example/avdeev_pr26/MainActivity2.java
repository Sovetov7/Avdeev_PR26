package com.example.avdeev_pr26;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    CheckBox checktea;
    CheckBox checkcandy;
    CheckBox checkcoffee;
    CheckBox checkcombo;
    Button buttonresult;
    Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        but1 = findViewById(R.id.button);
        checktea = (CheckBox)findViewById(R.id.checktea);
        checkcandy = (CheckBox)findViewById(R.id.checkcandy);
        checkcoffee = (CheckBox)findViewById(R.id.checkcoffee);
        checkcombo = (CheckBox)findViewById(R.id.checkcombo);

        buttonresult = (Button) findViewById(R.id.buttonresult);

        buttonresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checktea.isChecked()) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                }
                if(checkcandy.isChecked()){
                    Intent intent = new Intent(MainActivity2.this, MainActivity6.class);
                    startActivity(intent);
                }
                if(checkcoffee.isChecked()){
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(intent);
                }
                if(checkcombo.isChecked()){
                    Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
                    startActivity(intent);
                }


            }
        });
        but1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity2.this, data.class);
                startActivity(intent);
            }
        });
    }

}