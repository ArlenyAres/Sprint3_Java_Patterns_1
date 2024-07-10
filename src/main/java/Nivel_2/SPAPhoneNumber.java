package Nivel_2;

public class SPAPhoneNumber implements PhoneNumber {
    private String phoneNumber;

    public SPAPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String formatPhoneNumber() {
        return "+34 " + phoneNumber;
    }
}
