package t02.exception;

public class NoSuchKeyException extends RuntimeException {
    public NoSuchKeyException(String message) {
        super(message);
    }
}
