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

    @Autowired
    private BikeRentMapper bikeRentMapper;

    public BikeRentResponse createBikeRent(BikeRentCreateRequest createRequest) {
        Bike bike = bikeRepository.findById(createRequest.getId()).orElseThrow(() -> new RuntimeException("Bike not found"));
        BikeRent bikeRent = bikeRentMapper.toEntity(createRequest);
        bikeRent.setBike(bike);
        bikeRent.setRentalStart(createRequest.getRentalStart());
        bikeRent.setRentalEnd(createRequest.getRentalEnd());

        BikeRent savedBikeRent = bikeRentRepository.save(bikeRent);

        return bikeRentMapper.toResponse(savedBikeRent);
    }


    public List<BikeRentResponse> getAllBikeRents() {

        List<BikeRent> bikeRents = bikeRentRepository.findAll();
        return bikeRents.stream().map(bikeRentMapper::toResponse).collect(Collectors.toList());
    }

    public BikeRentResponse getBikeRentById(UUID id) {
        BikeRent bikeRent = bikeRentRepository.findById(id).orElseThrow(() -> new RuntimeException("Bike rent not found"));
        return bikeRentMapper.toResponse(bikeRent);
    }

    public Bike getBikeById(UUID bikeId) {
        return bikeRepository.findBikeById(bikeId);
    }
    public BikeRentResponse updateBikeRent(UUID id, BikeRentUpdateRequest updateRequest) {

        BikeRent bikeRent = bikeRentRepository.findById(id).orElseThrow(() -> new RuntimeException("Bike rent not found"));
        return bikeRentMapper.toResponse(bikeRentRepository.save(bikeRent));
    }

    public void deleteBikeRent(UUID id) {
        bikeRentRepository.deleteById(id);
    }

    private BikeRentResponse mapToBikeRentResponse(BikeRent bikeRent) {
        BikeRentResponse response = new BikeRentResponse();
        response.setId(bikeRent.getId());
        response.setBikeId(bikeRent.getBike().getId());
        response.setRentalStart(bikeRent.getRentalStart());
        response.setRentalEnd(bikeRent.getRentalEnd());
        return response;
    }
}
