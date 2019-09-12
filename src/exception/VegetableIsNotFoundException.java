package exception;

import java.io.IOException;

public class VegetableIsNotFoundException extends IOException {

    public VegetableIsNotFoundException() {
    }

    public VegetableIsNotFoundException(String message) {
        super(message);
    }

    public VegetableIsNotFoundException(String message, Throwable exception) {
        super(message, exception);
    }

    public VegetableIsNotFoundException(Throwable exception) {
        super(exception);
    }
}



