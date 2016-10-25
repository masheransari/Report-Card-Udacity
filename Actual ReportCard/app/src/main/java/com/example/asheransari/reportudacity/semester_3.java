package com.example.asheransari.reportudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/24/2016.
 */
public class semester_3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_list);
        ArrayList<semesterClass> arrayList = new ArrayList<semesterClass>();

        arrayList.add(new semesterClass("Object Oriented Programming","3.8",R.drawable.oop));
        arrayList.add(new semesterClass("Technical Report Writing","2.8",R.drawable.technical_report));
        arrayList.add(new semesterClass("Probability & Statistics","3.5",R.drawable.probability));
        arrayList.add(new semesterClass("Digital Logic Design","3.2",R.drawable.logic_design));
        arrayList.add(new semesterClass("Data Communication & Network","2.9",R.drawable.data_comm_network));

        semesterAdaper adaper = new semesterAdaper(this, arrayList);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adaper);
    }
}
