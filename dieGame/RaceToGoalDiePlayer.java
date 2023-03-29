
public class RaceToGoalDiePlayer implements DiePlayer{
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){


        if((myScore>=71 || maxScore>=71) && myScore+turnTotal<100)
        return true;

        else if(turnTotal>=21 + Math.round((myScore+turnTotal)/8))
        return true;

        else if(turnTotal+myScore<100)
        return true;

        else{
            return false;
        }
}
}