package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Set;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    Set<ContactData> before = app.contact().all();
    ContactData contact = new ContactData()
            .withGroup("test1")
            .withFirstname("Petr")
            .withLastname("Petrov")
            .withCompany("Home int.")
            .withHome_phone("4951234567")
            .withMobile("9661234567")
            .withEmail("petrov@test.ru");
    app.contact().create(contact, true);
    app.goTo().homePage();
    Set<ContactData> after = app.contact().all();
    Assert.assertEquals(after.size(), before.size() + 1);

    contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt());
    before.add(contact);
    Assert.assertEquals(after, before);

  }
}
