package adminPage;


import org.junit.Test;
import qa.OBTeamQA;



public class VerifyAdminOptions extends OBTeamQA {
	

	@Test
	public void testVerifyAdminOptions() throws Exception {
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
		assertTrue(selenium.isTextPresent("Links"));
		assertTrue(selenium.isTextPresent("Header image"));
		assertTrue(selenium.isTextPresent("Article Templates"));
		assertTrue(selenium.isTextPresent("Article Category"));
		assertTrue(selenium.isTextPresent("Article Type"));
		assertTrue(selenium.isTextPresent("Rights Matrix"));
		assertTrue(selenium.isTextPresent("Timer Calendar"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
	}


}
