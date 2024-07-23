package vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Interface;

import vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model.Course;
import vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model.CourseOnline;
import vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model.Student;

public interface ClassRoomInterface {
    void addStudent(Student student);
    void removeStudent(int id);
    void editStudent(int id, Student student);
    void displayStudents();
    void displayStudent(int studentId);
    Student getStudentById(int studentId);

    void addCourse(CourseOnline courseOnline);
    void removeCourse(int id);
    void editCourse(int id, CourseOnline courseOnline);
    void displayCourses();
    void displayDetailCourse(int courseId);
    CourseOnline getCourseById(int courseId);
    static void showInterface(){
        System.out.println("Day la interface");
    }
}
