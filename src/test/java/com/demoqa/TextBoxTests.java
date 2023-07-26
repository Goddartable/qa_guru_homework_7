package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;


public class TextBoxTests {
    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void fillFormTest(){
        open("/automation-practice-form");

        $("#firstName").setValue("Alex Egorov");
        $("#firstName").setValue("Alex Egorov");
        $("#firstName").setValue("Alex Egorov");
        $("#firstName").setValue("Alex Egorov");
        $("#firstName").setValue("Alex Egorov");

        $("submit").click();

        $("").shouldHave(text("Alex Egorov"));

    }
}
