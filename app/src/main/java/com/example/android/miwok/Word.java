package com.example.android.miwok;

import android.graphics.drawable.Drawable;

/**
 * Created by carlo on 12/20/17.
 */


//Contains words of default and Miwok translations
public class Word {

    //Default translation
    private String mDefaultTranslation;

    //Miwok Translation
    private String mMiwokTranslation;

    //Image
    private int mImageResourceId;

    //Audio
    private int mAudioResourceId;


    // 1st constructor for English, Miwok, and Audio parameters
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    // 2nd constructor for English, Miwok, Image, and Audio parameters
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    //Get default translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //Get Miwok translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //Get Image resource ID
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Get Audio resource ID
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
