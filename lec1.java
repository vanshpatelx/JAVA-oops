
public class lec1 {
    public static void main(String[] args) {
        // constructor
        {
            // By Default constructor
            student var = new student();
            var.marks = 10;
            var.name = "vansh patel";
            var.rno = 1;
            var.print();

            // paralized Construtor
            student paralizedConstrucor = new student(1, "vansh", 99);
            paralizedConstrucor.print();

            // copy constructor
            student copyConstructor = new student(paralizedConstrucor);
            copyConstructor.print();
        }

        // wrapper class -> using for creating primitive to objec
        {
            int a = 10;
            Integer num = 45;
            System.out.println(a);
            System.out.println(num);
        }

        // final keyword
        {
            // final -> don't modifie (like const)
            // primitive
                // always inilize at creating -> but you only assign value one time
                final int rate = 10;
                System.out.println(rate);
                final int z;
                z = 5;
                System.out.println(z);

            // Object (Non-primitive)
                final student variable = new student();
                variable.name = "new name"; // we can reassign value to data members
                // variable = var; // we can't reassign object

        }

    }
}

class student {
    int rno;
    String name;
    int marks;

    // Default constructor
    student() {
        // this.rno = 0;
        // this.name = null;
        // this.marks = 0;
        // OR
        this(0, null, 0);
    }

    // paralized constructor
    student(int rno, String name, int marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // copy constructor
    student(student object) {
        // this.rno = object.rno;
        // this.name = object.name;
        // this.marks = object.marks;
        // OR
        this(object.rno, object.name, object.marks);
    }

    void print() {
        System.out.println(rno);
        System.out.println(name);
        System.out.println(marks);
    }
};