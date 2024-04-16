package program;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class BikeRentResponse {

    private UUID id;
    private UUID Bikeid;
    private LocalDateTime rentalStart;
    private LocalDateTime rentalEnd;

    public LocalDateTime getRentalStart() {
        return rentalStart;
    }

    public void setRentalStart(LocalDateTime rentalStart) {
        this.rentalStart = rentalStart;
    }

    public LocalDateTime getRentalEnd() {
        return rentalEnd;
    }

    public void setRentalEnd(LocalDateTime rentalEnd) {
        this.rentalEnd = rentalEnd;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getBikeid() {
        return Bikeid;
    }

    public void setBikeid(UUID bikeid) {
        Bikeid = bikeid;
    }
}
