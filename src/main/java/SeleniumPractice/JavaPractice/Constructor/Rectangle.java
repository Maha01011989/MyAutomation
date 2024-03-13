package SeleniumPractice.JavaPractice.Constructor;

public class Rectangle {
    double length;
    double width;

    Person p = new Person("maha", 9, 'f', 123);

    Rectangle() {
        length = 0.0;
        width = 0.0;
        System.out.println(p.getAge());

    }

    Rectangle(double length, double width) {

        this.length = length;
        this.width = width;
        System.out.println(getArea());


    }

    public double getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
//        System.out.println(rec.getArea());

        Rectangle rec1 = new Rectangle(12, 12);
//        System.out.println(rec1.getArea());
    }

}
