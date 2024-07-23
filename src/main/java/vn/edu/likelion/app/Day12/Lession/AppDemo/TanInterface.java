package vn.edu.likelion.app.Day12.Lession.AppDemo;

import java.util.List;

public interface TanInterface <T>{
    void insert(T Object);
    void update(T Object);
    List<T> findAll();
    void remove(T Object);
}
