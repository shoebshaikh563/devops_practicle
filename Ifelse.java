import java.util.*;;
public class Ifelse{
public static void main (String[]args){
System.out.print("enter No: ");
Scanner scan = new Scanner(System.in);
int a = scan.nextInt(); 
if(a>=1 && a<=10){
    System.out.print("It between 1 to 10");
}
else if (a>=11 && a<=20) {
    System.out.print("It between 11 to 20");
} else {
    System.out.print("out of range");
}
}
}