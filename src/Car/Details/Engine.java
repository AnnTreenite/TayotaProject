package Car.Details;

public abstract class Engine extends DetailWithBrokenState {
    public Engine(boolean isBroken) {
        super(false);
    }
}
