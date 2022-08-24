package Car.TypeOfCar;

import Car.Details.*;

public abstract class CargoVan extends Car {
    private int maxWeightTaken;
    public CargoVan(String color, int maxSpeed, Transmission transmissionType, boolean isMove,
                    double price, GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electricsHealth,
                    HeadLights headLightsHealth, WheelRadius carWheelRadius) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine, electricsHealth,
                headLightsHealth, carWheelRadius);
        this.maxWeightTaken = maxWeightTaken;
    }
    public int getMaxWeightTaken() {
        return maxWeightTaken;
    }
}
