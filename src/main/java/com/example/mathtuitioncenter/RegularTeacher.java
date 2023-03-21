package com.example.mathtuitioncenter;

// inheritance
public class RegularTeacher extends Teacher {
    //has been declared in superclass
    // but can be override
    public float calcPay() {
        return 200;
    }

    public float calcBonus() {
        return 200;
    }


    public static void main(String args[]) {
        RegularTeacher rt = new RegularTeacher(); // parameter
        float pay = rt.calcPay();

    }

}
