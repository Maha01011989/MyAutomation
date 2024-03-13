package SeleniumPractice.JavaPractice.Constructor;

public class Employee {
    int id;
    String name;
    double salary;


    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        salary = salary + (salary * 10) / 100;

    }


    public static void main(String[] args) {
        Employee e = new Employee(123, "mahalakshmi", 10000);
        System.out.println(e.getSalary());
        e.setSalary();
        System.out.println(e.getSalary());
    }

}
