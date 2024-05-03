package program;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class BikeRentResponse {

    private UUID id;
    private UUID bikeId;
    private LocalDateTime rentalStart;
    private LocalDateTime rentalEnd;

}
