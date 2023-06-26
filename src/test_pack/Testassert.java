package test_pack;

import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Test;
public class Testassert 
{
  @Test
  public void test()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("String: ");
    String s = sc.nextLine();
    String s1 = "Oxford not brogues";
    assertEquals(s,s1);
  }
  
}
