package com.example.asheransari.reportudacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class semester_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_list);
        ArrayList<semesterClass> arrayList = new ArrayList<semesterClass>();
        arrayList.add(new semesterClass("Introduction To Computer", "3.2",R.drawable.introcomputer));
        arrayList.add(new semesterClass("Introduction To Programming", "3.5",R.drawable.intoprogramming));
        arrayList.add(new semesterClass("Basic Electronics", "2.9",R.drawable.basicelectronics));
        arrayList.add(new semesterClass("Islamiat", "3.0",R.drawable.islamiatpic));
        arrayList.add(new semesterClass("English (Functional)", "3.2",R.drawable.functional_english));
        arrayList.add(new semesterClass("Calculas Math", "3.2",R.drawable.calculus_math));

        semesterAdaper adapter = new semesterAdaper(this, arrayList);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

    }

