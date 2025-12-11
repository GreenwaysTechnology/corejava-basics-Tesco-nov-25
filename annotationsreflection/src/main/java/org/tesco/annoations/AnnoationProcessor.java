package org.tesco.annoations;

import java.lang.reflect.Method;

public class AnnoationProcessor {
    public static void main(String[] args) {
        //class object of service class
        Class<Service> cls = Service.class;
        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MyInfo.class)) {
                MyInfo info = method.getAnnotation(MyInfo.class);
                System.out.println(info.author());
                System.out.println(info.date());
                System.out.println(info.version());
            }
        }
    }
}
