package com.example.mathtuitioncenter;

public class RegularTeacher extends Teacher {
    public float calcPay() {
        return 0;
    }

    public static void main(String args[]) {
        RegularTeacher rt = new RegularTeacher(); // parameter
        float pay = rt.calcPay();

    }

}
