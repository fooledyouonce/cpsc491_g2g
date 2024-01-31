package com.example.got2go.models;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("sustainable_materials_language")
public class Material extends ParseObject {

    public static final String KEY_CATEGORY = "category";
    public static final String KEY_RECYCLABLE = "recyclable";
    public static final String KEY_LOCATION = "location";

    public String getCategory() {
        return getString(KEY_CATEGORY);
    }

    public void setCategory(String category) {
        put(KEY_CATEGORY, category);
    }

    public Boolean getRecyclable() {
        return getBoolean(KEY_RECYCLABLE);
    }

    public void setRecyclable(Boolean recyclable) {
        put(KEY_CATEGORY, recyclable);
    }

    public String getLocation() {
        return getString(KEY_LOCATION);
    }

    public void setLocation(String location) {
        put(KEY_CATEGORY, location);
    }
}

