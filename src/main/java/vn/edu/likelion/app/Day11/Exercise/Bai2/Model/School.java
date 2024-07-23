package vn.edu.likelion.app.Day11.Exercise.Bai2.Model;

import vn.edu.likelion.app.Day11.Exercise.Bai2.Interface.SchoolInterface;

import java.util.ArrayList;
import java.util.List;

public class School implements SchoolInterface {
    private static List<Student> students = new ArrayList<>();
    private static List<Teacher> teachers = new ArrayList<>();
    private static List<ClassRoom> classes = new ArrayList<>();
    private static List<StudentStopStudy> studentStopStudies = new ArrayList<>();

    public static List<Student> getStudents() {
        return students;
    }

    public static void setStudents(List<Student> students) {
        School.students = students;
    }

    public static List<Teacher> getTeachers() {
        return teachers;
    }

    public static void setTeachers(List<Teacher> teachers) {
        School.teachers = teachers;
    }

    public static List<ClassRoom> getClasses() {
        return classes;
    }

    public static void setClasses(List<ClassRoom> classes) {
        School.classes = classes;
    }

    public static List<StudentStopStudy> getStudentStopStudies() {
        return studentStopStudies;
    }

    public static void setStudentStopStudies(List<StudentStopStudy> studentStopStudies) {
        School.studentStopStudies = studentStopStudies;
    }

    /**
     *
     * Override Interface for Student
     */

    @Override
    public void insertStudent(Student student) {
        students.add(student);
        System.out.println("Thêm học sinh " + student.getName() + " thành công!");
    }

    @Override
    public void showAllStudent() {
        for (Student student : students) {
            System.out.println(student.toString());
        }

    }

    @Override
    public void showStudentByCitizenId(String citizendId) {
        for (Student student : students) {
            if (student.getCitizenId().equals(citizendId)) {
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public void updateStudent(Student student) {
        for (Student studentItem : students) {
            if (studentItem.getCitizenId().equals(student.getCitizenId())) {
                studentItem.setId(student.getId());
                studentItem.setName(student.getName());
            }
        }
    }

    @Override
    public void removeStudent(String citizenId) {
        students.remove(findStudentByCitizenId(citizenId));
    }

    @Override
    public Student findStudentByCitizenId(String citizenId) {
        Student studentResult = new Student();
        for (Student student : students) {
            if (student.getCitizenId().equals(citizenId)) {
                studentResult.setCitizenId(citizenId);
                studentResult.setName(student.getName());
                studentResult.setId(student.getId());
            }
        }
        return studentResult;
    }


    /**
     *
     * Override Interface for Teacher
     */

    @Override
    public void insertTeacher(Teacher teacher) {
        if (teachers.size() >= 3) {
            System.out.println("Thêm giáo viên " + teacher.getName() + " thất bại !!");
            System.out.println("Số giáo viên đã đủ");
            return;
        }
        teachers.add(teacher);
        System.out.println("Thêm giáo viên " + teacher.getName() + " thành công");
    }

    @Override
    public void showAllTeacher() {

    }

    @Override
    public void showTeacherByCitizenId(String teacherId) {

    }

    @Override
    public void updateTeacher(Teacher teacher) {

    }

    @Override
    public void removeTeacher(String teacherId) {

    }

    @Override
    public Teacher findTeacherById(String teacherId) {
        return null;
    }


    /**
     *
     * Override Interface for ClassRoom
     */

    @Override
    public void insertClassRoom(ClassRoom classRoom) {
        if (classes.size() >= 3) {
            System.out.println("Thêm lớp học " + classRoom.getId() +" thất bại");
            System.out.println("Số lớp đã đủ");
            return;
        }
        classes.add(classRoom);
        System.out.println("Thêm lớp học " + classRoom.getId() +" thành công");
    }

    @Override
    public void showAllClassRoom() {
        for (ClassRoom classRoom : classes){

        }
    }

    @Override
    public void showClassRoomByCitizenId(String classId) {

    }

    @Override
    public void updateClassRoom(ClassRoom classRoom) {

    }

    @Override
    public void removeClassRoom(String classId) {

    }

    @Override
    public ClassRoom findClassRoomById(String classId) {
        return null;
    }


    /**
     *
     * Override Interface for StudentStopStudy
     */

    @Override
    public void insertStudentStopStudy(StudentStopStudy studentStopStudy) {
        studentStopStudies.add(studentStopStudy);
    }

    @Override
    public void showAllStudentStopStudy() {

    }

    @Override
    public void showStudentStopStudyByCitizenId(String citizenId) {

    }

    @Override
    public void updateStudentStopStudy(StudentStopStudy studentStopStudy) {

    }

    @Override
    public void removeStudentStopStudy(String citizenId) {

    }

    @Override
    public StudentStopStudy findStudentStopStudyById(String citizenId) {
        return null;
    }
}
