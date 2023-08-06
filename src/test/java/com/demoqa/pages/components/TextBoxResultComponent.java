package com.demoqa.pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxResultComponent {
    public void checkTextForm(String parentElement, String textElement) {
        $("#output #" + parentElement).shouldHave(text(textElement));
    }
}
