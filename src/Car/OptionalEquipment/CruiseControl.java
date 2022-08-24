package Car.OptionalEquipment;

import Car.Details.Detail;

public class CruiseControl extends Detail {
    private boolean isWorked;
    public CruiseControl() {
        this.isWorked = false;
    }
    public void turn() {
        isWorked = !isWorked;
        if (isWorked) {
            System.out.println("Cruise Control is ON");
        } else {
            System.out.println("Cruise Control is OFF");
        }
    }
    public boolean isWorked() {
        return isWorked;
    }
}
