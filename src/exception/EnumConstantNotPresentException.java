package exception;

import java.io.IOException;

public class EnumConstantNotPresentException extends Exception {
    public EnumConstantNotPresentException(){
    }

    public EnumConstantNotPresentException(String message){
        super(message);
    }

    public EnumConstantNotPresentException(String message, Throwable exception){
        super(message, exception);
    }

    public  EnumConstantNotPresentException(Throwable exception){
        super(exception);
    }
}

