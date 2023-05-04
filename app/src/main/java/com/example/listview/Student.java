package com.example.listview;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Student {
    String name;
    String dob;
    String Class;
    ArrayList<String> subject;
    int image;


    public  Student (){};
    public Student (String name, String dob, String Class, ArrayList<String> subject, int image)
    {
        this.name= name;
        this.dob = dob;
        this.Class = Class;
        this.image = image;
        this.subject = subject;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @NonNull

    public String GetClass() {
        return Class;
    }

    public void setClass(String aClass) {
        Class = aClass;
    }

    public ArrayList<String> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<String> subject) {
        this.subject = subject;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
