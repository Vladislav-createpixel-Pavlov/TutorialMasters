package utils.services;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.Cookies;
import pojos.BookingIds;
import pojos.BookingOrder;
import pojos.BookingResponce;

import java.util.List;

import static io.restassured.RestAssured.given;

public class BookingService extends RestService{

    private static final String BASE_PATH="/booking";

    public BookingService(Cookies cookies) {
        super(cookies);
    }

    @Override
    protected String getBasePath() {
        return BASE_PATH;
    }

    @Step("Создание бронирования на имя {bo.firstname}")
    public BookingResponce createBooking(BookingOrder bo){
        return given().spec(REQ_SPEC).body(bo).post().as(BookingResponce.class);
    }

    @Step("Получение списка бронирования")
    @Attachment()
    public List<BookingIds> getBookings(){
        return given()
                .spec(REQ_SPEC)
                .log().all()
                .get()
                .jsonPath().getList("$", BookingIds.class);
    }
    @Step("Получение списка бронирования")
    @Attachment()
    public RestResponse<List<BookingIds>> getBookings1(){
        return new RestResponse<>(given()
                .spec(REQ_SPEC)
                .log().all()
                .get(),resp -> resp.body().jsonPath().getList("$", BookingIds.class));
    }
    @Step("Получение бронирования с id:{id}")
    @Attachment(value = "{id}",type = "application/json",fileExtension = "json'")
    public BookingOrder getBooking(int id){
        return  given()
                .spec(REQ_SPEC)
                .log().all()
                .get("/" + id)
                .as(BookingOrder.class);
    }

}
