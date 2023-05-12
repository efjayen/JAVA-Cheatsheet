import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("Enter an a value");
        double a = sca.nextDouble();
        System.out.println("Enter a b value");
        double b = sca.nextDouble();
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The hypotenuse c = "+c);
    }
}
