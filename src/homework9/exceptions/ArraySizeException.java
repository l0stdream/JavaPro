package homework9.exceptions;

public class ArraySizeException extends RuntimeException {
    private final Throwable cause;

    public ArraySizeException(String message) {
        super(message);
        this.cause = null;
    }

    public ArraySizeException(String message, Throwable cause) {
        super(message);
        this.cause = cause;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }
}
