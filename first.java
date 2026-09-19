import java.util.*;
class First{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number (a): ");
        int a = sc.nextInt();
        System.out.println("enter second number (b): ");
        int b = sc.nextInt();
        System.out.println("select button ,1(+),2(-),3(*),4(/),5(%): ");
        int button = sc.nextInt();
        if(button == 1){
            System.out.println("addition result:" +(a + b));
        }
        else if(button == 2){
            System.out.println("subtraction result:" +(a - b));
        }
        else if(button == 3){
            System.out.println("multiplication result:" +(a * b));
        }
        else if(button == 4){
            if(b == 0){
                System.out.println("invalide input");
            }
            else{
                System.out.println("division result:" +(a / b));
            }
        }
        else if(button == 5){
            if(b == 0){
                System.out.println("invalide input");
            }
            else{
                System.out.println("modulo result:" +(a % b));
            }
        }
        else{
            System.out.println("invalide button");
        }
        sc.close();
        
     }
}