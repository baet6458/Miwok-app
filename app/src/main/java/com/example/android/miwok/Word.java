package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation= miwokTranslation;
    }

    //return default translation
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
    //return the miwok translation
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
