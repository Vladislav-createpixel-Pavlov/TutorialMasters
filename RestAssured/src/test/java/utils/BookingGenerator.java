package utils;

import pojos.BookingDates;
import pojos.BookingOrder;
import java.time.LocalDate;

public class BookingGenerator {
    public static BookingOrder createOrder(LocalDate checkin, LocalDate checkout){
        return BookingOrder.builder()
                .firstname("Vlad")
                .lastname("Pavlov")
                .totalprice(120)
                .depositpaid(true)
                .bookingdates(new BookingDates(checkin,checkout))
                .additionalneeds("Breakfast")
                .build();
    }

}
