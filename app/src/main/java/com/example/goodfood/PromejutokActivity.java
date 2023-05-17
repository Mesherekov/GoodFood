package com.example.goodfood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PromejutokActivity extends AppCompatActivity {
    Button breakfast, dinner, lanch;
    int yourkalorii;
    int ageofme;
    Bundle arguments;
    boolean female, male, passive, middleactive, veryactive, okeyw;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promejutok);

        lanch=findViewById(R.id.lanch);
        breakfast=findViewById(R.id.breakfast);
        dinner=findViewById(R.id.dinner);

        arguments=getIntent().getExtras();
        ageofme=arguments.getInt("ageofme");
        yourkalorii =arguments.getInt("baby");
        male=arguments.getBoolean("male1");
        female=arguments.getBoolean("female1");
        passive=arguments.getBoolean("passive1");
        middleactive=arguments.getBoolean("middlea1");
        veryactive=arguments.getBoolean("active1");
        okeyw=arguments.getBoolean("okeyw1");


        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if (!okeyw){
                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                    startActivity(intent);

                } else {
                    if (passive) {
                        if (male) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                } else {
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }}
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                } else if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {

                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }
                            }
                        }
                        if (female) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                } else if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {
                                int i = yourkalorii;
                                if (i <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < i && i <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2400 < i && i <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }
                            }


                        }


                    }
                    if (middleactive) {
                        if (male) {

                                if (ageofme <= 13) {
                                    if (yourkalorii <= 1800) {
                                        Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                        startActivity(intent);
                                    } else {
                                        if (1800 < yourkalorii && yourkalorii <= 2400) {
                                            Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                            startActivity(intent);
                                        }}
                                    if (2400 < yourkalorii) {
                                        Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                        startActivity(intent);
                                    }

                                }
                                if (ageofme <= 50 && ageofme > 30) {
                                    if (yourkalorii <= 1800) {
                                        Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                        startActivity(intent);
                                    }
                                    if (1800 < yourkalorii && yourkalorii <= 2400) {
                                        Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                        startActivity(intent);
                                    }
                                    if (2400 < yourkalorii) {
                                        Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                        startActivity(intent);
                                    }


                                }
                                if (ageofme > 51) {
                                    if (yourkalorii <= 1800) {
                                        Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                        startActivity(intent);
                                    }
                                    if (1800 < yourkalorii && yourkalorii <= 2400) {
                                        Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                        startActivity(intent);
                                    }
                                    if (2400 < yourkalorii) {
                                        Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                        startActivity(intent);
                                    }


                                }
                                if (ageofme <= 18 && 13 < ageofme) {
                                    if (yourkalorii <= 1800) {
                                        Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                        startActivity(intent);
                                    } else if (2400 < yourkalorii) {
                                        Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                        startActivity(intent);
                                    } else if (1800 < yourkalorii && yourkalorii <= 2400) {
                                        Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                        startActivity(intent);
                                    }
                                }
                                if (ageofme <= 30 && 18 < ageofme) {

                                    if (yourkalorii <= 1800) {
                                        Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                        startActivity(intent);
                                    }
                                    if (1800 < yourkalorii && yourkalorii <= 2400) {
                                        Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                        startActivity(intent);
                                    }
                                    if (2400 < yourkalorii) {
                                        Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                        startActivity(intent);
                                    }
                                }
                            }
                        if (female) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1600) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1600 < yourkalorii && yourkalorii <= 2000) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2000 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2000) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2000 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1700) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1700 < yourkalorii && yourkalorii <= 2200) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2200 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                } else if (2000 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2000) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {
                                int i = yourkalorii;
                                if (i <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < i && i <= 2300) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2300 < i) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }
                            }


                        }


                    }
                    if (veryactive) {
                        if (male) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                } else {
                                    if (1800 < yourkalorii && yourkalorii <= 2400) {
                                        Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                        startActivity(intent);
                                    }}
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                } else if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {

                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii<=2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }
                                if (yourkalorii>2600){
                                    Intent intent = new Intent(PromejutokActivity.this, SportActivityBreakfast.class);
                                    startActivity(intent);
                                }
                            }
                        }
                        if (female) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1400) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1400 < yourkalorii && yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2200) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2200 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1700) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1700 < yourkalorii && yourkalorii <= 2200) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2200 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                } else if (2300 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2300) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {
                                int i = yourkalorii;
                                if (i <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (1800 < i && i <= 2300) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityBreakfast.class);
                                    startActivity(intent);
                                }
                                if (2300 < i && i <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultBreakfast.class);
                                    startActivity(intent);
                                }

                            }


                        }


                    }


                }

            }
        });
        lanch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!okeyw){
                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                    startActivity(intent);

                } else {
                    if (passive) {
                        if (male) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                } else if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {

                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }
                            }
                        }
                        if (female) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                } else if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {
                                int i = yourkalorii;
                                if (i <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < i && i <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < i && i <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }
                            }


                        }


                    }
                    if (middleactive) {
                        if (male) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                } else if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {

                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }
                            }
                        }
                        if (female) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1600) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1600 < yourkalorii && yourkalorii <= 2000) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2000 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2000) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2000 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1700) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1700 < yourkalorii && yourkalorii <= 2200) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2200 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                } else if (2000 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2000) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {
                                int i = yourkalorii;
                                if (i <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < i && i <= 2300) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2300 < i && i <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }
                            }


                        }


                    }
                    if (veryactive) {
                        if (male) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                } else if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {

                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii<=2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }
                                if (2600 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, SportActivityLanch.class);
                                    startActivity(intent);
                                }
                            }
                        }
                        if (female) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1400) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1400 < yourkalorii && yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2200) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2200 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1700) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1700 < yourkalorii && yourkalorii <= 2200) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2200 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                } else if (2300 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2300) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2300) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityLanch.class);
                                    startActivity(intent);
                                }
                                if (2300 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultLanch.class);
                                    startActivity(intent);
                                }
                            }


                        }


                    }


                }


            }
        });
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!okeyw){
                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                    startActivity(intent);

                } else {
                    if (passive) {
                        if (male) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                } else if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {
                                int i = yourkalorii;
                                if (i <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < i && i <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < i && i <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }
                            }
                        }
                        if (female) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                } else if (2400 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {
                                int i = yourkalorii;
                                if (i <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < i && i <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < i && i <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }
                            }


                        }


                    }
                    if (middleactive) {
                        if (male) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                } else if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {
                                int i = yourkalorii;
                                if (i <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < i && i <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < i) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }
                            }
                        }
                        if (female) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1600) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1600 < yourkalorii && yourkalorii <= 2000) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2000 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2000) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2000 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1700) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1700 < yourkalorii && yourkalorii <= 2200) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2200 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                } else if (2000 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2000) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {
                                int i = yourkalorii;
                                if (i <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < i && i <= 2300) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2300 < i && i <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }
                            }


                        }


                    }
                    if (veryactive) {
                        if (male) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                } else if (2400 < yourkalorii) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {
                                int i = yourkalorii;
                                if (i <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < i && i <= 2400) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2400 < i && i <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }
                                if (i > 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, SportActivityDinner.class);
                                    startActivity(intent);
                                }

                            }
                        }
                        if (female) {
                            if (ageofme <= 13) {
                                if (yourkalorii <= 1400) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1400 < yourkalorii && yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }

                            }
                            if (ageofme <= 50 && ageofme > 30) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < yourkalorii && yourkalorii <= 2200) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2200 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme > 51) {
                                if (yourkalorii <= 1700) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1700 < yourkalorii && yourkalorii <= 2200) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2200 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }


                            }
                            if (ageofme <= 18 && 13 < ageofme) {
                                if (yourkalorii <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                } else if (2300 < yourkalorii && yourkalorii <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                } else if (1800 < yourkalorii && yourkalorii <= 2300) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                            }
                            if (ageofme <= 30 && 18 < ageofme) {
                                int i = yourkalorii;
                                if (i <= 1800) {
                                    Intent intent = new Intent(PromejutokActivity.this, BabyActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (1800 < i && i <= 2300) {
                                    Intent intent = new Intent(PromejutokActivity.this, TeenajerActivityDinner.class);
                                    startActivity(intent);
                                }
                                if (2300 < i && i <= 2600) {
                                    Intent intent = new Intent(PromejutokActivity.this, ActivityofAdultDinner.class);
                                    startActivity(intent);
                                }
                            }


                        }


                    }


                }
            }
        });


    }
}