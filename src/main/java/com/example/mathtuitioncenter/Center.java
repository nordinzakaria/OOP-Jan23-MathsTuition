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

    // display the names
    public void displayTeachers() {

    }

    public static void main(String args[]) {
        Center ipohcenter = new Center();


        RegularTeacher rteacher = new RegularTeacher();
        FreelanceTeacher fteacher = new FreelanceTeacher();

        // polymorphism
        ipohcenter.addTeacher(rteacher);
        ipohcenter.addTeacher(fteacher);
        ipohcenter.displayTeachers();
    }

}
