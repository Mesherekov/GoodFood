package com.example.goodfood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Osnova extends AppCompatActivity {
private TextView kalorii;
private Button menu;
String x;
int yourkalorii;
int ageofme;
Bundle arguments;
boolean female, male, passive, middleactive, veryactive, okeyw;

    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osnova);
        kalorii=findViewById(R.id.kalorii);
        menu=findViewById(R.id.menu);

       arguments=getIntent().getExtras();
        ageofme=arguments.getInt("ager");
        yourkalorii =arguments.getInt("baby");
        male=arguments.getBoolean("male");
        female=arguments.getBoolean("female");
        passive=arguments.getBoolean("passive");
        middleactive=arguments.getBoolean("middlea");
        veryactive=arguments.getBoolean("active");
        okeyw=arguments.getBoolean("okeyw");
        x=arguments.get("putr").toString();
        yourkalorii =Integer.parseInt(x);

        kalorii.setText("Ваша норма калорий в день: "+x);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 Intent intent=new Intent(Osnova.this, PromejutokActivity.class);
                 intent.putExtra("baby", yourkalorii);

                intent.putExtra("ageogme", (int) ageofme);
                intent.putExtra("female1", female);
                intent.putExtra("male1", male);
                intent.putExtra("passive1", passive);
                intent.putExtra("middlea1", middleactive);
                intent.putExtra("active1", veryactive);
                intent.putExtra("okeyw1", okeyw);
                 startActivity(intent);


            }

        });


        }



    }
