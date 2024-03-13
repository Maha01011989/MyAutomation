package SeleniumPractice.JavaPractice.Constructor;

public class Person {

    String name;
    int age;
    char gender;
    double height;


    Person(String name, int age, char gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;

    }

    public static void main(String[] args) {
        Person p = new Person("Maha", 34, 'F', 168);
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.gender);
        System.out.println(p.height);

        Person p2 = new Person("Rithu", 8, 'F', 120);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.gender);
        System.out.println(p2.height);
    }

    public int getAge()
    {
        return age;
    }
}
