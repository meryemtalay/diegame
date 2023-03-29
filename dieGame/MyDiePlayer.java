//Ya sayi 1 olana kadar ya tur skoru 45+'den fazla olana kadar devam eder.Diger durumlarda çıkar 
public class MyDiePlayer implements DiePlayer
{
    Die HoldMy= new Die();
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls)
  {
    if(HoldMy.nextRoll()!=1 || turnTotal<45)
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