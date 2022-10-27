public class lec5 {
    public static void main(String[] args) {
        // narrowing conversion
        float y = 3.5f;
        //int x = y; // error -> compilation error
        int z = (int) y; // compelte worked
        System.out.println(z);
    }
}
