package program;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BikeRepository extends JpaRepository<Bike, UUID> {

    default Bike findBikeById(UUID id) {
        Optional<Bike> optionalBike = findById(id);
        return optionalBike.orElseThrow(() -> new RuntimeException("Bike not found :("));
    }
}
