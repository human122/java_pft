package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.initContactCreation();
    app.fillContactForm(new ContactData("Petr", "Petrov", "Home int.", "4951234567", "9661234567", "petrov@test.ru"));
    app.submitContactCreation();
  }

}
