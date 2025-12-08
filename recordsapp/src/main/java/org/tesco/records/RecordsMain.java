package org.tesco.records;

public class RecordsMain {
    public static void main(String[] args) {
        User user = new User(1, "Subramanian", new Address("Coimbatore", "India"));
        System.out.println(user.id() + " " + user.name());
        System.out.println(user.toString());
        System.out.println(user.hashCode());
        User tmpUser = new User(1, "Subramanian", new Address("Chennai", "India"));
        System.out.println(user.equals(tmpUser) ? "Same User" : "Different User");
        System.out.println(user.address().city());
        System.out.println(user.upperName());
    }
}
