import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomint = (int) (Math.random() * 10) + 1;
        int attempts = 10;


        while (attempts > 0) {
            System.out.print("Enter number:");
            int guess = scanner.nextInt();
            if (guess == randomint) {
                System.out.print("You win!");
                break;
            } else {
                System.out.print("Wrong!");
            }


            attempts--;
            System.out.println("Your attempts: " + attempts);
        }
        if (attempts == 0) {
            System.out.print("You lose! My number: " + randomint);

        }
    }
}


