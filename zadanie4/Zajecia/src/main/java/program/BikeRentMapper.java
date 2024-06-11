package program;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface BikeRentMapper {

    @Mapping(source = "bike.id", target = "bikeId")
    BikeRentResponse toResponse(BikeRent bikeRent);

    @Mapping(source = "createRequest.id", target = "bike.id")
    @Mapping(source = "createRequest.rentalStart", target = "rentalStart")
    @Mapping(source = "createRequest.rentalEnd", target = "rentalEnd")
    BikeRent toEntity(BikeRentCreateRequest createRequest);

    BikeRentResponse mapToBikeRentResponse(BikeRent savedBikeRent);
}