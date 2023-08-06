package com.demoqa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.components.CalendarComponent;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormWithPageObjectsTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {

        registrationPage.openPage()
                .setFirstName("Konstantin")
                .setLastName("Dymov")
                .setUserEmail("secret@gmail.com")
                .setGender("Male")
                .setPhoneNumber("8005553535")
                .setBirthDate("1","May","2000")
                .setSubject("Physics")
                .setHobby("Reading")
                .setHobby("Music")
                .uploadPicture("13912597291716.jpg")
                .setAdress("Terra")
                .setState("NCR")
                .setCity("Delhi")
                .submitButton()
                .checkResponsive("Student Name","Konstantin Dymov")
                .checkResponsive("Gender","Male")
                .checkResponsive("Student Email","secret@gmail.com")
                .checkResponsive("Student Name","Konstantin Dymov")
                .checkResponsive("Mobile","8005553535")
                .checkResponsive("Date of Birth","01 May,2000")
                .checkResponsive("Subjects","Physics")
                .checkResponsive("Hobbies","Reading, Music")
                .checkResponsive("Picture","13912597291716.jpg")
                .checkResponsive("State and City","NCR Delhi");

    }
}
