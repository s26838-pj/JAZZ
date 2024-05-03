package program;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;


public interface BikeRentRepository extends JpaRepository<BikeRent, UUID> {
    default BikeRent getBikeRentById(UUID id) {
        Optional<BikeRent> optionalBikeRent = findById(id);
        return optionalBikeRent.orElseThrow(() -> new RuntimeException("BikeRent not found"));
    }
}
