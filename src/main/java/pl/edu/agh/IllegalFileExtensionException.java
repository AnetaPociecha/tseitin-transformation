package pl.edu.agh;

public class IllegalFileExtensionException extends IllegalArgumentException {
    IllegalFileExtensionException(String message) {
        super(message);
    }
}
