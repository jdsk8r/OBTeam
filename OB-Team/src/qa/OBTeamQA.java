package qa;

import org.junit.After;
import org.junit.Before;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import junit.framework.TestCase;

public class OBTeamQA extends TestCase {
	
	//this the parent class from all Test inherit
	
	protected Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://portal.obteam.no:1820/");
		selenium.start();
	}
	
	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}

}
