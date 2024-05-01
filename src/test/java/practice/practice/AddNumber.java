package practice.practice;

import org.testng.annotations.Test;

@Test
public class AddNumber {
   @Test(priority = 2)
	public void add()
	{
		System.out.println(1+1);
	}
   @Test(priority = 1)
   public void sub()
   {
	   System.out.println(2-1);
   }
}
