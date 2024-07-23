package vn.edu.likelion.app.Day14.Lession.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("PHP", "Java", "C#", "JS");

        List<String> streamList = list.stream()
                .filter(s -> s.toLowerCase().startsWith("j")).toList();

        System.out.println(streamList);

        list.forEach(System.out::println);
    }
}
