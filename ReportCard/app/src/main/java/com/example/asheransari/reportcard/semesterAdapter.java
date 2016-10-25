package com.example.asheransari.reportcard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/23/2016.
 */
public class semesterAdapter extends ArrayAdapter<semesterClass>{

    public semesterAdapter(Activity activity, ArrayList<semesterClass> arrayList)
    {
        super(activity,0,arrayList);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list, parent, false);
        }

        semesterClass aClass = getItem(position);

        TextView courseName = (TextView)listItemView.findViewById(R.id.module_name);
        courseName.setText(aClass.getmCourseName());

        TextView courseGpa = (TextView)listItemView.findViewById(R.id.module_gpa);
        courseGpa.setText(aClass.getmGpa());

//        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image_course);
//        imageView.setImageResource(aClass.getmImageResourseID());

        return listItemView;


    }
}
