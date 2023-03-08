package listenerPackage;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerPackage.Listener.class) 

public class TestClass
{
	@Test
	public void testA()
	{
		System.out.println("Test-A");
		Assert.assertTrue(true);  //pass
	}
	@Test
	public void testB()
	{
		System.out.println("Test-B");
		Assert.assertTrue(false);//fail
	}
	
}
