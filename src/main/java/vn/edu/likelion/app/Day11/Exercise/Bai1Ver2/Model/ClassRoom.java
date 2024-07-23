package vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model;

import vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Interface.ClassRoomInterface;

import java.util.*;

public class ClassRoom implements ClassRoomInterface {
    private static List<Student> students;
    private static List<CourseOnline> courseOnlines;
    private static Map<Integer , Set<Integer>> studentCourseMap = new HashMap<Integer, Set<Integer>>();


    public ClassRoom() {
    }

    public static List<Student> getStudents() {
        return students;
    }

    public static void setStudents(List<Student> students) {
        ClassRoom.students = students;
    }

    public static List<CourseOnline> getCourseOnlines() {
        return courseOnlines;
    }

    public static void setCourseOnlines(List<CourseOnline> courseOnlines) {
        ClassRoom.courseOnlines = courseOnlines;
    }

    public static Map<Integer, Set<Integer>> getStudentCourseMap() {
        return studentCourseMap;
    }

    public static void setStudentCourseMap(Map<Integer, Set<Integer>> studentCourseMap) {
        ClassRoom.studentCourseMap = studentCourseMap;
    }

    public static void removeStudentCourse(int studentId, int courseId) {
        studentCourseMap.remove(studentId, courseId);
    }

    public void addStudentCourse(int studentId, int courseId) {
        if (!studentCourseMap.containsKey(studentId)) {
            studentCourseMap.put(studentId, new HashSet<>());
        }

        for (Map.Entry<Integer, Set<Integer>> entry : studentCourseMap.entrySet()) {
            if (entry.getKey() == studentId) {
                entry.getValue().add(courseId);
            }
        }
    }

    public List<CourseOnline> getCoursesByStudentId(int studentId) {
        List<CourseOnline> courses = new ArrayList<>();
        for (Map.Entry<Integer, Set<Integer>> entry : studentCourseMap.entrySet()) {
            if (entry.getKey() == studentId) {
//                courses.add
            }
        }
        return courses;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(int id) {
        students.remove(getStudentById(id));
    }

    @Override
    public void editStudent(int id, Student student) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(student.getName());
                s.setAge(student.getAge());
                s.setAddress(student.getAddress());
                s.setGender(student.getGender());
            }
        }
    }

    @Override
    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    @Override
    public void displayStudent(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public Student getStudentById(int studentId) {
        Student student = new Student();
        for (Student s : students) {
            if (s.getId() == studentId) {
//                student.setId(s.getId());
//                student.setName(s.getName());
//                student.setAge(s.getAge());
//                student.setAddress(s.getAddress());
//                student.setGender(s.getGender());
                return s;
            }
        }
        return null;
    }

    @Override
    public void addCourse(CourseOnline course) {
        courseOnlines.add(new CourseOnline());
    }

    @Override
    public void removeCourse(int id) {
        courseOnlines.remove(getCourseById(id));
    }

    @Override
    public void editCourse(int id, CourseOnline course) {
        for (CourseOnline courseOnline : courseOnlines) {
            if (courseOnline.getCourseId() == id) {
                courseOnline.setCourseName(course.getCourseName());
                courseOnline.setMentorName(course.getMentorName());
                courseOnline.setCredit(course.getCredit());
                courseOnline.setNetWorkingPlatform(course.getNetWorkingPlatform());
                courseOnline.setCourseDurationDates(course.getCourseDurationDates());
            }
        }
    }

    @Override
    public void displayCourses() {
        for (CourseOnline course : courseOnlines) {
            System.out.println(course.toString());
        }
    }

    @Override
    public void displayDetailCourse(int courseId) {
        for (CourseOnline course : courseOnlines) {
            if (course.getCourseId() == courseId) {
                System.out.println(course.toString());
            }
        }
    }

    @Override
    public CourseOnline getCourseById(int courseId) {
        CourseOnline course = new CourseOnline();
        for (CourseOnline courseOnline : courseOnlines) {
            if (courseOnline.getCourseId() == courseId) {
//                course.setCourseId(courseOnline.getCourseId());
//                course.setCourseName(courseOnline.getCourseName());
//                course.setMentorName(courseOnline.getMentorName());
//                course.setCredit(courseOnline.getCredit());
//                course.setNetWorkingPlatform(courseOnline.getNetWorkingPlatform());
//                course.setCourseDurationDates(courseOnline.getCourseDurationDates());
                return courseOnline;
            }
        }
        return null;
    }
}
