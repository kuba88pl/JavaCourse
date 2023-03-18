package com.example.OOP.basics.methods;

class Roadster {
    float topSpeed;
    float acceleration, crazyTopSpeed, crazyAcceleration;

    Roadster(float topSpeed, float acceleration) {
        this.topSpeed = topSpeed = 200.0f;
        this.acceleration = acceleration = 7.5f;
    }

    Roadster(float topSpeed, float acceleration, float crazyTopSpeed, float crazyAcceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
    }

    public float getTopSpeed() {
        return this.topSpeed;
    }

    public float getAcceleration() {
        return this.acceleration;
    }

    public float getTopSpeed(boolean crazyMode) {
        if (crazyMode) {
            return crazyTopSpeed;
        } else {
            return topSpeed;
        }
    }

    public float getAcceleration(boolean crazyMode) {
        if (crazyMode) {
            return crazyAcceleration;
        } else {
            return acceleration;
        }
    }

}

public class RoadsterChallenge {
    public static void main(String[] args) {

        Roadster car1 = new Roadster(200.0f, 7.5f, 250.0f, 4.5f);
        Roadster car2 = new Roadster(240.0f, 3.5f, 250.0f, 4.5f);

        System.out.println(car1.getAcceleration(true));
        System.out.println(car2.getAcceleration(true));
        System.out.println(car1.getTopSpeed(true));
        System.out.println(car2.getTopSpeed(false));

    }
}
