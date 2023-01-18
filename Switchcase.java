import java.util.*;
public class Switchcase{
    public static void main(String[] args) {
        float result;
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        double a = sca.nextDouble();
        System.out.println("Enter Second Number:");
        double b = sca.nextDouble();
        System.out.println("Choose Operation + - / *: ");
        char op = sca.next().charAt(0);
        switch (op) {
            case '+':
            result= (float) (a+b);
            System.out.println("Addition: "+result);
            break;
            case '-':
            result= (float) (a-b);
            System.out.println("Substraction: "+result);
            break;
            case '/':
            result= (float) (a/b);
            System.out.println("Division: "+result);
            break;
            case '*':
            result=(float) (a*b);
            System.out.println("Multiplication: "+result);
            break;
            default:
            System.out.println("Invalid");
            
        }
    }
}