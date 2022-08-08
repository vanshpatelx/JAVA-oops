package classes;

public class BoxWeight extends Box {
    float weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public void display() {
        System.out.println(this.l + " " + this.b + " " + this.h + " " + this.weight);
    }

    public BoxWeight(float side, float weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(float l, float b, float h, float weight) {
        super(l, b, h);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight old) {
        super(old);
        this.weight = old.weight;
    }
}
