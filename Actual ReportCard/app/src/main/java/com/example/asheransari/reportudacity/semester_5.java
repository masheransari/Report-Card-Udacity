package com.example.asheransari.reportudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/24/2016.
 */
public class semester_5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_list);

        ArrayList<semesterClass> arrayList = new ArrayList<semesterClass>();

        arrayList.add(new semesterClass("Computer Organization & Architecture","3.0",R.drawable.coa));
        arrayList.add(new semesterClass("Electromagnitic Field Theory","2.6",R.drawable.eletromagnitic));
        arrayList.add(new semesterClass("Data Analysis & Algorithm","3.3",R.drawable.data_analysis));
        arrayList.add(new semesterClass("Information Security","3.8",R.drawable.is));
        arrayList.add(new semesterClass("Operating System","3.1",R.drawable.os));
        arrayList.add(new semesterClass("Communication System","2.6",R.drawable.communi_system));

        semesterAdaper adapter = new semesterAdaper(this, arrayList);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
