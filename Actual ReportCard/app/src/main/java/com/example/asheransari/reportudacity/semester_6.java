package com.example.asheransari.reportudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/24/2016.
 */
public class semester_6 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_list);

        ArrayList<semesterClass> arrayList = new ArrayList<semesterClass>();
        arrayList.add(new semesterClass("Artificial Intelligence","3.4",R.drawable.ai));
        arrayList.add(new semesterClass("Entreprenureship","3.2",R.drawable.entrepre));
        arrayList.add(new semesterClass("Principle Of Marketing","2.7",R.drawable.principle_of_mangement));
        arrayList.add(new semesterClass("Web Designing & Development","3.6",R.drawable.web_design));
        arrayList.add(new semesterClass("Theory Of Automata","1.2",R.drawable.automata));
        arrayList.add(new semesterClass("Multivariate Calculas","3.5",R.drawable.calculus_math));
        arrayList.add(new semesterClass("Human Resourses Mangement","2.7",R.drawable.hr));

        semesterAdaper adapter = new semesterAdaper(this, arrayList);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
