import java.util.*;
public class rps {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        scoreboard player1 = new scoreboard();
        scoreboard player2 = new scoreboard();
        System.out.println("Enter rock paper or scissor: ");
        String a = sc.nextLine();
        System.out.println("Enter rock paper or scissor: "); 
        String b = sc.nextLine();
        if (a.equals(b)) {
            System.out.println("It's a tie");
        } else if (a.equals("rock") && b.equals("scissor") || a.equals("scissor") && b.equals("paper") || a.equals("paper") && b.equals("rock")) {
            player1.increasedScore();
            System.out.println("Player 1 wins");
        } else {
            player2.increasedScore();
            System.out.println("Player 2 wins");
        }
        System.out.println("Player1Score: " + player1.getscore());
        System.out.println("Player2Score: " + player2.getscore());
        sc.close();
    }
}
class scoreboard {
    private int score;
    public scoreboard() {
        this.score = 0;
    }
    public void increasedScore() {
        score++;
    }
    public int getscore() {
        return score;
    }
}