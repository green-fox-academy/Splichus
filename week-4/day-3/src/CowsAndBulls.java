import java.util.Scanner;

public class CowsAndBulls {

    int numberToGuess;
    boolean playing = true;
    boolean finished = false;
    int counter;

    public CowsAndBulls() {
        this.numberToGuess = setNumberToGuess();
    }

    public CowsAndBulls(int numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
        this.playing = !finished;
    }

    public int setNumberToGuess() {
        return (int) (Math.random() * 9000) + 1000;
    }

    public String guess() {
        String toReturn = "";
        int numberToGuess = this.numberToGuess;
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the number");
        int guess = 0;
        while (true) {
            try {
                guess = Integer.valueOf(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("please enter a number between 1000 and 9999");
            }
        }
        if (guess >= 1000 && guess <= 9999) {
            for (int i = 0; i < 4; i++) {
                if (guess % 10 == numberToGuess % 10) {
                    toReturn = "cow " + toReturn;
                } else {
                    toReturn = "bull " + toReturn;
                }
                if (toReturn.equals("cow cow cow cow ")) {
                    this.setFinished(true);
                    return "You have won the game, grats!";
                }
                guess/=10;
                numberToGuess/=10;
            }
            return toReturn;
        } else {
            return "please enter a number between 1000 and 9999";
        }
    }
}
