package exception;

public class InvalidSidesException extends Exception {

    static String errorMessage="Sides do not support negative and zero value";

    public InvalidSidesException() {
        super(errorMessage);
    }
}
