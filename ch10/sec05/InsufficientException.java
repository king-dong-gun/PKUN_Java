package ch10.sec05;

public class InsufficientException extends Exception{
    public InsufficientException() {
        super();
    }

    public InsufficientException(String message) {
        super(message);
    }
}
