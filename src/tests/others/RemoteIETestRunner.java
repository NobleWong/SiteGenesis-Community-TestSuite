/*
 * NOTE: Replace "YOUR_USERNAME" and "YOUR_ACCESS_KEY" with your SauceLabs account!   
 */
package tests.others;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;

public class RemoteIETestRunner extends AbstractScriptTestCase
{
	private WebDriver driver;

	protected RemoteIETestRunner()
	{
		final DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setCapability("version", "44");
		caps.setCapability("platform", Platform.WIN8_1);
		try
		{
			driver = new RemoteWebDriver(
					new URL("http://xxx:yyyy@ondemand.saucelabs.com:80/wd/hub"), caps);
		}
		catch (final MalformedURLException e)
		{
			e.printStackTrace();
		}
		setWebDriver(driver);
	}

	@Override
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
