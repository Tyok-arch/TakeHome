package api;

import config.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseAPI {

    protected RequestSpecification request;

    public BaseAPI() {

        RestAssured.baseURI = ConfigReader.get("api.base.url");

        request = given()
                .header("x-api-key", ConfigReader.get("api.key"))
                .contentType("application/json");
    }
}