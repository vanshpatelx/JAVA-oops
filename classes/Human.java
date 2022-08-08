package classes;

public class Human {
    int age;
    String name;
    int salary;
    public static int population = 0;

    public Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
    }
}
