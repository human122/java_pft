package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData(
            "test1",
            "Petr",
            "Petrov",
            "Home int.",
            "4951234567",
            "9661234567",
            "petrov@test.ru"),
            true
    );
    app.getContactHelper().submitContactCreation();
  }

}
