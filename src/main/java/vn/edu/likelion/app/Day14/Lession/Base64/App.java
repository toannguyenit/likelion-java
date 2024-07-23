package vn.edu.likelion.app.Day14.Lession.Base64;

import java.util.Base64;

public class App {
    public static void main(String[] args) {
        String password = "likelion2024";

        String endcode = Base64.getEncoder().encodeToString(password.getBytes());
        System.out.println(endcode);

        String decoded = new String(Base64.getDecoder().decode(endcode));
        System.out.println(decoded);

//        String pass = "Ci0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tRWFzdGVyIGVnZy0tLS0tLS0tLS0tLS0tLS0tLS0tLS0t\n" +
//                      "ClRyb25nIG3DoyBow7NhIEJhc2U2NCwgxJHhu5kgZMOgaSBj4bunYSBjaHXhu5dpIMSRxrDhu6Nj\n" +
//                      "IG3DoyBow7NhIMSR4bqndSByYSBwaOG6o2kgbMOgIGLhu5lpIHPhu5EgY+G7p2EgMy4KTuG6v3Ug\n" +
//                      "a2jDtG5nIMSR4bunLCDEkeG6p3UgcmEgc+G6vSDEkcaw4bujYyDEkeG7h20gYuG6sW5nIGPDoWMg\n" +
//                      "a8O9IHThu7EgcGFkIGLhu5Ugc3VuZyAoZOG6pXUgPSkuClRhIGPDsyB0aOG7gyBi4buPIGThuqV1\n" +
//                      "ID0gYuG6sW5nIGPDoWNoIHPhu60gZOG7pW5nIHdpdGhvdXRQYWRkaW5nIG5oxrAgc2F1OiBCYXNl\n" +
//                      "NjQuZ2V0RW5jb2RlcigpLndpdGhvdXRQYWRkaW5nKCkuZW5jb2RlVG9TdHJpbmcoc3RyLmdldEJ5\n" +
//                      "dGVzKCkp";
//
//        String decode = new String(Base64.getMimeDecoder().decode(pass.getBytes()));
//        System.out.println(decode);



    }
}
