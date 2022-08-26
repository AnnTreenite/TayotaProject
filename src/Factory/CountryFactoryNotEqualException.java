package Factory;

public class CountryFactoryNotEqualException extends Exception {
    public CountryFactoryNotEqualException(String message) {
        super(message);
    }

    public CountryFactoryNotEqualException() {
        super();
    }
}
