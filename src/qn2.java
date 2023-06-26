import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;
public class qn2 
{
  @Test
  public void main()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String1: ");
    String st = sc.nextLine();
    System.out.print("Enter String2: ");
    String sy = sc.nextLine();
    sc.close();
    assertEquals(sy, st);
  }
}
