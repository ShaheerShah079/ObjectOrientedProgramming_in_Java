
import java.util.Scanner;

class Game{
        private int guessNo;
        private int yourNo;
        private int yourScore=0;
        public Game(){
            guessNo= (int) (Math.random()*100);;
        }
        public void setNo() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
            yourNo = input.nextInt();
        }
        public boolean check() {
            if (yourNo == (guessNo - 1) || yourNo == (guessNo - 2) || yourNo == (guessNo - 3) || yourNo == (guessNo - 4) ||
                    yourNo == (guessNo - 5)) {
                System.out.println("Your no is less than the Guess no.But you are to close");
                yourScore++;
                return false;
            } else if (yourNo == (guessNo + 1) || yourNo == (guessNo + 2) || yourNo == (guessNo + 3) || yourNo == (guessNo + 4) ||
                    yourNo == (guessNo + 5)) {
                System.out.println("Your no is greater than the Guess no.But you are to close");
                yourScore++;
                return false;
            } else if (yourNo > guessNo) {
                System.out.println("Your no is greater than the Guess no.");
                yourScore++;
                return false;
            } else if (yourNo < guessNo) {
                System.out.println("Your no is less than the Guess no.");
                yourScore++;
                return false;
            }
            else {
                return true;
            }
        }
        public int score(){
            return yourScore;
        }
    }
    public class gameguessnumber {
        public static void main(String[] args) {
            Game player = new Game();
            while (true) {
                player.setNo();
                if (player.check()) {
                    System.out.println("YES. you find the right guess. And your score is " + player.score());
                    break;
                }
            }
        }
    }

