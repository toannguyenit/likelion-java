package vn.edu.likelion.app.Day11.Exercise.Bai2;

import vn.edu.likelion.app.Day11.Exercise.Bai2.Model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SchoolApp {
    static School school = new School();


    public static void main(String[] args) {

        // Học viên cần đăng ký đầy đủ các thông tin sau để được vào lớp: Tên, ngày tháng năm sinh, CCCD
        Student student01 = new Student("Trung Kien", "BE0001", LocalDate.of(2000, 7, 15));
        Student student02 = new Student("Song Toan", "BE0002", LocalDate.of(1996, 7, 15));
        Student student03 = new Student("Duc Tan", "BE0003", LocalDate.of(1998, 7, 15));
        Student student04 = new Student("Quoc Thinh 1", "BE0004", LocalDate.of(2003, 7, 15));
        Student student05 = new Student("Quoc Thinh 2", "BE0005", LocalDate.of(2003, 7, 15));
        Student student06 = new Student("Quoc Thinh 3", "BE0006", LocalDate.of(2003, 7, 15));
        Student student07 = new Student("Quoc Thinh 4", "BE0007", LocalDate.of(2003, 7, 15));
        Student student08 = new Student("Quoc Thinh 5", "BE0008", LocalDate.of(2003, 7, 15));
        Student student09 = new Student("Quoc Thinh 6", "BE0009", LocalDate.of(2003, 7, 15));
        Student student10 = new Student("Quoc Thinh 7", "BE0010", LocalDate.of(2003, 7, 15));
        Student student11 = new Student("Quoc Thinh 8", "BE0011", LocalDate.of(2003, 7, 15));
        Student student12 = new Student("Quoc Thinh 9", "BE0012", LocalDate.of(2003, 7, 15));
        Student student13 = new Student("Quoc Thinh 10", "BE0013", LocalDate.of(2003, 7, 15));
        Student student14 = new Student("Quoc Thinh 11", "BE0014", LocalDate.of(2003, 7, 15));

        school.insertStudent(student01);
        school.insertStudent(student02);
        school.insertStudent(student03);
        school.insertStudent(student04);
        school.insertStudent(student05);
        school.insertStudent(student06);
        school.insertStudent(student07);
        school.insertStudent(student08);
        school.insertStudent(student09);
        school.insertStudent(student10);
        school.insertStudent(student11);
        school.insertStudent(student12);
        school.insertStudent(student13);
        school.insertStudent(student14);

        // Trường có 3 lớp và 3 giáo viên
        // Thêm danh sách lớp học
        System.out.println("""
                Test case: Trường có 3 lớp và 3 giáo viên Start
                """);
        ClassRoom class01 = new ClassRoom("C01", "Lop Java");
        ClassRoom class02 = new ClassRoom("C02", "Lop PHP");
        ClassRoom class03 = new ClassRoom("C03", "Lop Python");
        ClassRoom class04 = new ClassRoom("C04", "Lop JS");
        school.insertClassRoom(class01); // Thêm lớp thành công
        school.insertClassRoom(class02); // Thêm lớp thành công
        school.insertClassRoom(class03); // Thêm lớp thành công
        school.insertClassRoom(class04); // Lỗi vì quá số lớp

        Teacher teacher1 = new Teacher("T01", "Tuan Mentor");
        Teacher teacher2 = new Teacher("T02", "Duong Mentor");
        Teacher teacher3 = new Teacher("T03", "Phuc Mentor");
        Teacher teacher4 = new Teacher("T04", "Minh Mentor");
        school.insertTeacher(teacher1);// Thêm giáo viên thành công
        school.insertTeacher(teacher2);// Thêm giáo viên thành công
        school.insertTeacher(teacher3);// Thêm giáo viên thành công
        school.insertTeacher(teacher4);// Lỗi vì quá số giáo viên
        System.out.println("""
                Test case: Trường có 3 lớp và 3 giáo viên End
                ============================================
                """);

        // Từ  18-20 tuổi mới được đăng ký học
        // Học viên nào đăng ký thành công sẽ nhận đc mã học viên
        class01.insert(student01); // Thêm thất bại vì tuổi
        class01.insert(student02); // Thêm thất bại vì tuổi
        class01.insert(student03); // Thêm thất bại vì tuổi
        class01.insert(student04); // Thêm thành công và được cập nhật Mã Học viên
        System.out.println(student04.toString());


        // mỗi giáo viên dạy 2 lớp,
        teacher1.insert(class01); // Thêm thành công lớp
        teacher1.insert(class02);
        teacher1.insert(class03); // Lỗi over lớp

        // cần xem được danh sách học viên của mỗi giáo viên,
        System.out.println("cần xem được danh sách học viên của mỗi giáo viên,: Start");

        String idTeacher1 = teacher1.getId();
        Set<String> classOfTeacher1 = teacher1.getClasseIds();
        List<ClassRoom> classRooms = new ArrayList<>();
        List<String> studentsOfTeacher1 = new ArrayList<>();
        for (String classId : classOfTeacher1) {
            for (ClassRoom classRoom: School.getClasses()) {
                if (classId.equals(classRoom.getId())) {
                    classRooms.add(classRoom);
                }
            }
        }

        for (ClassRoom classRoom: classRooms) {
             for (String studentId: classRoom.getStudentIds()) {
                 studentsOfTeacher1.add(studentId);
             }
        }

        for (String studentId: studentsOfTeacher1) {
            for (Student student: School.getStudents()) {
                if (studentId.equals(student.getCitizenId())) {
                    System.out.println(student.toString());
                }
            }
        }

        System.out.println("cần xem được danh sách học viên của mỗi giáo viên,: End");








        // Cần xem được danh sách các học viên trong lớp và thông tin chi tiết của họ
        System.out.println("Cần xem được danh sách các học viên trong lớp và thông tin chi tiết của họ: Start");
        String idClass01 = class01.getId();
        Set<String> studentOfClass01 = class01.getStudentIds();
        for (String studentId: studentOfClass01) {
            for (Student student: School.getStudents()) {
               if (student.getCitizenId().equals(studentId)) {
                    System.out.println(student.toString());
                }
            }
        }
        System.out.println("Cần xem được danh sách các học viên trong lớp và thông tin chi tiết của họ: End");

        // Lớp học có thể sắp xếp tối đa 10 bàn
        // Khi đủ học viên thì lớp mới bắt đầu, học viên sẽ được tính ngày giờ nhập học kể từ lúc lớp học bắt đầu
        class01.insert(student05); // Thêm thanh cong
        class01.insert(student06); // Thêm thanh cong
        class01.insert(student07); // Thêm thanh cong
        class01.insert(student08); // Thêm thanh cong
        class01.insert(student09); // Thêm thanh cong
        class01.insert(student10); // Thêm thanh cong
        class01.insert(student11); // Thêm thanh cong
        class01.insert(student12); // Thêm thanh cong
        class01.insert(student13); // Thêm thanh cong - Lop hoc bat dau
        class01.insert(student14); // Thêm that bai vi > 10,


        // Một số học viên đọc sai thông tin, cần sửa lại được thông tin của học viên
        student02.setName("Nguyen Vo Song Toan");
        school.updateStudent(student02);

        // Trong thời gian học, có 1 số bạn bỏ học, cần lưu lại danh sách những bạn đó và lý do bỏ học
        school.insertStudentStopStudy(new StudentStopStudy(student03.getCitizenId(), "Chan hoc", LocalDate.now()));
    }
}
