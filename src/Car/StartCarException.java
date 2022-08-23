package Car;

public class StartCarException {
    public String messageTo;

    public StartCarException(String s) {
        this.messageTo = s;
    }
    public String getMessageTo() {
        return messageTo;
    }
}
