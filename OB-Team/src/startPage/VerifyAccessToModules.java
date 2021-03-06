package startPage;

import qa.OBTeamQA;
import org.junit.Test;


public class VerifyAccessToModules extends OBTeamQA {
	

	@Test
	public void testVerifyAccessToModules() throws Exception {
		selenium.open("/Login.aspx");
		selenium.type("id=UserName", "dos");
		selenium.type("id=ctl00_ContentPlaceHolder1_Login2_Password", "obteam");
		Thread.sleep(3000);
		selenium.click("id=LoginButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(6000);
		assertTrue(selenium.isTextPresent("Start"));
		assertTrue(selenium.isTextPresent("Nyheter"));
		assertTrue(selenium.isTextPresent("Booking"));
		assertTrue(selenium.isTextPresent("Dokumenter"));
		assertTrue(selenium.isTextPresent("Publisering"));
		assertTrue(selenium.isTextPresent("Admin"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkProfile");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Xytech-bruker"));
		assertTrue(selenium.isTextPresent("Ansatt OB-Team"));
		assertTrue(selenium.isTextPresent("Portalforfatter"));
		assertTrue(selenium.isTextPresent("Portal admin"));
		assertTrue(selenium.isTextPresent("Service"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.type("id=UserName", "test1");
		selenium.type("id=ctl00_ContentPlaceHolder1_Login2_Password", "frilans");
		Thread.sleep(3000);
		selenium.click("id=LoginButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(6000);
		assertTrue(selenium.isTextPresent("Start"));
		assertTrue(selenium.isTextPresent("Nyheter"));
		assertTrue(selenium.isTextPresent("Booking"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkProfile");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Frilanser"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.type("id=UserName", "test2");
		selenium.type("id=ctl00_ContentPlaceHolder1_Login2_Password", "ansatt");
		Thread.sleep(3000);
		selenium.click("id=LoginButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(6000);
		assertTrue(selenium.isTextPresent("Start"));
		assertTrue(selenium.isTextPresent("Nyheter"));
		assertTrue(selenium.isTextPresent("Booking"));
		assertTrue(selenium.isTextPresent("Dokumenter"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkProfile");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Xytech-bruker"));
		assertTrue(selenium.isTextPresent("Ansatt OB-Team"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.type("id=UserName", "test3");
		selenium.type("id=ctl00_ContentPlaceHolder1_Login2_Password", "ansatt2");
		Thread.sleep(3000);
		selenium.click("id=LoginButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(6000);
		assertTrue(selenium.isTextPresent("Start"));
		assertTrue(selenium.isTextPresent("Nyheter"));
		assertTrue(selenium.isTextPresent("Booking"));
		assertTrue(selenium.isTextPresent("Dokumenter"));
		assertTrue(selenium.isTextPresent("Publisering"));
		assertTrue(selenium.isTextPresent("Admin"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkProfile");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Xytech-bruker"));
		assertTrue(selenium.isTextPresent("Ansatt OB-Team"));
		assertTrue(selenium.isTextPresent("Portalforfatter"));
		assertTrue(selenium.isTextPresent("Portal admin"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.type("id=UserName", "test4");
		selenium.type("id=ctl00_ContentPlaceHolder1_Login2_Password", "kunde");
		Thread.sleep(3000);
		selenium.click("id=LoginButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(6000);
		assertTrue(selenium.isTextPresent("Start"));
		assertTrue(selenium.isTextPresent("Nyheter"));
		assertTrue(selenium.isTextPresent("Booking"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkProfile");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Kunderepr Prosj"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.type("id=UserName", "test5");
		selenium.type("id=ctl00_ContentPlaceHolder1_Login2_Password", "kunde2");
		Thread.sleep(3000);
		selenium.click("id=LoginButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(6000);
		assertTrue(selenium.isTextPresent("Start"));
		assertTrue(selenium.isTextPresent("Nyheter"));
		assertTrue(selenium.isTextPresent("Booking"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkProfile");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Frilanser"));
		assertTrue(selenium.isTextPresent("Kunderepr VIP"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.type("id=UserName", "test6");
		selenium.type("id=ctl00_ContentPlaceHolder1_Login2_Password", "lev");
		Thread.sleep(3000);
		selenium.click("id=LoginButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(6000);
		assertTrue(selenium.isTextPresent("Start"));
		assertTrue(selenium.isTextPresent("Nyheter"));
		assertTrue(selenium.isTextPresent("Booking"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkProfile");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Frilanser"));
		assertTrue(selenium.isTextPresent("LeverandÝr rep"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
	}


}
