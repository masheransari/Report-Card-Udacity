package com.example.asheransari.reportcard;

/**
 * Created by asher.ansari on 10/23/2016.
 */
public class semesterClass {
    private String mCourseName;
    private String mGpa;
//    private int mImageResourseID;

    public semesterClass(String mCourseName, String mGpa) {
        this.mCourseName = mCourseName;
        this.mGpa = mGpa;
//        this.mImageResourseID = mImageResourseID;
    }

    public String getmCourseName() {
        return mCourseName;
    }

    public String getmGpa() {
        return mGpa;
    }

//    public int getmImageResourseID() {
//        return mImageResourseID;
//    }
}
