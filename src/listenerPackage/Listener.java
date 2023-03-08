package listenerPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener 
{
	public void onTestStart(ITestResult r)
	{
		System.out.println("Test case is started for execution");
	
	
	}
	
	public void onTestSuccess(ITestResult r)
	{
		System.out.println("Test case is successfully passed");
	}
	
	public void onTestFailure(ITestResult r)
	{
		System.out.println("Test case is failed and hence take screenshot");
	}
	
	
	
}
