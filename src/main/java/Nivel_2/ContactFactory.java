package Nivel_2;

public interface ContactFactory {
    PhoneNumber createPhoneNumber(String phoneNumber);
    Address createAddress(String street, String city, String state, String zip);
}
