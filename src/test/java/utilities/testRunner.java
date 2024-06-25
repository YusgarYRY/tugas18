package utilities;

import org.testng.annotations.Test;
import test.tesBatas;
import test.tesNegatif;
import test.tesPositif;

public class testRunner {
    public tesPositif Tespositif;
    public tesNegatif Tesnegatif;
    public tesBatas Tesbatas;

    public testRunner() {
        this.Tespositif = new tesPositif();
        this.Tesnegatif = new tesNegatif();
        this.Tesbatas = new tesBatas();
    }

    @Test
    public void testRunnerPositif() {
        Tespositif.prepareUrlValidForPostNewuserid();
        Tespositif.testPositifPostNewUserId();
        Tespositif.verificationStatusCode201();
    }

    @Test
    public void testRunnerNegatif(){
        Tesnegatif.prepareUrlValidForGetUserId();
        Tesnegatif.testNegatifGetUnregisteredUserId();
        Tesnegatif.verificationStatusCode();
    }

    @Test
    public void testRunnerBoundary() {
            Tesbatas.prepareUrlForPostMinimumName();
            Tesbatas.testPostMinimumName();
            Tesbatas.verificationStatusCode201ForMinLenght();
    }
}
