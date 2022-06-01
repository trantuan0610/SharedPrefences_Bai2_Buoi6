package com.tuantran.sharedprefences_bai2_buoi6;

import android.content.Context;

import java.util.Set;

public class DataLocalManager {
        public static String PREF_FIRST_INSTALL = "PREF_FIRST_INSTALL";
        public static String PREF_STRING = "PREF_STRING";
        public static String PREF_Name_USER = "PREF_Name_USER";

    private static DataLocalManager instance;
    private MySharePreferences mySharePreferences;

    public  static void init(Context context){
        instance =  new DataLocalManager();
        instance.mySharePreferences = new MySharePreferences(context);
    }

    public static DataLocalManager getInstance(){
        if(instance ==null){
            instance = new DataLocalManager();
        }
        return instance;
    }
    //boolean
    public static void setFirstInstalled(boolean isFirst){
        DataLocalManager.getInstance().mySharePreferences.putBooleanValue(PREF_FIRST_INSTALL,isFirst);
    }
    public static boolean getFirstInstalled(){
        return DataLocalManager.getInstance().mySharePreferences.getBooleanValue(PREF_FIRST_INSTALL);

    }
    //String
    public static void setStringValue(String str){
        DataLocalManager.getInstance().mySharePreferences.putStringValue(PREF_STRING,str);
    }
    public static String getStringValue(){
        return DataLocalManager.getInstance().mySharePreferences.getStringValue(PREF_STRING);

    }
    // SetString
    public static void setNameUsers(Set<String> nameUsers){
        DataLocalManager.getInstance().mySharePreferences.putStringSetValue(PREF_Name_USER,nameUsers);
    }
    public static Set<String> getNameUsers(){
        return DataLocalManager.getInstance().mySharePreferences.getStringSetValue(PREF_Name_USER);

    }
}
