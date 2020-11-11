package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData(
            null,
            "Petr",
            "Petrov",
            "Home int.",
            "4951234567",
            "9661234567",
            "petrov@test.ru"),
            false
    );
    app.getContactHelper().submitContactModification();
  }
}
