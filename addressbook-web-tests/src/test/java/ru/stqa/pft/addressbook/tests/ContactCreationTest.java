package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation(){
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillGroupForm(new ContactData("first name", "second name"));
    app.getContactHelper().submitContactCreation();
  }
}
