package exception;

import java.io.IOException;

public class AddVegetableWithInvalidCalories extends IOException {
    public AddVegetableWithInvalidCalories() {
    }

    public AddVegetableWithInvalidCalories(String message) {
        super(message);
    }

    public AddVegetableWithInvalidCalories(String message, Throwable exception) {
        super(message, exception);
    }

    public AddVegetableWithInvalidCalories(Throwable exception) {
        super(exception);
    }
}