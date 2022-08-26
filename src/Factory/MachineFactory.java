package Factory;

import Car.Details.*;
import Car.Models.Camry;
import Car.TypeOfCar.Car;

public class MachineFactory extends Car {

    private Country country;

    public MachineFactory(String color, int maxSpeed, Transmission transmissionType, boolean isMove,
                          double price, GasTank gasTank, Wheel[] wheels, Engine engine,
                          Electrics electricsHealth, HeadLights headLightsHealth, WheelRadius carWheelRadius) {
        super(color, maxSpeed, transmissionType, isMove, price, gasTank, wheels, engine,
                electricsHealth, headLightsHealth, carWheelRadius);
        this.country = country;
    }
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    public void createCamry() {
        if (country == Country.JAPAN) {
        }
    }
    public void createSolara() {
        if (country == Country.JAPAN) {
        }
    }
    public void createHiance() {
        if (country == Country.RUSSIA) {
        }
    }
    public void createDyna() {
        if (country == Country.RUSSIA) {
        }
    }
}
