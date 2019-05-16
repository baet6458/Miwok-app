package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    private int resourceid=No_IMAGE_PROVIDED ;

    private static final int No_IMAGE_PROVIDED =-1;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation= miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int id){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        resourceid=id;
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
}
