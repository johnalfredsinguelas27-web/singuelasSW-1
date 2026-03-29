import java.util.*;
    public class script{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a=scan.nextInt();

        System.out.println("Enter Second Number:");
        int b=scan.nextInt();

        System.out.println("Enter Modulus:");
        int n=scan.nextInt();

    
        System.out.println("1 (Addition)");
        System.out.println("2 (Subtraction)");
        System.out.println("3 (Multiplication)");
        System.out.println("4 (Division)");
        System.out.println("\nChoose Operator:");
        int choice=scan.nextInt();

        int result;

        switch(choice){
            case 1:
                result = (a + b) % n;
                System.out.println("\nResult: ("+ a + "+"+ b + ") mod: "+ n + "=" +result);
                break;
            
            case 2: 
                result = (a - b) % n;
                 System.out.println("\nResult: ("+ a + "-"+ b + ") mod: "+ n + "=" +result);
                break;
            
            case 3: 
                result = (a * b) % n;
                 System.out.println("\nResult: ("+ a + "*"+ b + ") mod: "+ n + "=" +result);
                 break;
            
            case 4: 
                result = (a / b) % n;
                 System.out.println("\nResult: ("+ a + "/"+ b + ") mod: "+ n + "=" +result);
                 break;
            
            default: 
                System.out.println("\nInvalid Choice.");

        }

    }
}
