package startPage;

import qa.OBTeamQA;
import org.junit.Test;


public class VerifySearchWithNoResults extends OBTeamQA {
	
	@Test
	public void testVerifySearchWithNoResults() throws Exception {
		selenium.open("/Login.aspx");
		selenium.type("id=UserName", "test3");
		selenium.type("id=ctl00_ContentPlaceHolder1_Login2_Password", "ansatt2");
		Thread.sleep(3000);
		selenium.click("id=LoginButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(6000);
		selenium.type("id=txtSearch", "futbol");
		Thread.sleep(3000);
		selenium.click("id=btnSearch");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Viser søkeresultat for \"futbol\""));
		assertTrue(selenium.isTextPresent("Ikke funnet."));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
	}


}
