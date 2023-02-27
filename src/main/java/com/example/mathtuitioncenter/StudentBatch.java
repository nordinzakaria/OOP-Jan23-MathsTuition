package com.example.mathtuitioncenter;

public class StudentBatch {
    // data section
    // what is a StudentBatch
    // a StudentBatch is a list of students registered in a batch
    // "list of students"???? an array of Student
    Student students[] = new Student[10];
    int currsz = 0;

    // operation

    void add(Student s, int i) {
        students[i] = s;
    }

    // method overloading
    void add(Student s) {
        students[currsz++] = s;
    }

    // find a particular student
    boolean find(String name) {
        // loop thru the array students
        // for each student in students
        //    check whether name is the same as that in student
        for (int i=0; i<currsz; i++) {
            if (students[i].name.getFname() == name)
                return true;
        }
        return false;
    }

}