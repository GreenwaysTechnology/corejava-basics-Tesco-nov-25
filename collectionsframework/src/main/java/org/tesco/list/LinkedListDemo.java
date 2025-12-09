package org.tesco.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        ArrayList<String> mytaks = new ArrayList<>();
        mytaks.add("task 1");
        mytaks.add("task 2");
        mytaks.add("task 3");

        System.out.println(mytaks);
        mytaks.remove(1);
        System.out.println(mytaks);

        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Task1");
        tasks.add("Task2");
        tasks.addFirst("Urgent Task");
        System.out.println(tasks);
        tasks.removeFirst();
        System.out.println(tasks);

    }
}
