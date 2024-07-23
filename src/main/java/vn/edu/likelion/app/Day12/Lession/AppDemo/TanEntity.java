package vn.edu.likelion.app.Day12.Lession.AppDemo;

import vn.edu.likelion.app.Day12.Lession.Generic.Tan;

public class TanEntity {
    private String name;
    private int age;

    public TanEntity(){}

    public TanEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
