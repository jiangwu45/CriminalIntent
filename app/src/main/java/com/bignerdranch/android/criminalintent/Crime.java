package com.bignerdranch.android.criminalintent;

import android.text.format.DateFormat;
import android.util.Log;

import java.util.Date;
import java.util.UUID;

/**
 * Created by DELL on 2016/7/28.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
        Log.d("test",date.toString());
    }

    public Crime() {
        //Generate unique identifier
        mId = UUID.randomUUID();

        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
