import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseTest {
	public static WebDriver driver;
	static {
		System.setProperty(Chrome_Key,Chrome_Value);
		driver=new ChromeDriver();
	}

	@BeforeMethod
	public void initialisation() {
		String URL = Lib.getProperty(Config_Path, "URL");
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String pageLoad = Lib.getProperty(Config_Path, "Page_Load_Time");
		int pageLoadTime = Integer.parseInt(pageLoad);
		driver.manage().timeouts().pageLoadTimeout(pageLoadTime, TimeUnit.SECONDS);
		String wait = Lib.getProperty(Config_Path, "Implicit_Wait");
		int ImplictWait = Integer.parseInt(wait);
		driver.manage().timeouts().implicitlyWait(ImplictWait, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApplication() {
		//driver.close();
	}
}
