package unitTest;

import io.swagger.client.model.BikeRentCreateRequest;
import io.swagger.client.model.BikeRentResponse;
import io.swagger.client.model.BikeRentUpdateRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import program.BikeRentController;
import program.BikeRentService;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BikeRentControllerTest {

   /* @InjectMocks
    private BikeRentController bikeRentController;

    @Mock
    private BikeRentService bikeRentService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllBikeRents() {
        List<BikeRentResponse> responseList = Collections.singletonList(new BikeRentResponse());

        when(bikeRentService.getAllBikeRents()).thenReturn(responseList);

        ResponseEntity<List<BikeRentResponse>> result = bikeRentController.getAllBikeRents();

        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertEquals(responseList, result.getBody());
        verify(bikeRentService, times(1)).getAllBikeRents();
    }*/

}
