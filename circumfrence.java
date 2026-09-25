import java.util.Scanner;

public class circumfrence {
    public static double circumfrence(int radius){
        double circumfrence = 2 * Math.PI * radius;
        return circumfrence;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.println(circumfrence(radius));
    }
}
