package test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tesPositif {

    public   Response response;


    public  void prepareUrlValidForPostNewuserid(){
        RestAssured.baseURI = "https://reqres.in/";

    }



    public  void testPositifPostNewUserId(){

        String name = "yusgar";
        String email = "yusgar@gmail.com";
        String password = "123456";

        JSONObject obj = new JSONObject();

        obj.put("name", name);
        obj.put("email", email);
        obj.put("password", password);


        response = RestAssured
                .given()
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .body(obj.toString())
                .when()
                .post("https://reqres.in/api/users")
                .then().extract().response();
    }

    public  void verificationStatusCode201(){

        response.then()
                .log().all()
                .assertThat().statusCode(201);

    }

}


