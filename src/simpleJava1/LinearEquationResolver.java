package simpleJava1;
import java.util.Scanner;

public class LinearEquationResolver {
    public static void main (String[] args) {
        System.out.println("Linear Equation Resoler");
        System.out.println("Given a equation as 'a *x +b =0 ', given enter constants" );

        Scanner scanner = new Scanner(System.in);

        System.out.println(" a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        if ( a != 0) {
            double solution = -b /a;
            System.out.printf(" the solution is: %f!", solution);
        }else {
            if (b==0) {
                System.out.println("the solution is all x!");

            }else {
                System.out.println("No solution!");
            }
        }
    }
}
