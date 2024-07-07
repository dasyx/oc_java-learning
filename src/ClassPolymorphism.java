public class ClassPolymorphism {

    static class Vehicle {
        void move() {
            System.out.println("Vehicle is moving");
        }
    }
    static class Car extends Vehicle {
        @Override
        void move() {
            System.out.println("Car is moving");
        }
    }
    static class Bicycle extends Vehicle {
        @Override
        void move() {
            System.out.println("Bicycle is moving");
        }
    }

    public static class TestVehicle {

        public static void main(String[] args) {

            Vehicle myCar = new Car();
            Vehicle myBicycle = new Bicycle();

            myCar.move();
            myBicycle.move();
        }

    }

}
