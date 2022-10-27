class Box {
    private int length;
    private int breadth;
    private int height;

    public void setDimension(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void showDimension(){
        System.out.println("Length ->" + length);
        System.out.println("Breadth ->" + breadth);
        System.out.println("Height ->" + height);
    }
}
public class Example{
    public static void main(String[] args) {
        Box obj = new Box();
        obj.setDimension(10, 12, 11);
        obj.showDimension();
    }
}