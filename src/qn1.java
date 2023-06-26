import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;
public class qn1 
{
  @Test
  public void main()
  {
    String str;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String: ");
    str = sc.nextLine();
    String str1 = "";
    sc.close();
    System.out.println("Reverse of a String "+str+" is ");
    for(int j = str.length();j>0;--j)
    {
      System.out.print(str.charAt(j-1));
      str1 = str1 + (str.charAt(j-1));
    }
    System.out.println();
    assertEquals(str1, str);
  }
}
