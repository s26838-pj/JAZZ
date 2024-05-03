package program;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler({BikeNotFoundException.class})
    public ResponseEntity<String> handleError(BikeNotFoundException exception) {
        String errorCode = exception.getErrorCode();
        String errorMessage = "Nie ma takiego roweru";

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .contentType(MediaType.APPLICATION_JSON)
                .body("{\"error_code\": \"" + errorCode + "\", \"message\": \"" + errorMessage + "\"}");
    }



}





