package utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class RestUtils {
    private static Response response;

    public static Response getResponse() {
        return response;
    }

    public static void setBaseURI(String uri) {
        RestAssured.baseURI = uri;
    }

    public static String getBaseURI() {
        return RestAssured.baseURI;
    }

    public static Response post(Object json, ContentType contentType, String endpoint) {
        return response = RestAssured.given()
                .log().all()
                .relaxedHTTPSValidation()
                .contentType(contentType)
                .body(json)
                .when()
                .post(endpoint)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response post(Map<String,String > header, Object json, ContentType contentType, String endpoint) {
        return response = RestAssured.given()
                .log().all()
                .relaxedHTTPSValidation()
                .contentType(contentType)
                .headers(header)
                .body(json)
                .when()
                .post(endpoint)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response put(Map<String,String > header, Object json, ContentType contentType, String endpoint) {
        return response = RestAssured.given()
                .log().all()
                .relaxedHTTPSValidation()
                .contentType(contentType)
                .headers(header)
                .body(json)
                .when()
                .put(endpoint)
                .then()
                .log().all()
                .extract().response();
    }

    public static Response get(Map<String, String> header, String endpoint) {
<<<<<<< HEAD
        return response = RestAssured.given()
                .log().all()
=======
        return response = RestAssured
                .given()
>>>>>>> 6f1e2e0bdaeb05f24b3f872334317247641d7459
                .relaxedHTTPSValidation()
                .headers(header)
                .when()
                .get(endpoint)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response get(Map<String, String> header, Map<String, Object> param, String endpoint) {
        return response = RestAssured.given()
                .log().all()
                .relaxedHTTPSValidation()
                .headers(header)
                .params(param)
                .when()
                .get(endpoint)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response delete(Map<String, String> header, String endpoint) {
        return response = RestAssured.given()
                .log().all()
                .relaxedHTTPSValidation()
                .headers(header)
                .when()
                .delete(endpoint)
                .then()
                .log().all()
                .extract().response();
    }

}
