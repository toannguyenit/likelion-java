package vn.edu.likelion.app.Day7.Model;

import vn.edu.likelion.app.Day7.Interface.InterfaceUser;

public class User implements InterfaceUser {
    @Override
    public void showInfo() {
        System.out.println("Xin chao");
    }
}
