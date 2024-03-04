class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    public void move() {
        System.out.println("Car is moving");
    }
}

class Bicycle extends Vehicle {
    public void move() {
        System.out.println("Bicycle is moving");
    }
}

public class InstanceOf {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        moveVehicle(vehicle);
        
        vehicle = new Bicycle();
        moveVehicle(vehicle);
        
        vehicle = new Vehicle();
        moveVehicle(vehicle);
    }
    
    
    public static void moveVehicle(Vehicle vehicle) {
      
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                car.move();
            } else if (vehicle instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) vehicle;
                bicycle.move();
            } else {
                System.out.println("Cannot move vehicle: unknown type");
            }
        } 
    }
