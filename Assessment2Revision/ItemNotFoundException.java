package Assessment2Revision;

public class ItemNotFoundException extends LibraryException {


    public ItemNotFoundException(String message) {
        super(message);
    }

    public ItemNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
