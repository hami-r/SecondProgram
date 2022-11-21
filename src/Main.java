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
            switch (choice) {
                case 1:
                    System.out.println("Enter three numbers: ");
                    int numberOne = scanner.nextInt();
                    int numberTwo = scanner.nextInt();
                    int numberThree = scanner.nextInt();
                    System.out.println("Largest number = " + Math.max(Math.max(numberOne,numberTwo),numberThree));
                case 2:
                    System.out.println("Enter three numbers: ");
                    numberOne = scanner.nextInt();
                    numberTwo = scanner.nextInt();
                    numberThree = scanner.nextInt();
                    System.out.println("Smallest number = " + Math.min(Math.min(numberOne,numberOne),numberThree));

            }
        }
    }
}