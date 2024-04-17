package program;

import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-17T18:28:43+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
public class BikeRentMapperImpl implements BikeRentMapper {

    @Override
    public BikeRentResponse toResponse(BikeRent bikeRent) {
        if ( bikeRent == null ) {
            return null;
        }

        BikeRentResponse bikeRentResponse = new BikeRentResponse();

        bikeRentResponse.setBikeId( bikeRentBikeId( bikeRent ) );
        bikeRentResponse.setId( bikeRent.getId() );
        bikeRentResponse.setRentalStart( bikeRent.getRentalStart() );
        bikeRentResponse.setRentalEnd( bikeRent.getRentalEnd() );

        return bikeRentResponse;
    }

    @Override
    public BikeRent toEntity(BikeRentCreateRequest createRequest) {
        if ( createRequest == null ) {
            return null;
        }

        BikeRent bikeRent = new BikeRent();

        bikeRent.setBike( bikeRentCreateRequestToBike( createRequest ) );
        bikeRent.setRentalStart( createRequest.getRentalStart() );
        bikeRent.setRentalEnd( createRequest.getRentalEnd() );
        bikeRent.setId( createRequest.getId() );

        return bikeRent;
    }

    @Override
    public BikeRentResponse mapToBikeRentResponse(BikeRent savedBikeRent) {
        if ( savedBikeRent == null ) {
            return null;
        }

        BikeRentResponse bikeRentResponse = new BikeRentResponse();

        bikeRentResponse.setId( savedBikeRent.getId() );
        bikeRentResponse.setRentalStart( savedBikeRent.getRentalStart() );
        bikeRentResponse.setRentalEnd( savedBikeRent.getRentalEnd() );

        return bikeRentResponse;
    }

    private UUID bikeRentBikeId(BikeRent bikeRent) {
        if ( bikeRent == null ) {
            return null;
        }
        Bike bike = bikeRent.getBike();
        if ( bike == null ) {
            return null;
        }
        UUID id = bike.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected Bike bikeRentCreateRequestToBike(BikeRentCreateRequest bikeRentCreateRequest) {
        if ( bikeRentCreateRequest == null ) {
            return null;
        }

        Bike bike = new Bike();

        bike.setId( bikeRentCreateRequest.getId() );

        return bike;
    }
}
