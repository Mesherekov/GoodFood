package com.example.goodfood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;


import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements Balancekallorii{
private EditText age , tall, weight;
CheckBox man, woman, passive, middleactive, veryactive;
 Button next;
boolean checkoffemale, checkofmale, checkofpassive, checkofmiddleactive, checkofveryactive, okeyw;

double a, t, w, kall;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
tall = findViewById(R.id.tall);
weight=findViewById(R.id.weight);
next = findViewById(R.id.next);
        age = findViewById(R.id.age);
        man=findViewById(R.id.man);
        woman=findViewById(R.id.woman);
        passive=findViewById(R.id.passive);
        middleactive=findViewById(R.id.middleactive);
        veryactive =findViewById(R.id.veryactive);

        next.setOnClickListener(view -> {

            boolean access = true;
            if ((passive.isChecked() && middleactive.isChecked() && veryactive.isChecked()) || (passive.isChecked() && middleactive.isChecked()) || (passive.isChecked() && veryactive.isChecked()) || (middleactive.isChecked() && veryactive.isChecked())){
                next.setText("Ошибка");
            } else {
                if (man.isChecked() && woman.isChecked()) {
                    next.setText("Ошибка");
                } else {
                    if (man.isChecked()) {
                        checkofmale = true;
                        checkoffemale = false;
                    }
                    if (woman.isChecked()) {
                        checkofmale = false;
                        checkoffemale = true;
                    }
                    if (!passive.isChecked() && !middleactive.isChecked() && !veryactive.isChecked()){
                        next.setText("Ошибка");
                    } else {
                        if (passive.isChecked()){
                            checkofpassive=true;
                            checkofmiddleactive=false;
                            checkofveryactive=false;
                        }
                        if (middleactive.isChecked()){
                            checkofpassive=false;
                            checkofmiddleactive=true;
                            checkofveryactive=false;
                        }
                        if (veryactive.isChecked()){
                            checkofpassive=false;
                            checkofmiddleactive=false;
                            checkofveryactive=true;
                        }

                        if (!man.isChecked() && !woman.isChecked()) {
                            next.setText("Ошибка");
                        } else {
                            try {
                                w = Double.parseDouble(weight.getText().toString());
                                t = Double.parseDouble(tall.getText().toString());
                                a = Double.parseDouble(age.getText().toString());
                                kall = (w * 10 + t * 6.25) - a * 5 - 161;
                                if (middleactive.isChecked())
                                    kall+=300;
                                if (veryactive.isChecked())
                                    kall+=500;
                                if (man.isChecked()) {
                                    kall = kall + 400;
                                    if (a > 18 && a <= 30) {
                                        kall = kall + 300;

                                    }
                                }
                                balancelallorii(t);


                            }
                            catch (NumberFormatException ex) {
                                next.setText("Ошибка");
                                access = false;

                            } finally {
                                if (access) {
                                    Intent intent = new Intent(MainActivity.this, Osnova.class);

                                    intent.putExtra("putr", (int) kall);
                                    intent.putExtra("ager", (int) a);
                                    intent.putExtra("female", checkoffemale);
                                    intent.putExtra("male", checkofmale);
                                    intent.putExtra("passive", checkofpassive);
                                    intent.putExtra("middlea", checkofmiddleactive);
                                    intent.putExtra("active", checkofveryactive);
                                    intent.putExtra("okeyw", okeyw);
                                    startActivity(intent);

                                }
                            }

                        }
                    }
                }
            }

        });



    }

    @Override
    public void balancelallorii(Double tall) {
        okeyw= !(w - (tall - 100) * 1.15 > 20);

    }
}