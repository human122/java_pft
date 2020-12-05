package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactMailTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().homePage();
    if (app.contact().all().size() == 0) {
      app.contact().create(new ContactData()
              .withGroup("test1")
              .withFirstname("test1")
              .withLastname("test1")
              .withCompany("test1")
              .withHomePhone("test1")
              .withMobilePhone("test1")
              .withEmail("test1"), true);
    }
    app.goTo().homePage();
  }

  @Test
  public void testContactMailAddress() {
    app.goTo().homePage();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactAddressFromEditForm = app.contact().addressFromEditForm(contact);

    assertThat(contact.getAddress(), equalTo(contactAddressFromEditForm.getAddress()));
  }

  @Test
  public void testContactEMails() {
    app.goTo().homePage();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactEMailFromEditForm = app.contact().EMailFromEditForm(contact);

    assertThat(contact.getAllEmails(), equalTo(mergeEmails(contactEMailFromEditForm)));
  }

  private String mergeEmails(ContactData contact) {
    return Stream.of(
            contact.getEmail(),
            contact.getEmail2(),
            contact.getEmail3()
            )
            .filter((s) -> !s.equals(""))
            .map(ContactMailTests::cleaned)
            .collect(Collectors.joining("\n"));
  }

  public static String cleaned(String address) {
    return address.replaceAll("\s+", " ");
  }

}
