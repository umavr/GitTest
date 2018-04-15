package sampleGitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleGitTest {
@Test
public void logintest() throws IOException
{
	// TODO Auto-generated method stub
			WebDriver wd = new FirefoxDriver();
			wd.manage().window().maximize();
			wd.get("https://www.flipkart.com/");
			//2 interface can't be integrated so using casting here
			File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			//apache utility
			//Copy file - to move to physical file
			FileUtils.copyFile(src, new File("C:\\SeleniumWorkspace\\SampleGitTest\\Screenshot\\Test.jpeg"));
		}	
}


