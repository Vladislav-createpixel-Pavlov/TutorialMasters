package utils.services;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import io.restassured.specification.RequestSpecification;

public abstract class RestService {
    private static final String BASE_URl = "http://restful-booker.herokuapp.com";
    protected Cookies cookies;
    protected RequestSpecification REQ_SPEC;

    protected abstract String getBasePath();

    public RestService(Cookies cookies) {
        this.cookies = cookies;

        REQ_SPEC = new RequestSpecBuilder()
                .addFilter(new AllureRestAssured())
                .addCookies(cookies)
                .setBaseUri(BASE_URl)
                .setBasePath(getBasePath())
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.ANY)
                .build();
    }
}
