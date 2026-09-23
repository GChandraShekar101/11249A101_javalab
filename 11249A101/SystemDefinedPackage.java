import java.util.*;

public class SystemDefinedPackage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Square root = " + Math.sqrt(n));
        System.out.println("Square = " + (n * n));

        sc.close();
    }
}