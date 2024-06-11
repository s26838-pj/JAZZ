package program;

import io.swagger.client.model.BikeRentCreateRequest;
import io.swagger.client.model.BikeRentResponse;
import io.swagger.client.model.BikeRentUpdateRequest;
import io.swagger.client.ApiCallback;
import io.swagger.client.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/bike-rents")
public class BikeRentController implements ApiCallback<BikeRentResponse> {

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

    @Override
    public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
        System.out.println("API call failed with status code: " + statusCode);
    }

    @Override
    public void onSuccess(BikeRentResponse result, int statusCode, Map<String, List<String>> responseHeaders) {
        System.out.println("API call succeeded with status code: " + statusCode);
    }

    @Override
    public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
        System.out.println("Upload progress: " + bytesWritten + "/" + contentLength);
    }

    @Override
    public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
        System.out.println("Download progress: " + bytesRead + "/" + contentLength);
    }
}
