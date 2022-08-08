package classes;

public class Box {
    float l;
    float b;
    float h;

    public Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    public Box(float side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    public Box(float l,float b,float h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public Box(Box old){
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }

    public void display(){
        System.out.println(this.l + " " + this.b + " " + this.h);
    }
}
