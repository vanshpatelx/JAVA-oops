import classes.Box;
import classes.BoxWeight;
import classes.Shapes;
import classes.circle;
import classes.triangle;

public class lec3 {
    public static void main(String[] args) {
        // Box obj = new Box();
        // obj.display();

        // BoxWeight obj1 = new BoxWeight();
        // obj1.display();

        // BoxWeight obj2 = new BoxWeight(1,2,3,4);
        // obj2.display();

        // Box obj3 = new BoxWeight(1,2,3,4);
        // obj3.display();


        // polymophism  -> many ways to respresent
            /* 1> compiletime polymophism
                    -> overloding
            */
            /* 2> run time polymophism
                    -> overriding
            */ 
        Shapes shap = new Shapes();
        circle cir = new circle();
        triangle tri = new triangle();

        shap.area();
        cir.area();
        tri.area();

        Shapes sh = new circle();
        sh.area();  

        // parents = new child()    
            // calling of fuction depens on -> child()  -> upcasting
            // determiation by -> Dynamic  

    }
}
