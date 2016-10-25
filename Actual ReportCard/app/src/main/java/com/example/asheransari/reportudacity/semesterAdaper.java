package com.example.asheransari.reportudacity;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/24/2016.
 */
public class semesterAdaper extends ArrayAdapter<semesterClass> {

    public semesterAdaper(Activity activity, ArrayList<semesterClass> semesterClasses)
    {
        super(activity,0,semesterClasses);
    }
     private semesterClass aClass;
    @Override
    public View getView(int position, View converView, ViewGroup parent)
    {
        View listItemView = converView;
        if (listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
            semesterClass semesterClass = getItem(position);
        }
        aClass = getItem(position);

        TextView courseName = (TextView)listItemView.findViewById(R.id.module_name);
        courseName.setText(aClass.getmCourseName());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image_course);
        imageView.setImageResource(aClass.getmImageResourseID());

        TextView courseGpa = (TextView)listItemView.findViewById(R.id.module_gpa);
        double data = Double.valueOf(aClass.getmGpa().toString());

        GradientDrawable semesterDrawable = (GradientDrawable)courseGpa.getBackground();
        int color = color(data);
        semesterDrawable.setColor(color);
//        int colorName = color(data);
//        if (data<=4.0 && data>3.9)
//        {
//            courseGpa.setTextColor(Color.parseColor("#"+R.color.FourGpa));   /*R.color.FourGpa));*/
//        }
//        else if (data<=3.9 && data>3.7)
//        {
////            courseGpa.setTextColor(getContext().getColor(R.color.ThreeNine));
//            courseGpa.setTextColor(Color.parseColor("#"+R.color.ThreeNine));
//        }
//        else if (data<=3.7 && data>3.5)
//        {
//            courseGpa.setTextColor(Color.parseColor("#"+R.color.threeSeven));
//        }
//        else if (data<=3.5 && data>3.3)
//        {
//            courseGpa.setTextColor(Color.parseColor("#"+R.color.threeFive));

//        else if (data<=3.3 && data>3.0)
//        {
//            courseGpa.setTextColor(Color.parseColor("#"+R.color.threeThree));
//        }
//        else if (data<=3.0 && data>2.9)
//        {
//            courseGpa.setTextColor(Color.parseColor("#"+R.color.three));
//        }
//        else if (data<=2.9 && data>2.7)
//        {
//            courseGpa.setTextColor(Color.parseColor("#"+R.color.twoNine));
//        }
//        else if (data<=2.7 && data>2.3)
//        {
//            courseGpa.setTextColor(Color.parseColor("#"+R.color.twoSeven));
//        }
//        else if (data<=2.3 && data>2.0)
//        {
//            courseGpa.setTextColor(Color.parseColor("#"+R.color.twoThree));
//        }
//        else if (data<=2.0 && data>1.5)
//        {
//            courseGpa.setTextColor(Color.parseColor("#"+R.color.oneFive));
//        }
//        else
//        {
//            courseGpa.setTextColor(Color.parseColor("#"+R.color.afterOneFive));
//        }
        Log.e(getContext().getClass().getName(), "data ="+data);
        courseGpa.setText(aClass.getmGpa());

//        courseGpa.setTextColor(getContext().getColor(colorName));
//        courseGpa.setTextColor();

        return listItemView;
    }
    public int color(double data)
    {
        int returnColor=0;
//        TextView t = (TextView)v.findViewById(R.id.module_gpa);
//        String fetchCgpa = aClass.getmGpa();
//        double data = Double.valueOf(fetchCgpa);
        if (data<=4.0 && data>3.9)
        {
            returnColor =  R.color.FourGpa;
        }
        else if (data<=3.9 && data>3.7)
        {
            returnColor = R.color.ThreeNine;
        }
        else if (data<=3.7 && data>3.5)
        {
            returnColor = R.color.threeSeven;
        }
        else if (data<=3.5 && data>3.3)
        {
            returnColor = R.color.threeFive;
        }
        else if (data<=3.3 && data>3.0)
        {
            returnColor = R.color.threeThree;
        }
        else if (data<=3.0 && data>2.9)
        {
            returnColor = R.color.three;
        }
        else if (data<=2.9 && data>2.7)
        {
            returnColor = R.color.twoNine;
        }
        else if (data<=2.7 && data>2.3)
        {
            returnColor = R.color.twoSeven;
        }
        else if (data<=2.3 && data>2.0)
        {
            returnColor = R.color.twoThree;
        }
        else if (data<=2.0 && data>1.5)
        {
            returnColor = R.color.oneFive;
        }
        else
        {
            returnColor = R.color.afterOneFive;
        }
        return ContextCompat.getColor(getContext(), returnColor);
    }
}
