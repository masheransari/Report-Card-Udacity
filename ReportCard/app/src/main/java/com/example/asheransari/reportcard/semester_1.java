package com.example.asheransari.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/23/2016.
 */
public final class semester_1 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
//        Log.e("")
        ArrayList<semesterClass> arrayList = new ArrayList<semesterClass>();
        arrayList.add(new semesterClass("Introduction To Comuter", "3.2"));
        arrayList.add(new semesterClass("Introduction To Programming", "3.5"));
        arrayList.add(new semesterClass("Basic Electronics", "2.9"));
        arrayList.add(new semesterClass("Islamiat", "3.0"));
        arrayList.add(new semesterClass("English (Functional)", "3.2"));
        arrayList.add(new semesterClass("Calculas Math", "3.2"));

        semesterAdapter adapter = new semesterAdapter(this, arrayList);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
