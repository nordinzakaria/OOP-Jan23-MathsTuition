package com.example.mathtuitioncenter;

import java.util.*;

public class Center {
    // Center has list(s) of teachers, and student batches
    // there should be method for add and info display
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    private ArrayList<StudentBatch> sbs = new ArrayList<StudentBatch>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }


    public void addStudentBatch(StudentBatch sb) {

    }

    public float calcTotalPay() {
        float sum = 0;
        for (int i=0; i<teachers.size(); i++) {
            Teacher teacher = teachers.get(i);

            /* will work but not nice
            if (teacher instanceof RegularTeacher) {
                // casting
                RegularTeacher rt = (RegularTeacher) teacher;
                sum += rt.calcPay();
            }
            else if (teacher instanceof FreelanceTeacher) {
                // casting
                FreelanceTeacher rt = (FreelanceTeacher) teacher;
                sum += rt.calcPay();
            }
             */
            // declare calcPay inside the superclss
            sum += teacher.calcPay();

            System.out.println("Bonus is "+ teacher.calcBonus());


            System.out.println("Tax is "+ teacher.calcTaxRate());
            // 1 solution: put calcTax in Teacher
            //      issue: have to consider other Employees
        }

        return sum;
    }

    // display the names
    public void displayTeachers() {
        for (int i=0; i<teachers.size(); i++) {
            Teacher teacher = teachers.get(i);
            //System.out.println(teacher.name);
        }

    }

    public static void main(String args[]) {
        Center ipohcenter = new Center();


        RegularTeacher rteacher = new RegularTeacher();
        FreelanceTeacher fteacher = new FreelanceTeacher();

        // polymorphism
        ipohcenter.addTeacher(rteacher);
        ipohcenter.addTeacher(fteacher);
        ipohcenter.displayTeachers();

        float totalPay = ipohcenter.calcTotalPay();
    }

}
