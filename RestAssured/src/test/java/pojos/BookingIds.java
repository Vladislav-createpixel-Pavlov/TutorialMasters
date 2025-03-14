package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BookingIds {
    @JsonProperty("bookingid")
    private int bookingid;
}
