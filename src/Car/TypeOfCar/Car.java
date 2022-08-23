package Car.TypeOfCar;

import Car.Details.*;

public abstract class Car {
    private  String color;
    private int maxSpeed;
    private Transmission transmissionType;
    private boolean isMove;
    private double price;
    private GasTank gasTank;
    private Wheel[] wheels;
    private Engine engine;
    private Electrics electricsHealth;
    private HeadLights headLightsHealth;
    private WheelRadius carWheelRadius;

    public Car(String color, int maxSpeed, Transmission transmissionType, boolean isMove,
               double price, GasTank gasTank, Wheel[] wheels, Engine engine, Electrics electricsHealth,
               HeadLights headLightsHealth, WheelRadius carWheelRadius) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmissionType = transmissionType;
        this.isMove = isMove;
        this.price = price;
        this.gasTank = gasTank;
        this.wheels = wheels;
        this.engine = engine;
        this.electricsHealth = electricsHealth;
        this.headLightsHealth = headLightsHealth;
        this.carWheelRadius = carWheelRadius;
        for (Wheel wheel : wheels) {
            if (wheel.getWheelRadius() != carWheelRadius) {
                throw new RuntimeException("Радиус не подходит, должет быть " + wheel.getWheelRadius());
            }
        }
    }

}
