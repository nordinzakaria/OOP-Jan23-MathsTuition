package com.example.mathtuitioncenter;

public class Name {

    private String fname;
    private String lname;
    private String mname;

    public Name() {
        this.fname = "fname";
        this.lname = "lname";
        this.mname = "mname";

    }

    public Name(String fname, String lname, String mname) {
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
    }

    public void setFName(String fname) {
        // "this" refers to the class attributes
        this.fname = fname;
    }

    public void setMName(String mname) {
        // "this" refers to the class attributes
        this.mname = mname;
    }

    public void setLName(String lname) {
        // "this" refers to the class attributes
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getMname() {
        return mname;
    }
}