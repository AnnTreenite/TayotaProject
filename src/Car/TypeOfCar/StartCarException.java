package Car.TypeOfCar;

public class StartCarException extends Throwable {
    public String messageTo;

    public StartCarException(String s) {
        this.messageTo = s;
    }
    public String getMessageTo() {
        return messageTo;
    }
}
