package com.example.asheransari.reportudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/24/2016.
 */
public class semester_7 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_list);

        ArrayList<semesterClass> arrayList = new ArrayList<semesterClass>();

        arrayList.add(new semesterClass("Final Year Project Part-I","3.8",R.drawable.final_year));
        arrayList.add(new semesterClass("Digital Signal Processing","3.1",R.drawable.digital_signal));
        arrayList.add(new semesterClass("Mobile Application Development","3.6",R.drawable.mobile));
        arrayList.add(new semesterClass("Technoprenurship","2.7",R.drawable.entrepre));
        arrayList.add(new semesterClass("Fibre Design","1.2",R.drawable.fiber));

        semesterAdaper adapter = new semesterAdaper(this, arrayList);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
