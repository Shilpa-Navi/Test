
public class Lib {
public static takeScreenshot() {
	public void takeScreenshot(String testname){
		Date d = new Date();
		String currentdate = d.toString().replaceAll(":", "_");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new
		File(".\\screenshots\\"+currentdate+"\\"+testname+"_screenshot.png");
		try {
		FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
		e.printStackTrace();
		}
		}
}
}
