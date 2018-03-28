package ru.stqa.pft.addressbook.model;

public class ContactData {
  private String first_name;
  private String second_name;

  public ContactData(String first_name, String second_name) {
    this.first_name = first_name;
    this.second_name = second_name;
  }

  public String getFirst_name() {
    return first_name;
  }

  public String getSecond_name() {
    return second_name;
  }
}
