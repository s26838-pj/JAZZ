package program;

import io.swagger.client.model.BikeRentCreateRequest;

import io.swagger.client.model.BikeRentResponse;
import io.swagger.client.model.BikeRentUpdateRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class BikeRentService {

    @Autowired
    private BikeRentRepository bikeRentRepository;

    @Autowired
    private BikeRepository bikeRepository;

    public BikeRentResponse createBikeRent(BikeRentCreateRequest createRequest) {
        Bike bike = bikeRepository.findById(createRequest.getId())
                .orElseThrow(() -> new RuntimeException("Bike not found"));

        BikeRent bikeRent = new BikeRent();
        bikeRent.setBike(bike);
        bikeRent.setRentalStart(toLocalDateTime(createRequest.getRentalStart()));
        bikeRent.setRentalEnd(toLocalDateTime(createRequest.getRentalEnd()));

        BikeRent savedBikeRent = bikeRentRepository.save(bikeRent);

        return toBikeRentResponse(savedBikeRent);
    }

    public List<BikeRentResponse> getAllBikeRents() {
        return bikeRentRepository.findAll().stream()
                .map(this::toBikeRentResponse)
                .collect(Collectors.toList());
    }

    public BikeRentResponse getBikeRentById(UUID id) {
        BikeRent bikeRent = bikeRentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bike rent not found"));
        return toBikeRentResponse(bikeRent);
    }

    public BikeRentResponse updateBikeRent(UUID id, BikeRentUpdateRequest updateRequest) {
        BikeRent bikeRent = bikeRentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bike rent not found"));

        bikeRent.setRentalStart(toLocalDateTime(updateRequest.getRentalStart()));
        bikeRent.setRentalEnd(toLocalDateTime(updateRequest.getRentalEnd()));

        BikeRent updatedBikeRent = bikeRentRepository.save(bikeRent);

        return toBikeRentResponse(updatedBikeRent);
    }

    public void deleteBikeRent(UUID id) {
        bikeRentRepository.deleteById(id);
    }

    private BikeRentResponse toBikeRentResponse(BikeRent bikeRent) {
        BikeRentResponse response = new BikeRentResponse();
        response.setId(UUID.fromString(bikeRent.getId().toString()));
        response.setId(UUID.fromString(bikeRent.getBike().getId().toString()));
        response.setRentalStart(toOffsetDateTime(bikeRent.getRentalStart()));
        response.setRentalEnd(toOffsetDateTime(bikeRent.getRentalEnd()));
        return response;
    }

    private java.time.LocalDateTime toLocalDateTime(org.threeten.bp.OffsetDateTime offsetDateTime) {
        if (offsetDateTime == null) {
            return null;
        }
        return java.time.LocalDateTime.of(
                offsetDateTime.getYear(),
                offsetDateTime.getMonthValue(),
                offsetDateTime.getDayOfMonth(),
                offsetDateTime.getHour(),
                offsetDateTime.getMinute(),
                offsetDateTime.getSecond(),
                offsetDateTime.getNano()
        );
    }

    private org.threeten.bp.OffsetDateTime toOffsetDateTime(java.time.LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }
        return org.threeten.bp.OffsetDateTime.of(
                localDateTime.getYear(),
                localDateTime.getMonthValue(),
                localDateTime.getDayOfMonth(),
                localDateTime.getHour(),
                localDateTime.getMinute(),
                localDateTime.getSecond(),
                localDateTime.getNano(),
                org.threeten.bp.ZoneOffset.UTC
        );
    }
}
