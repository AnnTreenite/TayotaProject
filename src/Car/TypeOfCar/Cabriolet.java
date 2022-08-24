package Car.TypeOfCar;

import Car.Details.*;
import Car.OptionalEquipment.Roof;

public abstract class Cabriolet extends Car {
    private Roof roof;

    public Cabriolet(String color, int maxSpeed, Transmission transmissionType, boolean isMove, double price, GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electricsHealth, HeadLights headLightsHealth, WheelRadius carWheelRadius) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine, electricsHealth, headLightsHealth, carWheelRadius);
    }
    public void turnRoof() {
        roof.turn();
    }
}
