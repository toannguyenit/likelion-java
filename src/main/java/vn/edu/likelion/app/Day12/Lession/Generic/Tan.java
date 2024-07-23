package vn.edu.likelion.app.Day12.Lession.Generic;

public class Tan <T> implements People<T> {
    @Override
    public void someThing(T todo) {
        System.out.println("Tan an com" + todo);
    }
}
