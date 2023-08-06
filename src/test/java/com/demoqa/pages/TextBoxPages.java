package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.TextBoxResultComponent;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxPages {

    TextBoxResultComponent checkResultInput = new TextBoxResultComponent();

    SelenideElement
            userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAdressInput = $("#currentAddress"),
            permanentAdressInput = $("#permanentAddress"),
            submit = $("#submit");

    public TextBoxPages openTextPage() {
        open("/text-box");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public TextBoxPages setUserName(String value) {
        userNameInput.setValue(value);
        return this;
    }

    public TextBoxPages setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public TextBoxPages setCurrentAdress(String value) {
        currentAdressInput.setValue(value);
        return this;
    }

    public TextBoxPages setPermanentAdress(String value) {
        permanentAdressInput.setValue(value);
        return this;
    }

    public TextBoxPages submitButton() {
        submit.click();
        return this;
    }

    public TextBoxPages checkTextResult(String parentElement, String textElement) {
        checkResultInput.checkTextForm(parentElement, textElement);
        return this;
    }

}
