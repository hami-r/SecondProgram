import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    <------------MENU--------------->
                    1. Largest
                    2. Smallest
                    3. Prime number
                    4. Even or Odd
                    5. Reverse
                    6. Exit
                    Select your option:""");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
        }
    }
}