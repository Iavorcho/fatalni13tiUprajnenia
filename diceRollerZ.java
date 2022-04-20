import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class diceRollerZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPlayers;
        int diceNum;
        int sidesDice;
        char yesOrNo = 0;
        String[] playerNames = {"1","2","3","4", "5"};
        int[] playerRolls = {0,0,0,0,0};
        int[] playerScores = {0,0,0,0,0};

        System.out.println("Enter the number of players (no more than 4, min 2): ");
        numPlayers = scanner.nextInt();
       for (int i = 1; i <= numPlayers; ++i){
           System.out.println("Enter player"+ i + " name");
           playerNames[i] = scanner.next();
        }
        System.out.println("Enter the number of dice");
        diceNum = scanner.nextInt();
        System.out.println("Enter the number sides each dice will have");
        sidesDice = scanner.nextInt();


        do {
            System.out.printf("Let's start rolling%n");

            for (int i = 1; i <= numPlayers ; ++i) {
                System.out.println("Player" + i + ", " + playerNames[i] + " Rolled: ");

                for (int j = 0; j < diceNum; ++j)
                {
                    playerRolls[i] = (int) (Math.random() * sidesDice + 1);
                System.out.println(playerRolls[i]);
                playerScores[i] = playerScores[i] + playerRolls[i];}

                System.out.println("The total score of Player" + i + "," + playerNames[i] + " is " + playerScores[i]);

            }
            System.out.println("Enter Y to continue and any other char to stop!");
            yesOrNo = scanner.next().charAt(0);
        }
        while (yesOrNo == 'Y');

        for (int z = 1; z <= numPlayers ; ++z) {
            System.out.println("Player" + z + ", " + playerNames[z] + ", FINAL SCORE: " + playerScores[z]);}

    }

}
