package Resident;

public class Resident {
    private String firstName;
    private String lastName;
    private int apartmentNUmber;
    private double debitBalance;
    private String phoneNumber;
    private String email;

    public Resident(){}

    public Resident(String firstName, String lastName, int apartmentNUmber, double debitBalance, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.apartmentNUmber = apartmentNUmber;
        this.debitBalance = debitBalance;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getApartmentNumber() {
        return apartmentNUmber;
    }

    public void setApartmentNumber(int apartmentNUmber) {
        this.apartmentNUmber = apartmentNUmber;
    }

    public double getDebitBalance() {
        return debitBalance;
    }

    public void setDebitBalance(double debitBalance) {
        this.debitBalance = debitBalance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSolvent() {
        return debitBalance == 0;
    }

}

