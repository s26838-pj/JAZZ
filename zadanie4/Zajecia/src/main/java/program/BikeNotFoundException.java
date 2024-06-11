package program;

public class BikeNotFoundException extends RuntimeException{

    public BikeNotFoundException(String message) {
        super(message);
    }

    public String getErrorCode() {
        return "TAKI_ROWER_NIE_ISTNIEJE";
    }

}
