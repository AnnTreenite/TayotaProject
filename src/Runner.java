import Car.Details.*;
import Car.Models.Camry;
import Car.OptionalEquipment.CruiseControl;
import Car.OptionalEquipment.USB;

public class Runner {
    public static void main(String[] args) {
        GasTank gasTank = new GasTank();
        Engine engine = new Engine();
        Electrics electrics = new Electrics();
        HeadLights headLights = new HeadLights();
        Wheel[] wheels = generateWheels(WheelRadius.R17);
        CruiseControl cruiseControl = new CruiseControl();
        USB usb = new USB();

        Camry camry = new Camry("black", 250, Transmission.AUTOMATIC, false, 10000,
                gasTank, wheels, engine, electrics, headLights, WheelRadius.R17, cruiseControl, usb);
        camry.connectMusic();
    }

    public static Wheel[] generateWheels(WheelRadius carWheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel(carWheelRadius);
        }
        return wheels;
    }
}
