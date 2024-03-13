package SeleniumPractice.JavaPractice.Constructor;

public class Car {

    String make;
    String model;
    int year;

    Car() {
        make = "Unknown";
        model = "Unknown";
        year = 0;
    }

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.make);
        System.out.println(c.model);
        System.out.println(c.year);

        Car c1 = new Car("Maruthi","Brezza",2022);
        System.out.println(c1.make);
        System.out.println(c1.model);
        System.out.println(c1.year);


    }


}
