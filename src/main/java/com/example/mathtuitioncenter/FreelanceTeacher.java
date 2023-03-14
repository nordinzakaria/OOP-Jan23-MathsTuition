package com.example.mathtuitioncenter;

// inheritance
public class FreelanceTeacher extends Teacher {
    private int hours;


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
