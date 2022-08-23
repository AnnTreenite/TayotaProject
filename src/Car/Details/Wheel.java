package Car.Details;

public class Wheel extends DetailWithBrokenState {
    private WheelRadius wheelRadius;
    public Wheel(WheelRadius wheelRadius) {
        super(false);
        this.wheelRadius = wheelRadius;
    }

    public WheelRadius getWheelRadius() {
        return wheelRadius;
    }
}
