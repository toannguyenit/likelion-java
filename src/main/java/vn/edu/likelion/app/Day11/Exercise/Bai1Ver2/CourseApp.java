package vn.edu.likelion.app.Day11.Exercise.Bai1Ver2;

import vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model.ClassRoom;
import vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model.CourseOnline;
import vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class CourseApp {
    static ClassRoom lopBEBasic = new ClassRoom();


    public static void main(String[] args) {
        lopBEBasic.setStudentCourseMap(new HashMap<Integer, Set<Integer>>());

        CourseOnline courseOnline1 =
                new CourseOnline(1, "Java", "Tuan Mentor", 2, "W3School", 12);
        CourseOnline courseOnline2 =
                new CourseOnline(2, "PHP", "Tuan Mentor", 2, "W3School", 12);
        CourseOnline courseOnline3 =
                new CourseOnline(3, "Python", "Duong Mentor", 2, "Hackranker", 12);
        CourseOnline courseOnline4 =
                new CourseOnline(4, "NodeJs", "Duong Mentor", 2, "Hackranker", 12);

        Student student1 = new Student(1, "Nguyen Duc Tan", 26, "Nam", "Tan Binh");
        Student student2 = new Student(2, "Vo Trung Kien", 25, "Nam", "Binh Thanh");
        Student student3 = new Student(3, "Nguyen Vo Song Toan", 28, "Nam", "Thu Duc");
        Student student4 = new Student(4, "Bui Quoc Thinh", 22, "Nam", "Quan 12");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        lopBEBasic.setStudents(students);

        List<CourseOnline> courseOnlineList = new ArrayList<>();
        courseOnlineList.add(courseOnline1);
        courseOnlineList.add(courseOnline2);
        courseOnlineList.add(courseOnline3);
        courseOnlineList.add(courseOnline4);
        lopBEBasic.setCourseOnlines(courseOnlineList);

        // Run App
        CourseOnline courseOnline5 =
                new CourseOnline(5, "Ruby", "Duong Mentor", 3, "Hackranker", 12);
        lopBEBasic.addCourse(courseOnline5);

        Student student5 = new Student(5, "Le Thu Ha", 23, "Nu", "Binh Thanh");
        lopBEBasic.addStudent(student5);

        // Viet phuong thuc displayDetailCourse() de hien thi chi tiet khoa hoc
//        lopBEBasic.displayDetailCourse(1);

        // Viet phuong thuc displayStudents() de hien thi cac hoc vien cua khoa
//        lopBEBasic.displayStudents();

        // Them 1 hoc sinh, join 1 courseOneline
        lopBEBasic.addStudentCourse(1,1);
        lopBEBasic.addStudentCourse(1,2);
        lopBEBasic.addStudentCourse(1,3);
        lopBEBasic.addStudentCourse(2,1);
        lopBEBasic.addStudentCourse(2,2);
        lopBEBasic.addStudentCourse(3,1);
        lopBEBasic.addStudentCourse(2,2);

        System.out.println(lopBEBasic.getStudentCourseMap().get(1));

        // Lay toan bo course cua 1 hoc sinh
        System.out.println(lopBEBasic.getCoursesByStudentId(2).size());
        System.out.println(lopBEBasic.getCoursesByStudentId(1).size());



        // Lay toan bo hoc sinh cua 1 course

    }
}
