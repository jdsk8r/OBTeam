package loginPage;

import qa.OBTeamQA;
import org.junit.Test;


public class LoginCorrectAccces extends OBTeamQA {
	
	@Test
	public void testLoginCorrectAccces() throws Exception {
		selenium.open("/Login.aspx");
		selenium.type("id=UserName", "dos");
		selenium.type("id=ctl00_ContentPlaceHolder1_Login2_Password", "obteam");
		Thread.sleep(3000);
		selenium.click("id=LoginButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(5000);
		assertTrue(selenium.isTextPresent("Min profil"));
		assertTrue(selenium.isTextPresent("Logg ut"));
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
	}


}
