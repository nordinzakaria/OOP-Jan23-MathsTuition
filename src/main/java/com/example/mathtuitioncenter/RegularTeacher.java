package com.example.mathtuitioncenter;

public class RegularTeacher {
    String name;
    String ic;
    String address;
    int numyearexp;
    String qualification;

    public float calcPay() {
        return 0;
    }

    public static void main(String args[]) {
        RegularTeacher rt = new RegularTeacher(); // parameter
        float pay = rt.calcPay();

    }

}
