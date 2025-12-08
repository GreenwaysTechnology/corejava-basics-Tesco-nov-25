package org.tesco.records;

record Address(String city, String country) {
}
public record User(int id, String name, Address address) {
    //Custom Constructor
    public User {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    //methods in Records
    public String upperName() {
        return name.toUpperCase();
    }


}
