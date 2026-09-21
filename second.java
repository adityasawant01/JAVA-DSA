import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number (a): ");
        int a = sc.nextInt();
        System.out.println("enter second number (b): ");
        int b = sc.nextInt();
        int input = sc.nextInt();
        int marks = sc.nextInt();

        if(input ==  1){
        do{
            else if(marks >= 90){
                System.out.println("best marks");

            }
            else if(marks<=89){
                System.out.println("better marks");

            }
            else if(marks<=59){
                System.out.println("good marks");
            }
        } 
        while(marks<= 100);
        }
        else{
            System.out.println("invalid");
        }

    }
}
