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
    public boolean checkWheels() {
        if (wheels.length == 4) {
            boolean wheelsIsOk = true;
            for (Wheel wheel : wheels) {
                if (wheel.isBroken()) {
                    wheelsIsOk = false;
                    break;
                }
            }
            return wheelsIsOk;
        } else {
            return false;
        }
    }
    public void start() throws StartCarException {
        if (checkWheels() && gasTank.getVolume() > 0 && !electricsHealth.isBroken() && !engine.isBroken()) {
            this.isMove = true;
            System.out.println("Car is start");
        } if (!checkWheels()) {
            throw new StartCarException("Error: your wheels have a problem");
        } if (gasTank.getVolume() <= 0) {
            throw new StartCarException("Error: you need to top up your petrol");
        } if (electricsHealth.isBroken()) {
            throw new StartCarException("Error: you have problems with electronics");
        } if (engine.isBroken()) {
            throw new StartCarException("Error: your car has a broken engine");
        }
    }
    public void stopTheCar() {
        this.isMove = false;
        System.out.println("Car is stopped");
    }
    public void headsLightsIsOn() {
        if (!headLightsHealth.isBroken()) {
            System.out.println("Headlight is ON");
        }
    }
    public void switchWheel(int index, Wheel wheel) {
        if (wheel.getWheelRadius() == carWheelRadius) {
            wheels[index] = wheel;
        }
    }
    public Wheel[] getWheels() {
        return wheels;
    }
}
