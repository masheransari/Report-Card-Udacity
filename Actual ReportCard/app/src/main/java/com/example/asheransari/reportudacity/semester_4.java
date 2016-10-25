package com.example.asheransari.reportudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/24/2016.
 */
public class semester_4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_list);

        ArrayList<semesterClass> arrayList = new ArrayList<semesterClass>();
        arrayList.add(new semesterClass("Logic Design & Switching Theory","3.7",R.drawable.logic_design));
        arrayList.add(new semesterClass("Introduction To Database","3.4",R.drawable.database));
        arrayList.add(new semesterClass("Microprocessor Based System & Application","2.7",R.drawable.microprocessor));
        arrayList.add(new semesterClass("Data Structure & Algorithm","3.6",R.drawable.data_strucutre));
        arrayList.add(new semesterClass("Calculas & Analytical Geometry","3.2",R.drawable.analytical_geometry));
        arrayList.add(new semesterClass("Principle Of Management","2.9",R.drawable.principle_of_mangement));

        semesterAdaper adaper = new semesterAdaper(this, arrayList);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adaper);
    }
}
