package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Set;

public class ContactModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().homePage();
    if (app.contact().all().size() == 0) {
      app.contact().create(new ContactData()
            .withGroup("test1")
            .withFirstname("test1")
            .withLastname("test1")
            .withCompany("test1")
            .withHome_phone("test1")
            .withMobile("test1")
            .withEmail("test1"), true);
    }
    app.goTo().homePage();
  }

  @Test
  public void testContactModification() {
    Set<ContactData> before = app.contact().all();
    ContactData modifiedContact = before.iterator().next();
    ContactData contact = new ContactData()
            .withId(modifiedContact.getId())
            .withFirstname("Petr")
            .withLastname("Petrov")
            .withCompany("Home int.")
            .withHome_phone("4951234567")
            .withMobile("9661234567")
            .withEmail("petrov@test.ru");
    app.contact().modify(contact);
    app.goTo().homePage();
    Set<ContactData> after = app.contact().all();
    Assert.assertEquals(after.size(), before.size());

    before.remove(modifiedContact);
    before.add(modifiedContact);
    Assert.assertEquals(after, before);
  }
}
