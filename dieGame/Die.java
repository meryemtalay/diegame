
/*Meryem Talay
 *20120205039
 *meyremtlly@gmail.com
 *Die Game
 */
 
import java.util.Random;

public class Die
{
  public static int nextRoll()// 1 ve 6 aralığında rastgele sayı seçen metottur. 
  {
    Random r= new Random();
    return r.nextInt(6)+1;
  }
}