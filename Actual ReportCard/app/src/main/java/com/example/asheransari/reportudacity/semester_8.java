package com.example.asheransari.reportudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/24/2016.
 */
public class semester_8 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_list);

        ArrayList<semesterClass> arrayList = new ArrayList<semesterClass>();

        arrayList.add(new semesterClass("Final Year Project Part-II","3.6",R.drawable.final_year));
        arrayList.add(new semesterClass("Wireless Communication","3.0",R.drawable.communi_system));
        arrayList.add(new semesterClass("Digital Image Processing","3.4",R.drawable.digital_signal));
        arrayList.add(new semesterClass("Software Engineering","3.0",R.drawable.engineering));

        semesterAdaper adapter = new semesterAdaper(this, arrayList);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
