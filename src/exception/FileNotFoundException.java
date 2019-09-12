package exception;

import java.io.IOException;

public class FileNotFoundException extends IOException {

    public FileNotFoundException() {
    }

    public FileNotFoundException(String message) {
        super(message);
    }

    public FileNotFoundException(String message, Throwable exception) {
        super(message, exception);
    }

    public FileNotFoundException(Throwable exception) {
        super(exception);
    }
}
