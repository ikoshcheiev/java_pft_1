package ru.stqa.pft.addressbook;

public class AddressData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String secondAddress;

    public AddressData(String firstName, String middleName, String lastName, String secondAddress) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.secondAddress = secondAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondAddress() {
        return secondAddress;
    }
}
