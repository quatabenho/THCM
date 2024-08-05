import java.util.Scanner;

public class tinhx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        double S = 0.0;
        for (int i = 1; i <= n; i++) {
            double sumK = 0.0;
            for (int k = 1; k <= i; k++) {
                sumK += k;
            }
            S += 1 / sumK;
        }

        System.out.println("The value of S is: " + S);
        
        scanner.close();
    }
}
    

