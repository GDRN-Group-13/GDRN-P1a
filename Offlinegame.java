import java.util.Scanner;

public class Offlinegame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean play = true;
        while (play) {
            int rnd = (int) (Math.random() * 50);
            boolean found = false;
            int currentry = 0;
            int maxtry = 6;

            while (!found && currentry < maxtry) {
                System.out.println("please input try. Current try: " + currentry);
                int i = scan.nextInt();
                if (i == rnd) {
                    found = true;
                    break;
                } else if (i > rnd) {
                    System.out.println("Your number is too large");
                } else if (i < rnd) {
                    System.out.println("Your number is too small");
                } else {
                    System.out.println("error");
                    currentry--;
                }
                currentry++;
            }
            if (found) {
                System.out.println("Congrats, you found the number! The correct answer is: " + rnd);
            } else {
                System.out.println("You failed. The correct answer is: " + rnd);
            }

            System.out.println("Try again? 1=yes, 0=no");
            int i = scan.nextInt();
            if (i == 0) {
                play = false;
            }
        }
        scan.close();
    }
}
