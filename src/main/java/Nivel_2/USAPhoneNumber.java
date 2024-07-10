package Nivel_2;

public class USAPhoneNumber implements PhoneNumber{
    private String phoneNumber;

    public USAPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String formatPhoneNumber() {
        return "+1 " + phoneNumber;
    }
}
