package program;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BikeRentRepository extends JpaRepository<BikeRent, UUID> {

}
