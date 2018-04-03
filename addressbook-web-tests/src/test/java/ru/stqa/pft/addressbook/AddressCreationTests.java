package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class AddressCreationTests extends TestBase {
    
    @Test
    public void testAddressCreation() {
        initAddressCreation();
        fillAddressForm(new AddressData("Ivann", "Test", "Address-test", "test address 1"));
        submitAddressCreation();
    }

}
