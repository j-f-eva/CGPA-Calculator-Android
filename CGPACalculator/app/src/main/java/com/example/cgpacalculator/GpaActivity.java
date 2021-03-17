package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GpaActivity extends AppCompatActivity {

     private Button submitButton, clearButton;

     private EditText GPAeditText1,GPAeditText2,GPAeditText3,GPAeditText4,GPAeditText5,GPAeditText6,GPAeditText7,GPAeditText8;

     private EditText creditHourEditTEXT_1,creditHourEditTEXT_2,creditHourEditTEXT_3,creditHourEditTEXT_4,creditHourEditTEXT_5,creditHourEditTEXT_6,creditHourEditTEXT_7,creditHourEditTEXT_8;

     private TextView resultTextView, gpaPerSubTextView;

     private  double  gpa_1_Subject, gpa_2_Subject, gpa_3_Subject, gpa_4_Subject, gpa_5_Subject, gpa_6_Subject, gpa_7_Subject,gpa_8_Subject;

     private double creditHour_1_Subject,creditHour_2_Subject,creditHour_3_Subject,creditHour_4_Subject,creditHour_5_Subject,creditHour_6_Subject,creditHour_7_Subject,creditHour_8_Subject;

     private double Total_GPA_into_CreditHour, Total_Credit_Hour,  Result_GPA;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);
        linkup();
        processing();
    }

    private void linkup()
    {
        submitButton = findViewById(R.id.submit_button_ID);
        clearButton = findViewById(R.id.clear_button_ID);

        GPAeditText1 = findViewById(R.id.gpa_editText_1_ID);
        GPAeditText2 = findViewById(R.id.gpa_editText_2_ID);
        GPAeditText3 = findViewById(R.id.gpa_editText_3_ID);
        GPAeditText4 = findViewById(R.id.gpa_editText_4_ID);
        GPAeditText5 = findViewById(R.id.gpa_editText_5_ID);
        GPAeditText6 = findViewById(R.id.gpa_editText_6_ID);
        GPAeditText7 = findViewById(R.id.gpa_editText_7_ID);
        GPAeditText8 = findViewById(R.id.gpa_editText_8_ID);

        creditHourEditTEXT_1 = findViewById(R.id.creditHour_editText_1_ID);
        creditHourEditTEXT_2 = findViewById(R.id.creditHour_editText_2_ID);
        creditHourEditTEXT_3 = findViewById(R.id.creditHour_editText_3_ID);
        creditHourEditTEXT_4 = findViewById(R.id.creditHour_editText_4_ID);
        creditHourEditTEXT_5 = findViewById(R.id.creditHour_editText_5_ID);
        creditHourEditTEXT_6 = findViewById(R.id.creditHour_editText_6_ID);
        creditHourEditTEXT_7 = findViewById(R.id.creditHour_editText_7_ID);
        creditHourEditTEXT_8 = findViewById(R.id.creditHour_editText_8_ID);

        resultTextView = findViewById(R.id.result_gpa_ID);
        gpaPerSubTextView = findViewById(R.id.GPA_perSub_ID);


    }
    private void processing()
    {
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                //for input gpa
                String gpa1 = GPAeditText1.getText().toString();
                if (GPAeditText1.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter GPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (gpa1.equals("0"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Correct GPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                String gpa2 =  GPAeditText2.getText().toString();
                if (GPAeditText2.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter GPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (gpa2.equals("0"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Correct GPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                String gpa3 = GPAeditText3.getText().toString();
                if (GPAeditText3.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter GPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (gpa3.equals("0"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Correct GPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                String gpa4 = GPAeditText4.getText().toString();
                if (GPAeditText4.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter GPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (gpa4.equals("0"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Correct GPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                String gpa5 = GPAeditText5.getText().toString();
                if (GPAeditText5.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter GPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (gpa5.equals("0"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Correct GPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                String gpa6 = GPAeditText6.getText().toString();
                if (GPAeditText6.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter GPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (gpa6.equals("0"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Correct GPA",Toast.LENGTH_SHORT).show();
                    return;
                }



                String gpa7 = GPAeditText7.getText().toString();
                if (GPAeditText7.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter GPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (gpa7.equals("0"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Correct GPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                String gpa8 = GPAeditText8.getText().toString();
                if (GPAeditText8.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter GPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (gpa8.equals("0"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Correct GPA",Toast.LENGTH_SHORT).show();
                    return;
                }



                //for input cgredit hour
                String creditHour1 = creditHourEditTEXT_1.getText().toString();
                if (creditHourEditTEXT_1.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour1.equals("o"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }


                String creditHour2 = creditHourEditTEXT_2.getText().toString();
                if (creditHourEditTEXT_2.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour2.equals("o"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }


                String creditHour3 = creditHourEditTEXT_3.getText().toString();
                if (creditHourEditTEXT_3.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour3.equals("o"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }


                String creditHour4 = creditHourEditTEXT_4.getText().toString();
                if (creditHourEditTEXT_4.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour4.equals("o"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }


                String creditHour5 = creditHourEditTEXT_5.getText().toString();
                if (creditHourEditTEXT_5.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour5.equals("o"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }


                String creditHour6 = creditHourEditTEXT_6.getText().toString();
                if (creditHourEditTEXT_6.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour6.equals("o"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }


                String creditHour7 = creditHourEditTEXT_7.getText().toString();
                if (creditHourEditTEXT_7.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour7.equals("o"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }


                String creditHour8 = creditHourEditTEXT_8.getText().toString();
                if (creditHourEditTEXT_8.equals(""))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour8.equals("o"))
                {
                    Toast.makeText(GpaActivity.this,"Enter Credit Hour",Toast.LENGTH_SHORT).show();
                    return;
                }


                //converting gpa
                gpa_1_Subject = Double.parseDouble(gpa1);
                gpa_2_Subject = Double.parseDouble(gpa2);
                gpa_3_Subject = Double.parseDouble(gpa3);
                gpa_4_Subject = Double.parseDouble(gpa4);
                gpa_5_Subject = Double.parseDouble(gpa5);
                gpa_6_Subject = Double.parseDouble(gpa6);
                gpa_7_Subject = Double.parseDouble(gpa7);
                gpa_8_Subject = Double.parseDouble(gpa8);

                //converting credit hour
                creditHour_1_Subject = Double.parseDouble(creditHour1);
                creditHour_2_Subject = Double.parseDouble(creditHour2);
                creditHour_3_Subject = Double.parseDouble(creditHour3);
                creditHour_4_Subject = Double.parseDouble(creditHour4);
                creditHour_5_Subject = Double.parseDouble(creditHour5);
                creditHour_6_Subject = Double.parseDouble(creditHour6);
                creditHour_7_Subject = Double.parseDouble(creditHour7);
                creditHour_8_Subject = Double.parseDouble(creditHour8);

                //error handeling for gpa
                if (gpa_1_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (gpa_2_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (gpa_3_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (gpa_4_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (gpa_5_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (gpa_6_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (gpa_7_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (gpa_8_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }


                //error handelling for credit hour
                if (creditHour_1_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour_2_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour_3_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour_4_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour_5_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour_6_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour_7_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (creditHour_8_Subject>4)
                {
                    Toast.makeText(GpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                //calculating
                Total_Credit_Hour = creditHour_1_Subject+creditHour_2_Subject+creditHour_3_Subject+creditHour_4_Subject+creditHour_5_Subject+creditHour_6_Subject+creditHour_7_Subject+creditHour_8_Subject;

                Total_GPA_into_CreditHour =  gpa_1_Subject * creditHour_1_Subject + gpa_2_Subject * creditHour_2_Subject + gpa_3_Subject * creditHour_3_Subject + gpa_4_Subject * creditHour_4_Subject + gpa_5_Subject * creditHour_5_Subject + gpa_6_Subject * creditHour_6_Subject + gpa_7_Subject * creditHour_7_Subject + gpa_8_Subject * creditHour_8_Subject;

                Result_GPA = Total_GPA_into_CreditHour / Total_Credit_Hour;

                resultTextView.setText("GPA: "+String.format("%.2f", Result_GPA));

//                total_GPA =  gpa_1_Subject + gpa_2_Subject + gpa_3_Subject + gpa_4_Subject + gpa_5_Subject + gpa_6_Subject + gpa_7_Subject + gpa_8_Subject;
//                avg_GPA = total_GPA / 8 ;

//                resultTextView.setText("GPA: "+String.format("%.2f", avg_GPA));


            }
        });


        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //clear result
                resultTextView.setText("");

                //clear gpa
                GPAeditText1.setText("");
                GPAeditText2.setText("");
                GPAeditText3.setText("");
                GPAeditText4.setText("");
                GPAeditText5.setText("");
                GPAeditText6.setText("");
                GPAeditText7.setText("");
                GPAeditText8.setText("");

                //clear credit hour
                creditHourEditTEXT_1.setText("");
                creditHourEditTEXT_2.setText("");
                creditHourEditTEXT_3.setText("");
                creditHourEditTEXT_4.setText("");
                creditHourEditTEXT_5.setText("");
                creditHourEditTEXT_6.setText("");
                creditHourEditTEXT_7.setText("");
                creditHourEditTEXT_8.setText("");

            }

        });

    }

}
