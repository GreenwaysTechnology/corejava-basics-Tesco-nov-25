package com.tesco.privatedemo;

public class UserMain {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setUserName("admin");
        user.setEmail("admin@tesco.com");
        user.setPassword("admin");
        //i
        System.out.println(user.getId());
        System.out.println(user.getUserName());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
//        user.id;
//        user.auth

    }
}
