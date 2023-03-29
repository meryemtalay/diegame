import java.util.Scanner;

public class UserDiePlayer implements DiePlayer // Kullaniciya devam mi tamam mi sorusunu sorar.
{
  public boolean isRolling(int myScore,int turnTotal,int maxScore,int rolls)
  { 
    Scanner game =new Scanner(System.in);
    boolean sayi=false;
    String bas=game.nextLine();
    // eger bosluk girilirse (null) devam ,diger durumlarda birakir.
    if(bas== " ")
    {
      sayi=true;
    }
    else
    {
      sayi=false;
    } 
      return sayi;
  }

}