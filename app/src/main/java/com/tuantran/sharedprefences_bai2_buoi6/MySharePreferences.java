package com.tuantran.sharedprefences_bai2_buoi6;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Set;

public class MySharePreferences {
    private static final String MY_SHARED_PREFERENCES = "MY_SHARED_PREFERENCES";
    private Context mContext;

    public MySharePreferences(Context mContext) {
        this.mContext = mContext;
    }
    //Boolean
    public void putBooleanValue(String key, boolean value){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(MY_SHARED_PREFERENCES,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }
    public boolean getBooleanValue(String key){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(MY_SHARED_PREFERENCES,Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(key,false);
    }
    //String
    public void putStringValue(String key, String value){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(MY_SHARED_PREFERENCES,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }
    public String getStringValue(String key){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(MY_SHARED_PREFERENCES,Context.MODE_PRIVATE);
        return sharedPreferences.getString(key,"");
    }
    //SetString
    public void putStringSetValue(String key, Set<String> values){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(MY_SHARED_PREFERENCES,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putStringSet(key, values);
        editor.apply();
    }
    public Set<String> getStringSetValue(String key){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(MY_SHARED_PREFERENCES,Context.MODE_PRIVATE);
        Set<String> vslueDefault = new HashSet<>();
        return sharedPreferences.getStringSet(key,vslueDefault);
    }

}
