import java.util.*;



public class timso {

    // Function to check if a number is a Fibonacci number
    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }
        int a = 0, b = 1;
        while (b < number) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array of integers
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter each elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find and print the Fibonacci numbers in the array
        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        for (int number : array) {
            if (isFibonacci(number)) {
                fibonacciNumbers.add(number);
            }
        }

        System.out.println("Fibonacci numbers in the array:");
        for (int number : fibonacciNumbers) {
            System.out.print(number + " ");
        }
    }
}
