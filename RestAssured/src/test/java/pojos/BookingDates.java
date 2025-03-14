package pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.qameta.allure.internal.shadowed.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import utils.DateDeserializer;
import java.time.LocalDate;

@Data
@AllArgsConstructor @NoArgsConstructor
public class BookingDates {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonProperty("checkin")
    private LocalDate checkin;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonProperty("checkout")
    private LocalDate checkout;
}
