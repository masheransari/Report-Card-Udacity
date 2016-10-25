package com.example.asheransari.reportudacity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/24/2016.
 */
public class semester_2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_list);

        ArrayList<semesterClass> arrayList = new ArrayList<semesterClass>();
        arrayList.add(new semesterClass("Basic Electric Circuit","2.9",R.drawable.basicelectronics));
        arrayList.add(new semesterClass("Telecommunication Engineering","1.4",R.drawable.telecommnication_engr));
        arrayList.add(new semesterClass("Differential Equation","3.4",R.drawable.differential_equation));
        arrayList.add(new semesterClass("Communication Skills","3.0",R.drawable.comunication_skill));
        arrayList.add(new semesterClass("Applied Physics","2.5",R.drawable.physics));

        semesterAdaper adaper = new semesterAdaper(this,arrayList);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adaper);

    }
}
