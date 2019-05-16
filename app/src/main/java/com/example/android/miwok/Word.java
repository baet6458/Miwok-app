package com.example.android.miwok;

import android.media.MediaPlayer;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    private int mediaResource;

    private int resourceid=No_IMAGE_PROVIDED ;

    private static final int No_IMAGE_PROVIDED =-1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mediaResource = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,
                int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        resourceid = imageResourceId;
        mediaResource = audioResourceId;
    }




    //return default translation
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
    //return the miwok translation
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getResourceid(){return resourceid;}

    //return if a word has an image
    public boolean hasImage(){
        return resourceid!=No_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){return mediaResource;}

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mediaResource=" + mediaResource +
                ", resourceid=" + resourceid +
                '}';
    }
}
