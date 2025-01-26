package homework11.enums;

/**
 * This ENUM contains occurrence messages about errors or exceptions.
 */

public enum Messages {
    ERROR("An unexpected error has occurred, we apologize. The program will now close."),
    NOT_FOUND("The book wasn't found. Pls try again"),
    ENTER_BOOK_NAME("Please enter book name without any non alphabetic symbols and spaces: ");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }

}
