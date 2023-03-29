import java.util.Scanner;

public class PlayDie 
{
    public static void main(String[] args) 
    {
        DiePlayer[] game = new DiePlayer[4];
        game[0] = new HoldAt20DiePlayer();
        game[1] = new HoldAt25DiePlayer();
        game[2] = new RaceToGoalDiePlayer();
        game[3] = new MyDiePlayer();

            int[] count = new int[4];
            for (int c = 0; c < 4; c++)
            {
            count[c] = 0;
            }
            for (int b = 0; b < 1000; b++) 
            {
                DieGame dieGame = new DieGame(game);
                count[dieGame.play()]++;
                System.out.println("****************************************");
            }
            for(int a=0;a<4;a++)
            {
            System.out.println(count[a]);
            }
    }
}


