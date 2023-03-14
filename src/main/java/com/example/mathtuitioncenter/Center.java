package com.example.mathtuitioncenter;

import java.util.*;

public class Center {
    // Center has list(s) of teachers, and student batches
    // there should be method for add and info display
    private ArrayList<RegularTeacher> rts = new ArrayList<RegularTeacher>();
    private ArrayList<FreelanceTeacher> fts = new ArrayList<FreelanceTeacher>();
    private ArrayList<StudentBatch> sbs = new ArrayList<StudentBatch>();

    public void addFTeacher(FreelanceTeacher ft) {

    }

    public void addRTeacher(RegularTeacher rt) {

    }

    public void addStudentBatch(StudentBatch sb) {

    }

    public void addTeacher(RegularTeacher rt) {


    }

    public void addTeacher(FreelanceTeacher rt) {


    }

    public void displayTeachers() {

    }


    public static void main(String args[]) {
        Center ipohcenter = new Center();

        RegularTeacher rteacher = new RegularTeacher();
        FreelanceTeacher fteacher = new FreelanceTeacher();

        ipohcenter.addTeacher(rteacher);
        ipohcenter.addTeacher(fteacher);
        ipohcenter.displayTeachers();
    }

}
