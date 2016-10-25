package com.example.asheransari.reportudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerSemester;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String semester[] = {"1","2","3","4","5","6","7","8"};
        spinnerSemester = (Spinner)findViewById(R.id.spinSemester);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, semester);
        spinnerSemester.setAdapter(arrayAdapter);
        final EditText editText = (EditText)findViewById(R.id.editTextName);

        btn = (Button)findViewById(R.id.btnResult);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinnerSemester = (Spinner)findViewById(R.id.spinSemester);

                int semester  = Integer.valueOf(spinnerSemester.getSelectedItem().toString());
//                semester = "semester_"+spinnerSemester+".class";
                String name = editText.getText().toString();
                Intent i;
                if (name.equals("")|| name.isEmpty()) {
                    Toast.makeText(MainActivity.this,"Please Fill The Name First",Toast.LENGTH_LONG).show();
                }
                else
                {
                    switch (semester) {
                        case 1: {
                            i = new Intent(MainActivity.this, semester_1.class);
                            break;
                        }
                        case 2: {
                            i = new Intent(MainActivity.this, semester_2.class);
                            break;
                        }
                        case 3: {
                            i = new Intent(MainActivity.this, semester_3.class);
                            break;
                        }
                        case 4: {
                            i = new Intent(MainActivity.this, semester_4.class);
                            break;
                        }
                        case 5: {
                            i = new Intent(MainActivity.this, semester_5.class);
                            break;
                        }
                        case 6: {
                            i = new Intent(MainActivity.this, semester_6.class);
                            break;
                        }
                        case 7: {
                            i = new Intent(MainActivity.this, semester_7.class);
                            break;
                        }
                        case 8: {
                            i = new Intent(MainActivity.this, semester_8.class);
                            break;
                        }
                        default: {
                            i = new Intent(MainActivity.this, semester_1.class);
                            break;
                        }
                    }
//                    Toast.makeText(MainActivity.this, "selectedItem =" + semester, Toast.LENGTH_SHORT).show();
                    startActivity(i);
                }
            }
        });
    }
}
