package program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/bike-rents")
public class BikeRentController {

    @Autowired
    private BikeRentService bikeRentService;

    @PostMapping
    public ResponseEntity<BikeRentResponse> createBikeRent(@RequestBody BikeRentCreateRequest createRequest) {
        BikeRentResponse response = bikeRentService.createBikeRent(createRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<BikeRentResponse>> getAllBikeRents() {
        List<BikeRentResponse> responses = bikeRentService.getAllBikeRents();
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BikeRentResponse> updateBikeRent(@PathVariable UUID id, @RequestBody BikeRentUpdateRequest updateRequest) {
        BikeRentResponse response = bikeRentService.updateBikeRent(id, updateRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBikeRent(@PathVariable UUID id) {
        bikeRentService.deleteBikeRent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
