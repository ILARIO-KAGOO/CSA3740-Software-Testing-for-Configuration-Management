import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;
public class qn3 
{
  @Test
  public void main()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    String s1 = "";
    sc.close();
    if(n>=18)
      n = 18;
    else
      s1 = (18-n)+" years left to be eligible"; //remove failure code in runner program
    assertEquals(s1,18,n);

  }
}
