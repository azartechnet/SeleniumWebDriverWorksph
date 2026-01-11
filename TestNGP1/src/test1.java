import org.testng.annotations.Test;

public class test1 {

	
	@Test(enabled = false)
	public void test()
	{
		System.out.println("Welcome to the TestNG");
	}
	@Test
	public void test2()
	{
		System.out.println("This is TestNG2");
	}

}
