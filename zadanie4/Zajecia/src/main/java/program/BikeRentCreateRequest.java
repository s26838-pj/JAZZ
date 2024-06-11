package program;

import lombok.Data;


import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class BikeRentCreateRequest {

    private UUID id;
    private LocalDateTime rentalStart;
    private LocalDateTime rentalEnd;
}
