//Ya sayi 1 olana kadar ya tur skoru 20+'den fazla olana kadar devam eder.Diger durumlarda çıkar 
public class HoldAt20DiePlayer implements DiePlayer
{
    Die Hold= new Die();
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls)
  {

    if(Hold.nextRoll()!=1 || turnTotal<20)
    {
      return true;
    }
    else if((turnTotal+myScore)<100)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}