package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;


public class PracticeFormTest {
    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";

    }
    @Test
    void fillFormTest(){
        open("/automation-practice-form");

        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");


        $("#firstName").setValue("Konstantin");
        $("#lastName").setValue("Dymov");
        $("#userEmail").setValue("secret@gmail.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("8005553535");
        $("#dateOfBirthInput").click();


        $("select.react-datepicker__year-select").click();
        $("select.react-datepicker__year-select").selectOption("2000");
        $("select.react-datepicker__month-select").click();
        $("select.react-datepicker__month-select").selectOption("May");
        $("div.react-datepicker__day--001").click();


        $("#subjectsInput").setValue("Physics").pressEnter();
       // $("#subjectsWrapper").$(byText("Physics")).click();

        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();

        $("#uploadPicture").uploadFile(new File("src/picture/13912597291716.jpg"));

        $("#currentAddress").setValue("Terra");

        $("#state").click();
        $("#state").$(byText("NCR")).click();

        $("#city").click();
        $("#city").$(byText("Delhi")).click();

        $("#submit").click();

        $(".modal-content").should(Condition.appear);

        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Konstantin Dymov"));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("secret@gmail.com"));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("8005553535"));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("01 May,2000"));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("Physics"));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Reading, Music"));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("13912597291716.jpg"));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("NCR Delhi"));


    }
}
