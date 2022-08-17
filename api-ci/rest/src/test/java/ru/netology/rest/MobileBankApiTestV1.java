package ru.netology.rest;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class MobileBankApiTestV1 {
    @Test
    void shouldCheckBodyAndHead() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("something, no matter what")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("no matter what"))
                .body("url", equalTo("https://postman-echo.com/post"))
                .header("Content-Type", "application/json; charset=utf-8")
                .header("Vary", "Accept-Encoding")
        ;
    }
}
