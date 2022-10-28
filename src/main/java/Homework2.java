import com.sun.org.apache.xpath.internal.objects.XString;

import java.math.BigDecimal;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        // 2 + 3
        int c1 = 0, c2 = 0;
        String simbol;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1-st digit");
        if (scanner.hasNextInt()) {
            c1 = scanner.nextInt();

        } else {
            System.out.println("Error not digit");
            System.exit(0);
        }

        System.out.println("Enter math operator");

        simbol = scanner.next();


        System.out.println("Enter second digit");
        if (scanner.hasNextInt()) {
            c2 = scanner.nextInt();
        } else {
            System.out.println("Error not digit");
            System.exit(0);
        }


        int result = 0;
        switch (simbol) {
            case "+":
                result = c1 + c2;
                break;
            case "-":
                result = c1 - c2;
                break;
            case "*":
                result = c1 * c2;
                break;
            case "/":
                if (c2 != 0) {
                    result = c1 / c2;
                } else {
                    System.out.println("Null pointer exception");
                    System.exit(0);
                }
                break;
            case "%":
                if (c2 != 0) {
                    result = (c1 / c2) * 100;
                } else {
                    System.out.println("Null pointer exception");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Error simbol");
                System.exit(0);
        }
        System.out.println("Result = " + result);
    }
}



