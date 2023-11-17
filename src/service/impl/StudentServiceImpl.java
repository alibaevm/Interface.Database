package service.impl;

import db.DataBase;
import model.Student;
import service.StudentService;

import java.util.Arrays;

public class StudentServiceImpl implements StudentService {


    DataBase dataBase = new DataBase();
    @Override
    public void addStudent(Student newStudent) {
         Student[] students = Arrays.copyOf(dataBase.students, dataBase.students.length + 1);
        students[students.length - 1]= newStudent;
        dataBase.students = students;

    }

    @Override
    public Student[] getAllStudent() {
        return dataBase.students;
    }
}
