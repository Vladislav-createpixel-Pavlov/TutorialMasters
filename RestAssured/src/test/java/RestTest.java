import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojos.BookingIds;
import pojos.BookingOrder;
import pojos.BookingResponce;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;
import utils.BookingGenerator;
import utils.RestWrapper;
import utils.services.RestResponse;

import java.time.LocalDate;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class RestTest {
    private static RestWrapper api;

    @BeforeAll
    public static void prepareClient(){
        api = RestWrapper.loginAs("admin", "password123");
    }

//    @Test
//    @DisplayName("Получение бронирования")
//    @Story("List all bookings")
//    @Description("Проверяет отправку запроса на получение все списка бронирования")
//    @Owner(value="Pavlov V.")
//    public void getUsers(){
//        List<BookingIds> usersResponse = api.booking.getBookings();
//        Assertions.assertTrue(usersResponse.size()>=15);
//    }
    @Test
    @DisplayName("Получение бронирования")
    @Story("Get booking")
    @Description("Проверяет отправку запроса на получение бронирования и что в системе создалась бронь с указанным идентификатором")
    @Owner(value="Pavlov V.")
    public void getUser(){
        PodamFactory factory = new PodamFactoryImpl();
        RestResponse<List<BookingIds>> userResponse = api.booking.getBookings();
        userResponse.assertResponseCode(200);
        userResponse.validate("UsersTemplate.json");
    }
    @Test
    @DisplayName("Получение бронирования")
    @Story("Get booking")
    @Description("Проверяет отправку запроса на получение бронирования и что в системе создалась бронь с указанным идентификатором")
    @Owner(value="Pavlov V.")
    public void getUser1(){
        BookingOrder usersResponse = api.booking.getBooking(1);
        Assertions.assertEquals("Jim", usersResponse.getFirstname());
        Assertions.assertTrue(usersResponse.getTotalprice()>=500);

    }
    @DisplayName("Создание бронирования")
    @Story("Create booking")
    @Description("Проверяет отправку запроса на создание бронирования и что в системе создалась бронь с указанным идентификатором")
    @Test
    public void createUser(){
        BookingOrder bo = BookingGenerator.createOrder(LocalDate.now(),LocalDate.now().plusDays(7));
        BookingResponce rs = api.booking.createBooking(bo);
        assertThat(rs)
                .isNotNull()
                .extracting(BookingResponce::getBookingid)
                .isEqualTo(bo.getLastname());
    }
}
