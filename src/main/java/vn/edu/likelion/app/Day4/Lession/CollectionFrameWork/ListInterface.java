package vn.edu.likelion.app.Day4.Lession.CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ListInterface
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Apple");
        list.add("Banana");

        System.out.println("List: " + list);
        list.set(1,"Blueberry");
        System.out.println("List: " + list);
        list.remove(1);
        System.out.println("List: " + list);


    }
}
