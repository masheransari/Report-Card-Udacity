package com.example.asheransari.reportcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

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

        btn = (Button)findViewById(R.id.btnResult);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,semester_1.class);
                startActivity(i);
            }
        });
    }
}
