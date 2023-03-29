public class DieGame 
{
    public static  int GOAL_SCORE = 100;
    DiePlayer[] players;
    private int[] scores;
    public int getMaxScore;
    int myScore,turnTotal,maxScore,rolls;


    public DieGame(DiePlayer[] players)
    {
        this.players=players;
        scores=new int[players.length];
        for(int i=0;i<players.length;i++)
        scores[i]=0;

    }

    int playTurn(DiePlayer p, int playerNum)
    {
        Die x=new Die();
        boolean y=p.isRolling(myScore, turnTotal, maxScore, rolls);
        int turToplam=0;
        int z;
        do{
            z=x.nextRoll();
            turToplam+=z;

        }while(y && z!=1);

        if(y)
        { 
          return turToplam;
        }
        
        else if(z==1)
        {
          return 0;
        }
        
        else
        {
          return 0;
        }
        
    }

public int play()
{
    int birinci=0;
    while(getMaxScore()!=100)
    {
        for(int i=0;i<players.length;i++)
        {
            scores[i]=playTurn(players[i],i);
        }
    }
    printScores();
    for(int i=0;i<players.length;i++)
    {
        if(scores[i]==100)
        {
           birinci=i;
        }
    }
    return birinci;
}


int getMaxScore()
{
    int temp=scores[0];
    for(int i=0;i<scores.length;i++)
    {
        if(scores[i]>temp)
        temp=scores[i];
    }
    return temp;
}

void printScores()
{
    for(int i=0;i<players.length;i++)
    {
    System.out.println(scores[i]);
    }
}


}