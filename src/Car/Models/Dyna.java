package Car.Models;

import Car.Details.*;
import Car.OptionalEquipment.ChargerSocket;
import Car.TypeOfCar.CargoVan;

public class Dyna extends CargoVan {
    private ChargerSocket chargerSocket;

    public Dyna(String color, int maxSpeed, Transmission transmissionType, boolean isMove, double price,
                GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electricsHealth,
                HeadLights headLightsHealth, WheelRadius carWheelRadius) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine, electricsHealth,
                headLightsHealth, carWheelRadius);
        this.chargerSocket = chargerSocket;
    }
    public void chargeThePhone() {
        this.chargerSocket.chargeThePhone();
    }
}
