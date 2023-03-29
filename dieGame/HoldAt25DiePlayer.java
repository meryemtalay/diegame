//Ya sayi 1 olana kadar ya tur skoru 25+'den fazla olana kadar devam eder.Diger durumlarda çıkar 
public class HoldAt25DiePlayer implements DiePlayer
{
    Die Hold2= new Die();
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls)
  {

    if(Hold2.nextRoll()!=1 || turnTotal<25)
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