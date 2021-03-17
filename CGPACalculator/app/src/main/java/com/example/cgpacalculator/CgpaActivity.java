package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CgpaActivity extends AppCompatActivity {

    private Button submitButton, clearButton;
    private EditText CGPAeditText1,CGPAeditText2,CGPAeditText3,CGPAeditText4,CGPAeditText5,CGPAeditText6,CGPAeditText7,CGPAeditText8;
    private TextView resulTextView, CGPA_PerSemester_TextView;
    private double cgpa_1_semester,cgpa_2_semester,cgpa_3_semester,cgpa_4_semester,cgpa_5_semester,cgpa_6_semester,cgpa_7_semester,cgpa_8_semester;
    private double total_CGPA, avg_CGPA ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);
        linkup();
        processing();
    }

    private void linkup()
    {
        submitButton = findViewById(R.id.submit_button_CGPA_ID);
        clearButton = findViewById(R.id.clear_button_CGPA_ID);

        CGPAeditText1 = findViewById(R.id.CGPA_EditText_1_ID);
        CGPAeditText2 = findViewById(R.id.CGPA_EditText_2_ID);
        CGPAeditText3 = findViewById(R.id.CGPA_EditText_3_ID);
        CGPAeditText4 = findViewById(R.id.CGPA_EditText_4_ID);
        CGPAeditText5 = findViewById(R.id.CGPA_EditText_5_ID);
        CGPAeditText6 = findViewById(R.id.CGPA_EditText_6_ID);
        CGPAeditText7 = findViewById(R.id.CGPA_EditText_7_ID);
        CGPAeditText8 = findViewById(R.id.CGPA_EditText_8_ID);

        resulTextView = findViewById(R.id.result_cgpa_ID);
        CGPA_PerSemester_TextView = findViewById(R.id.CGPA_Semeseter_TextView_ID);

    }

    private void processing()
    {
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String cgpa1 = CGPAeditText1.getText().toString();
              if (CGPAeditText1.equals(""))
              {
                  Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                  return;
              }
              if(CGPAeditText1.equals("0"))
              {
                  Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                  return;
              }


                String cgpa2 = CGPAeditText2.getText().toString();
                if (CGPAeditText2.equals(""))
                {
                    Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(CGPAeditText2.equals("0"))
                {
                    Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                String cgpa3 = CGPAeditText3.getText().toString();
                if (CGPAeditText3.equals(""))
                {
                    Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(CGPAeditText3.equals("0"))
                {
                    Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }

                String cgpa4 = CGPAeditText4.getText().toString();
                if (CGPAeditText4.equals(""))
                {
                    Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(CGPAeditText4.equals("0"))
                {
                    Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }

                String cgpa5 = CGPAeditText5.getText().toString();
                if (CGPAeditText5.equals(""))
                {
                    Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(CGPAeditText5.equals("0"))
                {
                    Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }

                String cgpa6 = CGPAeditText6.getText().toString();
                if (CGPAeditText6.equals(""))
                {
                    Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(CGPAeditText6.equals("0"))
                {
                    Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                String cgpa7 = CGPAeditText7.getText().toString();
                if (CGPAeditText7.equals(""))
                {
                    Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(CGPAeditText7.equals("0"))
                {
                    Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }

                String cgpa8 = CGPAeditText8.getText().toString();
                if (CGPAeditText8.equals(""))
                {
                    Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(CGPAeditText8.equals("0"))
                {
                    Toast.makeText(CgpaActivity.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                cgpa_1_semester = Double.parseDouble(cgpa1);
                cgpa_2_semester = Double.parseDouble(cgpa2);
                cgpa_3_semester = Double.parseDouble(cgpa3);
                cgpa_4_semester = Double.parseDouble(cgpa4);
                cgpa_5_semester = Double.parseDouble(cgpa5);
                cgpa_6_semester = Double.parseDouble(cgpa6);
                cgpa_7_semester = Double.parseDouble(cgpa7);
                cgpa_8_semester = Double.parseDouble(cgpa8);


                if (cgpa_1_semester>4)
                {
                    Toast.makeText(CgpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (cgpa_2_semester>4)
                {
                    Toast.makeText(CgpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (cgpa_3_semester>4)
                {
                    Toast.makeText(CgpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (cgpa_4_semester>4)
                {
                    Toast.makeText(CgpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (cgpa_5_semester>4)
                {
                    Toast.makeText(CgpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (cgpa_6_semester>4)
                {
                    Toast.makeText(CgpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (cgpa_7_semester>4)
                {
                    Toast.makeText(CgpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (cgpa_8_semester>4)
                {
                    Toast.makeText(CgpaActivity.this,"Enter less or equal 4",Toast.LENGTH_SHORT).show();
                    return;
                }


                total_CGPA = cgpa_1_semester + cgpa_2_semester + cgpa_3_semester + cgpa_4_semester + cgpa_5_semester + cgpa_6_semester + cgpa_7_semester + cgpa_8_semester;

                avg_CGPA =   total_CGPA/ 8 ;

                resulTextView.setText("Total CGPA: "+String.format("%.2f", avg_CGPA));

            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                resulTextView.setText("");

                CGPAeditText1.setText("");
                CGPAeditText2.setText("");
                CGPAeditText3.setText("");
                CGPAeditText4.setText("");
                CGPAeditText5.setText("");
                CGPAeditText6.setText("");
                CGPAeditText7.setText("");
                CGPAeditText8.setText("");
            }

        });

    }














}
