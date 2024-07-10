package Nivel_2;

public class SPAContactFactory implements ContactFactory {
    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber) {

        return new SPAPhoneNumber(phoneNumber);
    }

    @Override
    public Address createAddress(String street, String city, String state, String zip) {

        return new SPAAddress(street, city, state, zip);
    }
}