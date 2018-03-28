package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBased {
  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void fillGroupForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirst_name());
    type(By.name("lastname"), contactData.getSecond_name());
  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }
}
