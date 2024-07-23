package vn.edu.likelion.app.Day12.Lession.AppDemo;

import java.util.ArrayList;
import java.util.List;

public class TanService<T> implements TanInterface<T>{

//    private static List<TanService> tanServices = new ArrayList<TanService>();

    private List<T> list = new ArrayList<>();

    @Override
    public void insert(T Object) {
        list.add(Object);

    }

    @Override
    public void update(T Object) {

    }

    @Override
    public List<T> findAll() {
        return list;
    }

    @Override
    public void remove(T Object) {
        list.remove(Object);
    }
}
