package Car.TypeOfCar;

import Car.Details.*;
import Car.OptionalEquipment.CruiseControl;

public abstract class Sedan extends Car {
    private CruiseControl cruiseControl;

    public Sedan(String color, int maxSpeed, Transmission transmissionType, boolean isMove, double price,
                 GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electricsHealth,
                 HeadLights headLightsHealth, WheelRadius carWheelRadius) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine,
                electricsHealth, headLightsHealth, carWheelRadius);
        this.cruiseControl = cruiseControl;
    }
    public void turnCruiseControl() {
        this.cruiseControl.turn();
    }
}
