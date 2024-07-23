package vn.edu.likelion.app.Day11.Exercise.Bai2.Model;

import vn.edu.likelion.app.Day11.Exercise.Bai2.Interface.TeacherInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teacher implements TeacherInterface {
    private String id;
    private String name;
    private Set<String> classeIds = new HashSet<>();

    public Teacher() {
    }

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
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

    public Set<String> getClasseIds() {
        return classeIds;
    }

    public void setClasseIds(Set<String> classeIds) {
        this.classeIds = classeIds;
    }

    @Override
    public void insert(ClassRoom Object) {
        if (classeIds.size() >= 2) {
            System.out.println("Thêm lớp  " + Object.getId() + " vao giao vien " + name + " thất bại!!");
            System.out.println("Số lớp học đã vượt quá 2!!");
        }
        classeIds.add(Object.getId());
        System.out.println("Thêm lớp học " + Object.getId() + " vao giao vien " + name + " thành công!!");
    }

    @Override
    public void update(ClassRoom Object) {

    }

    @Override
    public void showAlls(List<ClassRoom> Object) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public void getAll(List<ClassRoom> Object) {

    }

    @Override
    public void getById(String id, List<ClassRoom> Object) {

    }

    @Override
    public void getByName(String name, List<ClassRoom> Object) {

    }

    @Override
    public void showById(String id, List<ClassRoom> Object) {

    }

    @Override
    public void showByName(String name, List<ClassRoom> Object) {

    }
}
