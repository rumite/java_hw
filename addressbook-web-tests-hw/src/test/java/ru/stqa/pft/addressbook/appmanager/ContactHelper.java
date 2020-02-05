package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactsData;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }

    public void submitContactCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillContactsForm(ContactsData contactsData) {
        type(By.name("firstname"),contactsData.getFirstname());
        type(By.name("lastname"),contactsData.getLastname());
        type(By.name("email"),contactsData.getEmail());
    }
}
