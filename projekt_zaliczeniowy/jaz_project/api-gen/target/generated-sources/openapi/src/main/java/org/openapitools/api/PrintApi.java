/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-22T20:03:44.887912100+02:00[Europe/Warsaw]")
@Validated
@Api(value = "print", description = "the print API")
public interface PrintApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /print : Generate PDF order report
     *
     * @return PDF order report generated successfully (status code 200)
     */
    @ApiOperation(value = "Generate PDF order report", nickname = "generatePdfOrderReport", notes = "", response = org.springframework.core.io.Resource.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "PDF order report generated successfully", response = org.springframework.core.io.Resource.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/print",
        produces = { "application/pdf" }
    )
    default ResponseEntity<org.springframework.core.io.Resource> generatePdfOrderReport() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
