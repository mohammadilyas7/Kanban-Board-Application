package classs;

abstract class AbstractClass {
    abstract void start();
}

class Car extends AbstractClass{

    @Override
    void start() {
        System.out.println("Car Start with key");
    }
}

class Scooter extends AbstractClass{

    @Override
    void start() {
        System.out.println("Start with kick");
    }

    public static void main(String[] args) {
      // AbstractClass abstractClass = new AbstractClass();

        Car car = new Car();
        Scooter scooter = new Scooter();

        car.start();
        scooter.start();
    }

}