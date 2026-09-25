import java.util.*;
class First{
    public static void calculateAverage(int sum){
        
       
        int average = sum / 3;
        System.out.println(+average);

        }
        

     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        calculateAverage(sum);
     }
}