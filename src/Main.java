import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isContinue = true;
        while (isContinue) {
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
                    break;
                case 2:
                    System.out.println("Enter three numbers: ");
                    numberOne = scanner.nextInt();
                    numberTwo = scanner.nextInt();
                    numberThree = scanner.nextInt();
                    System.out.println("Smallest number = " + Math.min(Math.min(numberOne,numberTwo),numberThree));
                    break;
                case 3:
                    System.out.println("Enter the number: ");
                    int number = scanner.nextInt();
                    boolean isPrime = false;
                    for (int i = 2; i <= number / 2; i++) {
                        if(number % i == 0) {
                            isPrime = true;
                            break;
                        }
                    }
                    if(isPrime) {
                        System.out.println(number + " is not a prime number");
                    } else {
                        System.out.println(number + " is a prime number");
                    }
                    break;
                case 4:
                    System.out.println("Enter the number: ");
                    number = scanner.nextInt();
                    if(number % 2 == 0) {
                        System.out.println(number + " is a even number");
                    }
                    else {
                        System.out.println(number + " is a odd number");
                    }
                    break;
                case 5:
                    System.out.println("Enter the number: ");
                    number = scanner.nextInt();
                    StringBuilder rev = new StringBuilder(Integer.toString(number));
                    System.out.println("Reverse with ending zeroes: " + rev.reverse());
                    int storeNumber = number;
                    int reverseNumber = 0;
                    while(number > 0) {
                        int digit = number % 10;
                        reverseNumber = reverseNumber * 10 + digit;
                        number /= 10;
                    }
                    System.out.println("Reverse of " + storeNumber + " is " + reverseNumber);
                    break;

                case 6:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Enter a valid option!");
                    break;
            }
        }
    }
}