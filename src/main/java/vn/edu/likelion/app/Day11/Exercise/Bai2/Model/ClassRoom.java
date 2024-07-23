package vn.edu.likelion.app.Day11.Exercise.Bai2.Model;

import vn.edu.likelion.app.Day11.Exercise.Bai2.Interface.CRUDInterface;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassRoom implements CRUDInterface<Student> {
    private String id;
    private String name;
    private int status = 0;
    private Set<String> studentIds = new HashSet<>();
    private LocalDate date;

    private int count = 0;

    public ClassRoom() {}

    public ClassRoom(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public ClassRoom(String id, String name, Set<String> studentIds) {
        this.id = id;
        this.name = name;
        this.studentIds = studentIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Set<String> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(Set<String> studentIds) {
        this.studentIds = studentIds;
    }



    @Override
    public String toString(){
        return "Class: Id: " + id
                + " name: " + name
                + " students: " + studentIds.toString();
    }


    @Override
    public void insert(Student student) {
        Period age = Period.between(student.getDateOfBirth(), LocalDate.now());
        if (age.getYears() <  18 || age.getYears() > 20 ) {
            System.out.println("Hoc sinh co do tuoi khong phu hop");
            return;
        }
        if (studentIds.size() >= 10) {
            System.out.println("Lop hoc qua so luong");
            return;
        }
        studentIds.add(student.getCitizenId());
        System.out.println("Them thanh cong vao lop " + id);
        count++;
        student.setId(id + "-"+ count);
        if (studentIds.size() == 10) {
            date = LocalDate.now();
            System.out.println("Lop hoc bat dau vao ngay: "  + date );
            status = 1;
        } else {
            status = 0;
        }
    }

    @Override
    public void update(Student Object) {

    }

    @Override
    public void showAlls(List<Student> students) {
        for (Student student: students) {
            if (studentIds.contains(student.getCitizenId())){
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public void remove(String id) {
        studentIds.remove(id);

    }

    @Override
    public void getAll(List<Student> Object) {

    }

    @Override
    public void getById(String id, List<Student> Object) {

    }

    @Override
    public void getByName(String name, List<Student> Object) {

    }

    @Override
    public void showById(String id, List<Student> Object) {

    }

    @Override
    public void showByName(String name, List<Student> Object) {

    }


}

