package Nivel_2;

public class USAContactFactory implements ContactFactory {


    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber) {
        return new USAPhoneNumber(phoneNumber);
    }

    @Override
    public Address createAddress(String street, String city, String state, String zip) {
        return new USAAddress(street, city, state, zip);
    }
}
