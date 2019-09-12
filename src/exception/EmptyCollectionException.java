package exception;

import java.io.IOException;

public class EmptyCollectionException extends IOException {

    public EmptyCollectionException(){
    }

    public EmptyCollectionException(String message){
        super(message);
    }

    public EmptyCollectionException(String message, Throwable exception){
        super(message, exception);
    }

    public  EmptyCollectionException(Throwable exception){
        super(exception);
    }
}
