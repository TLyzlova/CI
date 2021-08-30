package ru.netology.rest;

import org.junit.jupiter.api.Test;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

class MobileBankApiTestV2 {
    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("http://localhost:9999/api/v1")
                // Выполняемые действия
                .when()
                .get("/demo/accounts")
                // Проверки
                .then()
                .statusCode(200)
                // .header("Content-Type", "application/json; charset=UTF-8")
                // специализированные проверки - лучше
                .contentType(ContentType.JSON)
        ;
    }
}
