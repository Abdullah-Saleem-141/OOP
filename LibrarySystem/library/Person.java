package library;

public class Person {
    private String name;
    private String role;
    private Address address;

    public Person(String name, String role, Address address) {
        this.name = name;
        this.role = role;
        this.address = address;
    }

    public Person(Person other) {
        this.name = other.name;
        this.role = other.role;
        this.address = new Address(other.address);
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public Address getAddress() {
        return address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return this.name.equals(other.name) &&
               this.role.equals(other.role) &&
               this.address.equals(other.address);
    }
}
