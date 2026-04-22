
import java.util.Scanner;
public class Calculator4SwitchCase{
    public static void main(String[] args) {
        while (true){
        Scanner sc = new Scanner(System.in);
        double n1;
        double n2 ;
        char op;
           while (true){
        System.out.println("Enter a number ");
        n1 = sc.nextDouble();

        System.out.println("Enter a operators (+ ; - ; * ; /)");
        op = sc.next().charAt(0);

        System.out.println("Enter a number");
        n2 = sc.nextDouble();


        switch(op){
         case  '+' :
         System.out.println("Resut = " + (n1 + n2));
         break;

        case '-':
        System.out.println("Result = " + (n1 - n2));
        break;

        case '*' :
            System.out.println(" result = " + (n1 * n2));
            break;
        case '/' :
            if(n2 != 0){
            System.out.println("Result = " + (n1 / n2));
            }else {
                System.out.println("Cannot divide by zero");
            }
         default:
            System.out.println("Invalid input");
        



        }

        }
        
    }
}
}