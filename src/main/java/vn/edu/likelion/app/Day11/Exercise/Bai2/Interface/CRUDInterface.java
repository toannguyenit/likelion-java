package vn.edu.likelion.app.Day11.Exercise.Bai2.Interface;

import java.util.List;

public interface CRUDInterface<T> {
    void insert(T Object);
    void update(T Object);
    void showAlls(List<T> Object);
    void remove(String id);
    void getAll(List<T> Object);
    void getById(String id, List<T> Object);
    void getByName(String name, List<T> Object);
    void showById(String id, List<T> Object);
    void showByName(String name, List<T> Object);
}
