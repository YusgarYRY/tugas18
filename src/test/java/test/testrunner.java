package test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class testrunner {
    public tespositif Tespositif;
    public   tesnegatif Tesnegatif;
    public   tesbatas Tesbatas;

    public testrunner() {
        this.Tespositif = new tespositif();
        this.Tesnegatif = new tesnegatif();
        this.Tesbatas = new tesbatas();
    }

    @Given("prepare url valid for post new userid")
    public void givenPositif() {
        Tespositif.prepareUrlValidForPostNewuserid();
        System.out.println("prepare url");
    }

    @And("Hit api post new user id")
    public void hitApiAndPostNewUserId() {
        Tespositif.testPositifPostNewUserId();
        System.out.println("hit and post new user id");
    }

    @Then("verification status code should be 201")
    public void verificationStatusCode() {
        Tespositif.verificationStatusCode201();
        System.out.println("verification status code 201 for successful");
    }

    @Given("prepare url valid for get user id")
    public void prepareUrlValidForGetUserId() {
        Tesnegatif.prepareUrlValidForGetUserId();
        System.out.println("prepare url");
    }

    @And("Hit api get Invalid user id")
    public void hitApiGetInvalidUserId() {
        Tesnegatif.testNegatifGetUnregisteredUserId();
        System.out.println("hit and get invalid user");
    }

    @Then("verification status code should be 404")
    public void VerificationCodeGetUnvalidUserId() {
        Tesnegatif.verificationStatusCode();
        System.out.println("verification status code 404 for invalid user");
    }

    @Given("prepare url valid for post minimum lenght for name")
    public void prepareUrlValidForPostMinimumLengthForName() {
        Tesbatas.prepareUrlForPostMinimumName();
        System.out.println("prepare Url");
    }

    @And("Hit api post with single carachter for name")
    public void hitApiPostWithSingleCharacterForName() {
        Tesbatas.testPostMinimumName();
        System.out.println("hit api dan melakukan post dengan mengirimkan satu huruf pada bagian nama");
    }

    @Then("verification status code should be 201 for minimum lenght")
    public void verificationStatusCodeShouldBeForMinimumLength() {
        Tesbatas.verificationStatusCode201ForMinLenght();
        System.out.println("verification 201 for post single character");
    }
}
