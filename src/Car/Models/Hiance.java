package Car.Models;

import Car.Details.*;
import Car.TypeOfCar.CargoVan;

public class Hiance extends CargoVan {
    private Wheel safeWheel;
    public Hiance(String color, int maxSpeed, Transmission transmissionType, boolean isMove,
                  double price, GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electricsHealth,
                  HeadLights headLightsHealth, WheelRadius carWheelRadius) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine, electricsHealth,
                headLightsHealth, carWheelRadius);
        this.safeWheel = safeWheel;
    }

    public Wheel getSafeWheel() {
        return safeWheel;
    }
    public void setSafeWheel(Wheel safeWheel) {
        this.safeWheel = safeWheel;
    }
}
