package com.example.asheransari.reportudacity;

/**
 * Created by asher.ansari on 10/24/2016.
 */
public class semesterClass {
    private String mCourseName;
    private String mGpa;
    private int mImageResourseID;

    public semesterClass(String mCourseName, String mGpa) {
        this.mCourseName = mCourseName;
        this.mGpa = mGpa;
    }

    public semesterClass(String mCourseName, String mGpa, int mImageResourseID) {
        this.mCourseName = mCourseName;
        this.mGpa = mGpa;
        this.mImageResourseID = mImageResourseID;
    }
    public String getmCourseName() {
        return mCourseName;
    }

    public String getmGpa() {
        return mGpa;
    }

    public int getmImageResourseID() {
        return mImageResourseID;
    }
}
