package Car.Models;

import Car.Details.*;
import Car.OptionalEquipment.Fridge;
import Car.TypeOfCar.Cabriolet;

public class Solara extends Cabriolet {
    private Fridge fridge;
    public Solara(String color, int maxSpeed, Transmission transmissionType, boolean isMove,
                  double price, GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electricsHealth,
                  HeadLights headLightsHealth, WheelRadius carWheelRadius) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine, electricsHealth,
                headLightsHealth, carWheelRadius);
        this.fridge = fridge;
    }
    public void fridge() {
        fridge.freezeTheDrink();
    }
}
