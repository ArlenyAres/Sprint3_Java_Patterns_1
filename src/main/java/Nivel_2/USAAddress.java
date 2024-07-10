package Nivel_2;

// AbstractProduct o ConcreteProduct

public class USAAddress implements Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public USAAddress(String street, String city, String state, String zip ) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    @Override
    public String formatAddress() {
        return street + ", " + city + ", " + state + " " + zip + ", USA";
    }

}
