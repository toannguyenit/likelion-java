package vn.edu.likelion.app.Day15.Lession.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.empty();

        String str1 = "";

        Optional<String> optional2 = Optional.of(str1);

        String str2 = null;
        Optional<String> optional3 = Optional.ofNullable(str2);

        Person person = null;
        Optional<Person> optional4 = Optional.ofNullable(person);

        optional4.ifPresent(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("a");
        System.out.println(list);

    }
}
