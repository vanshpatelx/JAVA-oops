public class Example {
    int x; // Instance variable
    static int y; // static member variable 

    public void f1() { // instance member function
        // static int a;   // it's wrong
    }  

    public static void fun2() { } // static member function

    static class Test{  // static inner class 
        public static String country = "INDIA";
    }
   
    public static void main(String[] args) {
        Example obj1 = new Example();
        obj1.x = 1;     
        Example.y = 1;  // static
        y = 5;  // we use because of static
        // x = 1; // error -> because of we use non static in static function

        Example.fun2(); // static
        obj1.f1();  // obj dependent
        fun2(); // static  

        // static class access 
        Example.Test.country = "ABCD";
    }
}
