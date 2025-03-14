package utils;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import pojos.UserLogin;
import utils.services.BookingService;

import static io.restassured.RestAssured.given;

public class RestWrapper {
    private static final String BASE_URL = "https://restful-booker.herokuapp.com";
    private Cookies cookies;

    public BookingService booking;

    public RestWrapper(Cookies cookies) {
        this.cookies = cookies;
        booking = new BookingService(cookies);
    }

    public static RestWrapper loginAs(String login, String password){
        Cookies cookies = given()
                .filter(new AllureRestAssured())
                .contentType(ContentType.JSON)
                .baseUri(BASE_URL)
                .basePath("/auth")
                .body(new UserLogin(login, password))
                .post()
                .getDetailedCookies();
        return new RestWrapper(cookies);
    }
}
