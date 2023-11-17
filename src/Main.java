import model.Laptop;
import model.Student;
import service.StudentService;
import service.impl.StudentServiceImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentServiceImpl();

        Laptop laptop = new Laptop("Asus");
        System.out.println(laptop);



        Student student = new Student("Mederbek",26);
        Student student2 = new Student("Evelina",23);
        Student student3 = new Student("Asem",2);
        System.out.println(Arrays.toString(service.getAllStudent()));

        service.addStudent(student);
        System.out.println(Arrays.toString(service.getAllStudent()));
        service.addStudent(student2);
        System.out.println(Arrays.toString(service.getAllStudent()));
        service.addStudent(student3);
        System.out.println(Arrays.toString(service.getAllStudent()));


    }
}