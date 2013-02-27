package adminPage;

import qa.OBTeamQA;
import org.junit.Test;



public class VerifyHeaderImageOption extends OBTeamQA {
	

	@Test
	public void testVerifyHeaderImageOption() throws Exception {
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
		selenium.click("id=ctl00_ContentPlaceHolder1_hpheaderimage");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Header Image:"));
		assertTrue(selenium.isTextPresent("Bildestørrelse : 880px x 82px"));
		assertTrue(selenium.isTextPresent("Synlig Bildestørrelse 750px x 82px"));
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnSave"));
		selenium.click("id=ctl00_ContentPlaceHolder1_btnSave");
		Thread.sleep(3000);
		assertTrue(selenium.getTable("css=table.0.1").matches("^[\\s\\S]*$"));
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnCancel"));
		selenium.click("id=ctl00_ContentPlaceHolder1_btnCancel");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
	}



}
