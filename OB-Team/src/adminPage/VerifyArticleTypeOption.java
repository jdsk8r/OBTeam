package adminPage;

import qa.OBTeamQA;
import org.junit.Test;


public class VerifyArticleTypeOption extends OBTeamQA {
		

	@Test
	public void testVerifyArticleTypeOption() throws Exception {
		selenium.open("/Login.aspx");
		selenium.type("id=UserName", "dos");
		selenium.type("id=ctl00_ContentPlaceHolder1_Login2_Password", "obteam");
		Thread.sleep(3000);
		selenium.click("id=LoginButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(6000);
		selenium.click("link=Admin");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.click("id=ctl00_ContentPlaceHolder1_hparticletype");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Id"));
		assertTrue(selenium.isTextPresent("Navn"));
		assertTrue(selenium.isTextPresent("Layout"));
		assertTrue(selenium.isTextPresent("Redigere"));
		Thread.sleep(3000);
		selenium.click("link=Admin");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
	}



}
