
import java.util.Scanner;


public class Main {
    /*
    Girilen 3 adet sayının en büyüğünü bulmak projenin amacıdır.
    */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your first number = ");
        double a = scn.nextDouble();
        System.out.println("Enter your second number = ");
        double b = scn.nextDouble();
        System.out.println("Enter your third number = ");
        double c = scn.nextDouble();
        
        if(a>b && a>c){
            System.out.println("Max number :" +a);
        }
        else if(b>a && b>c){
            System.out.println("Max number :" +b);
        }
        else if(c>a && c>b){
            System.out.println("Max number :"+c);
        }
        double d;
        
   
        
    }
    
}
