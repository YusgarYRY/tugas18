package test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class tesnegatif {

    public   Response response;

    @BeforeTest
    public  void prepareUrlValidForGetUserId() {
        RestAssured.baseURI = "https://reqres.in/";

    }

    @Test
    public  void testNegatifGetUnregisteredUserId(){


                response = RestAssured
                .given()
                .when()
                .get("https://reqres.in/api/users/9999")
                .then().extract().response();

    }
    @Test(dependsOnMethods = "testNegatifGetUnregisteredUserId")
    public  void verificationStatusCode(){

        response.then()
                .log().all()
                .assertThat().statusCode(404);

    }

}
