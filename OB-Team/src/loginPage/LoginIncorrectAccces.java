package loginPage;

import qa.OBTeamQA;
import org.junit.Test;


public class LoginIncorrectAccces extends OBTeamQA {
	
	@Test
	public void testLoginIncorrectAccces() throws Exception {
		selenium.open("/Login.aspx");
		selenium.type("id=UserName", "dos");
		selenium.type("id=ctl00_ContentPlaceHolder1_Login2_Password", "sadasds");
		Thread.sleep(3000);
		selenium.click("id=LoginButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Beklager. Vennligst kontrollér brukernavn og passord og prøv igjen."));
		Thread.sleep(3000);
	}


}
