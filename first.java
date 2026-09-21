import java.util.Scanner;

class First{
    public static void main(String[] args) {
        
        int i = 0;
        while(i < 11){
          System.out.println(i);
          i++;
        }
        for(int a = 0; a <= 10; a ++ ){
        System.out.println("hello");
    }
    int b = 1;
    do{
        System.out.println(b);
        b++;
    }
    while(b <= 10);


    //add sum of n natural numbers: by for loop

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int c = 1; c <= 100; c++){
        System.out.println(c*n);
    }

    

    
    


    } 
}