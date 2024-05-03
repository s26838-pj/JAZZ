package program;

import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class BikeRentCreateRequest {

    @NotNull(message = "ID cannot be null")
    private UUID id;

    @NotNull(message = "Rental start datetime cannot be null")
    private LocalDateTime rentalStart;

    @NotNull(message = "Rental end datetime cannot be null")
    private LocalDateTime rentalEnd;
}
