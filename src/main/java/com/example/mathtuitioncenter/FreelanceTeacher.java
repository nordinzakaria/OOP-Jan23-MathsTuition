package com.example.mathtuitioncenter;

public class FreelanceTeacher {
    private String name;
    private String ic;
    private String address;
    private int numyearexp;
    private String qualification;
    private int hours;

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

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public float calcPay() {
        return 0;
    }

    public  static void main(String args[]) {
        FreelanceTeacher ft = new FreelanceTeacher();
        ft.setHours(10);
        float pay = ft.calcPay();

    }

}
