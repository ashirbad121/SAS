import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScript1Test {
	@Test
	public void tc1Test()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		System.out.println("jine ke hai 4 din oooo baki hai bekar din oooo jaye jaye jawani fir na aye oooo");
	}

}
