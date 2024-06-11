class Vehicle {
    int maxSpeed;
    String vehicleType;

    void displayInfo() {
        System.out.println("\nThe max speed is " + maxSpeed);
        System.out.println("Vehicle type is " + vehicleType);
    }
}

class Car extends Vehicle {
    String carType;

    Car(int maxSpeed, String carType) {
        this.maxSpeed = maxSpeed;
        this.carType = carType;
        this.vehicleType = "Car";
    }

    @Override
    void displayInfo() {
        System.out.println("\nThe max speed is " + maxSpeed);
        System.out.println("Vehicle type is " + vehicleType);
        System.out.println("Car type is " + carType);
    }
}

class Bike extends Vehicle {
    String bikeType;

    Bike(int maxSpeed, String bikeType) {
        this.maxSpeed = maxSpeed;
        this.bikeType = bikeType;
        this.vehicleType = "Bike";
    }

    @Override
    void displayInfo() {
        System.out.println("\nThe max speed is " + maxSpeed);
        System.out.println("Vehicle type is " + vehicleType);
        System.out.println("Bike type is " + bikeType + "\n");
    }
}

class CarBike {
    public static void main(String args[]) {
        Car car = new Car(250, "Tata punch");
        car.displayInfo();
        Bike bike = new Bike(114, "Hunter 350");
        bike.displayInfo();
    }
}