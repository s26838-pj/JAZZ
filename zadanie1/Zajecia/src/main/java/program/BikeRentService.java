package program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        Bike bike = bikeRepository.findById(createRequest.getBikeId()).orElseThrow(() -> new RuntimeException("Bike not found"));
        BikeRent bikeRent = new BikeRent();
        bikeRent.setBike(bike);
        bikeRent.setRentalStart(createRequest.getRentalStart());
        bikeRent.setRentalEnd(createRequest.getRentalEnd());

        BikeRent savedBikeRent = bikeRentRepository.save(bikeRent);

        return mapToBikeRentResponse(savedBikeRent);
    }

    public List<BikeRentResponse> getAllBikeRents() {

        List<BikeRent> bikeRents = bikeRentRepository.findAll();
        return bikeRents.stream().map(this::mapToBikeRentResponse).collect(Collectors.toList());
    }

    public BikeRentResponse getBikeRentById(UUID id) {
        BikeRent bikeRent = bikeRentRepository.findById(id).orElseThrow(() -> new RuntimeException("Bike rent not found"));
        return mapToBikeRentResponse(bikeRent);
    }

    public BikeRentResponse updateBikeRent(UUID id, BikeRentUpdateRequest updateRequest) {

        BikeRent bikeRent = bikeRentRepository.findById(id).orElseThrow(() -> new RuntimeException("Bike rent not found"));
        return mapToBikeRentResponse(bikeRentRepository.save(bikeRent));
    }

    public void deleteBikeRent(UUID id) {
        bikeRentRepository.deleteById(id);
    }

    private BikeRentResponse mapToBikeRentResponse(BikeRent bikeRent) {
        BikeRentResponse response = new BikeRentResponse();
        response.setId(bikeRent.getId());
        response.setBikeid(bikeRent.getBike().getId());
        response.setRentalStart(bikeRent.getRentalStart());
        response.setRentalEnd(bikeRent.getRentalEnd());
        return response;
    }
}
