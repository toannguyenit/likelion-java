package vn.edu.likelion.app.Day11.Exercise.Bai2.Interface;

import vn.edu.likelion.app.Day11.Exercise.Bai2.Model.ClassRoom;
import vn.edu.likelion.app.Day11.Exercise.Bai2.Model.Student;
import vn.edu.likelion.app.Day11.Exercise.Bai2.Model.StudentStopStudy;
import vn.edu.likelion.app.Day11.Exercise.Bai2.Model.Teacher;

public interface SchoolInterface  {
    void insertStudent(Student student);
    void showAllStudent();
    void showStudentByCitizenId(String citizendId);
    void updateStudent(Student student);
    void removeStudent(String citizenId);
    Student findStudentByCitizenId(String citizenId);

    void insertTeacher(Teacher teacher);
    void showAllTeacher();
    void showTeacherByCitizenId(String teacherId);
    void updateTeacher(Teacher teacher);
    void removeTeacher(String teacherId);
    Teacher findTeacherById(String teacherId);


    void insertClassRoom(ClassRoom classRoom);
    void showAllClassRoom();
    void showClassRoomByCitizenId(String classId);
    void updateClassRoom(ClassRoom classRoom);
    void removeClassRoom(String classId);
    ClassRoom findClassRoomById(String classId);

    void insertStudentStopStudy(StudentStopStudy studentStopStudy);
    void showAllStudentStopStudy();
    void showStudentStopStudyByCitizenId(String citizenId);
    void updateStudentStopStudy(StudentStopStudy studentStopStudy);
    void removeStudentStopStudy(String citizenId);
    StudentStopStudy findStudentStopStudyById(String citizenId);
}
