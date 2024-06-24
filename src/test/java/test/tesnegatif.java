package test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class tesnegatif {

    public   Response response;

    @BeforeTest
    public  void prepareUrlValidForGetUserId() {
        RestAssured.baseURI = "https://reqres.in/";

    }

    @Test
    public  void tesNegatifGetUnregisteredUserId(){


                response = RestAssured
                .given()
                .when()
                .get("https://reqres.in/api/users/9999")
                .then().extract().response();

    }
    @AfterTest
    public  void verificationStatusCode(){

        Assert.assertEquals(response.getStatusCode(), 404);

    }

}
