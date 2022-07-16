import classes.Human;
import classes.Singleton;

public class lec2 {
    public static void main(String[] args) {
        // basic of static variable
            // static: only one copy of variables for all object
            // Human obj = new Human(10,"abcd",12000);
            // System.out.println(Human.population);
            // Human obj1 = new Human(11, "ab", 12000);
            // System.out.println(Human.population);
            // Human obj2 = new Human(11, "asd", 12000);
            // System.out.println(Human.population);

        // accessing static & non-static functions
            // greeting(); // we can't access because of non static fun
            // access non-static function we use object
            // lec2 obj = new lec2();
            // obj.greeting();

        // singleton class -> only we create one object
            // Singleton obj = Singleton.getInstance();
            // Singleton obj1 = Singleton.getInstance();
    }

    void greeting() {
        System.out.println("non static fun");
    }
}

