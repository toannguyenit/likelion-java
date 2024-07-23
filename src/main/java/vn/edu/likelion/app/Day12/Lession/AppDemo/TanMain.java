package vn.edu.likelion.app.Day12.Lession.AppDemo;

import vn.edu.likelion.app.Day12.Lession.Generic.Tan;

import java.util.ArrayList;
import java.util.List;

public class TanMain {



    public static void main(String[] args) {

        TanEntity tanEntity = new TanEntity();
        tanEntity.setName("Tan");
        tanEntity.setAge(20);

        TanService<TanEntity> tanService = new TanService<>();
        tanService.insert(tanEntity);

        List<TanEntity> tanEntities = new ArrayList<>();
        tanEntities = tanService.findAll();

        for (TanEntity tan : tanEntities) {
            System.out.println("Ten: " + tan.getName());
            System.out.println("Tuoi: " + tan.getAge());
        }


    }
}
