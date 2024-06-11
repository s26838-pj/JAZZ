/*
 * Moje API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
/**
 * BikeRentCreateRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-10T18:40:04.668485713Z[GMT]")

public class BikeRentCreateRequest {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("rentalStart")
  private OffsetDateTime rentalStart = null;

  @SerializedName("rentalEnd")
  private OffsetDateTime rentalEnd = null;

  public BikeRentCreateRequest id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public BikeRentCreateRequest rentalStart(OffsetDateTime rentalStart) {
    this.rentalStart = rentalStart;
    return this;
  }

   /**
   * Get rentalStart
   * @return rentalStart
  **/
  @Schema(description = "")
  public OffsetDateTime getRentalStart() {
    return rentalStart;
  }

  public void setRentalStart(OffsetDateTime rentalStart) {
    this.rentalStart = rentalStart;
  }

  public BikeRentCreateRequest rentalEnd(OffsetDateTime rentalEnd) {
    this.rentalEnd = rentalEnd;
    return this;
  }

   /**
   * Get rentalEnd
   * @return rentalEnd
  **/
  @Schema(description = "")
  public OffsetDateTime getRentalEnd() {
    return rentalEnd;
  }

  public void setRentalEnd(OffsetDateTime rentalEnd) {
    this.rentalEnd = rentalEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BikeRentCreateRequest bikeRentCreateRequest = (BikeRentCreateRequest) o;
    return Objects.equals(this.id, bikeRentCreateRequest.id) &&
        Objects.equals(this.rentalStart, bikeRentCreateRequest.rentalStart) &&
        Objects.equals(this.rentalEnd, bikeRentCreateRequest.rentalEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rentalStart, rentalEnd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BikeRentCreateRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rentalStart: ").append(toIndentedString(rentalStart)).append("\n");
    sb.append("    rentalEnd: ").append(toIndentedString(rentalEnd)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
