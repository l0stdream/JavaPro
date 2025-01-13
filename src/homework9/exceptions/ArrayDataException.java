package homework9.exceptions;

public class ArrayDataException extends RuntimeException {
    private final Throwable cause;

    public ArrayDataException(String message) {
        super(message);
        this.cause = null;
    }

    public ArrayDataException(String message, Throwable cause) {
        super(message);
        this.cause = cause;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }
}
