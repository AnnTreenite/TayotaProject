package Car.Models;

import Car.Details.*;
import Car.OptionalEquipment.CruiseControl;
import Car.OptionalEquipment.USB;
import Car.TypeOfCar.Sedan;

public class Camry extends Sedan {
    private USB usb;
    public Camry(String color, int maxSpeed, Transmission transmissionType, boolean isMove,
                 double price, GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electricsHealth,
                 HeadLights headLightsHealth, WheelRadius carWheelRadius, CruiseControl cruiseControl, USB usb) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine, electricsHealth,
                headLightsHealth, carWheelRadius);
        this.usb = this.usb;
    }
    public void connectMusic() {
        usb.connectMusic();
    }
}
