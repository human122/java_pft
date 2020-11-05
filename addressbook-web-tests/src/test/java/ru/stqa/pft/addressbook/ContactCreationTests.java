package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    initContactCreation();
    fillContactForm(new ContactData("Petr", "Petrov", "Home int.", "4951234567", "9661234567", "petrov@test.ru"));
    submitContactCreation();
  }

}
