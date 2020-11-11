package ru.stqa.pft.addressbook.model;

public class ContactData {
  private String group;
  private final String firstname;
  private final String lastname;
  private final String company;
  private final String home_phone;
  private final String mobile;
  private final String email;

  public ContactData(String group, String firstname, String lastname, String company, String home_phone, String mobile, String email) {
    this.group = group;
    this.firstname = firstname;
    this.lastname = lastname;
    this.company = company;
    this.home_phone = home_phone;
    this.mobile = mobile;
    this.email = email;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getCompany() {
    return company;
  }

  public String getHome_phone() {
    return home_phone;
  }

  public String getMobile() {
    return mobile;
  }

  public String getEmail() {
    return email;
  }

  public String getGroup() {
    return group;
  }
}
