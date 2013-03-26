package adminPage;

import qa.OBTeamQA;
import org.junit.Test;

public class VerifyTimeCalendar extends OBTeamQA {
	
	@Test
	public void testVerifyTimeCalendar() throws Exception {
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
		selenium.click("id=ctl00_ContentPlaceHolder1_hptimecalendar");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Frekvens av opplasting (minutter)"));
		assertTrue(selenium.isTextPresent("Aktivere automatisk oppdatering"));
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnSave"));
		selenium.click("id=ctl00_ContentPlaceHolder1_btnSave");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.click("link=Admin");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
	}


}
