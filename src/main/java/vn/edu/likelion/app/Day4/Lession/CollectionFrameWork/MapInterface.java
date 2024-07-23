package vn.edu.likelion.app.Day4.Lession.CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);

        System.out.println("map = " + map);

        map.put("B",3);
        System.out.println("map = " + map);

        map.remove("B");
        System.out.println("map = " + map);

    }
}
