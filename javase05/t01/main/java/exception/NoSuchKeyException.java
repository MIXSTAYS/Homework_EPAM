package exception;

public class NoSuchKeyException extends Exception {
    private String key;
    public NoSuchKeyException(String message) {
        this.key = message;
        System.out.println("Key: " + key + " not found.");
    }
}
