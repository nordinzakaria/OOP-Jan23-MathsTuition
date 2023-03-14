package com.example.mathtuitioncenter;

// createed by team in Bangalore
public class Teacher {
    // data
    private String name;
    private String ic;
    private String address;
    private int numyearexp;
    private String qualification;

    // op


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumyearexp() {
        return numyearexp;
    }

    public void setNumyearexp(int numyearexp) {
        this.numyearexp = numyearexp;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public abstract float calcPay();

    public static void main(String args[]) {
        // why the above is not good
        Teacher t = new Teacher();
        System.out.println(t.calcPay());

    }

}