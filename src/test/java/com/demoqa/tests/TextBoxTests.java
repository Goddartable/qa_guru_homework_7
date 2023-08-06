package com.demoqa.tests;

import com.demoqa.pages.TextBoxPages;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {

    TextBoxPages textBoxPage = new TextBoxPages();

    @Test
    void fillFormTest() {
        textBoxPage
                .openTextPage()
                .setUserName("Alex Egorov")
                .setUserEmail("alex@egorov.com")
                .setCurrentAdress("Some address 1")
                .setPermanentAdress("Another address 1")
                .submitButton()
                .checkTextResult("name", "Alex Egorov")
                .checkTextResult("email", "alex@egorov.com")
                .checkTextResult("currentAddress", "Some address 1")
                .checkTextResult("permanentAddress", "Another address 1");
    }
}