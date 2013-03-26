package adminPage;

import qa.OBTeamQA;
import org.junit.Test;


public class VerifyLinksOption extends OBTeamQA {
	
	@Test
	public void testVerifyLinksOption() throws Exception {
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
		selenium.click("id=ctl00_ContentPlaceHolder1_hplinks");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Id"));
		assertTrue(selenium.isTextPresent("Link"));
		assertTrue(selenium.isTextPresent("Redigere"));
		assertTrue(selenium.isTextPresent("Slett"));
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnNew"));
		selenium.click("id=ctl00_ContentPlaceHolder1_btnNew");
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isTextPresent("Url:"));
		assertTrue(selenium.isTextPresent("Name:"));
		assertTrue(selenium.isTextPresent("Image:"));
		assertTrue(selenium.isTextPresent("Forslag størrelse: 50px x 48px"));
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnSave"));
		selenium.click("id=ctl00_ContentPlaceHolder1_btnSave");
		Thread.sleep(3000);
		assertTrue(selenium.getTable("css=table.0.1").matches("^[\\s\\S]*$"));
		assertTrue(selenium.getTable("css=table.1.1").matches("^[\\s\\S]*$"));
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnCancel"));
		selenium.click("id=ctl00_ContentPlaceHolder1_btnCancel");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.click("link=Admin");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
	}
	
	@Test
	public void testIncorrectUrls() throws Exception {
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
		selenium.click("id=ctl00_ContentPlaceHolder1_hplinks");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.click("id=ctl00_ContentPlaceHolder1_btnNew");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.type("id=ctl00_ContentPlaceHolder1_txtUrl", "sdgsdgdsg");
		selenium.type("id=ctl00_ContentPlaceHolder1_txtName", "sgsdgsd");
		assertTrue(selenium.isTextPresent("Angi en gyldig nettadresse"));
		selenium.type("id=ctl00_ContentPlaceHolder1_txtUrl", "google.com");
		Thread.sleep(3000);
		selenium.click("id=ctl00_ContentPlaceHolder1_btnSave");
		assertTrue(selenium.isTextPresent("Angi en gyldig nettadresse"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
	}


}
