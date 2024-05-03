package program;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BikeRentUpdateRequest {

    private LocalDateTime rentalStart;
    private LocalDateTime rentalEnd;
}
