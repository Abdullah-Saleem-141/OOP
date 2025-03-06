package library;

public class Address {
    private String street;
    private String city;
      public Address() {
        street = "";
        city = "";
    }

      public Address(String street, String city) {
        this.street = street;
        this.city = city;
        }
       public Address(Address other) {
        this.street = other.street;
        this.city = other.city;
       }
      public String getStreet() {
        return street;
       }
         public String getCity() {
        return city;
       }
          public void setStreet(String street) {
        this.street = street;
       }   

    public void setCity(String city) {
        this.city = city;
    }
}
