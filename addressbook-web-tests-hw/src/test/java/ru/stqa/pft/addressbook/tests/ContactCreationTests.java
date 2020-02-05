package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactsData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        app.getNavigationHelper().goToContactsPage();
        app.getContactHelper().fillContactsForm(new ContactsData("Tom", "Bowie", "tombowie@test.com"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }

}
