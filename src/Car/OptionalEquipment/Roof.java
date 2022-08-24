package Car.OptionalEquipment;

public class Roof {
    private boolean isUp;

    public Roof() {
        this.isUp = false;
    }
    public void turn() {
        isUp = !isUp;
        if (isUp) {
            System.out.println("Roof is Up");
        } else {
            System.out.println("Roof is down");
        }
    }
    public boolean isUp() {
        return isUp;
    }
}
