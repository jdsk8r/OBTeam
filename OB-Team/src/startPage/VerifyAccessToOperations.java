package startPage;

import qa.OBTeamQA;
import org.junit.Test;


public class VerifyAccessToOperations extends OBTeamQA {
	

	@Test
	public void testVerifyAccessToOperations() throws Exception {
		selenium.open("/");
		selenium.type("id=UserName", "dos");
		selenium.type("id=ctl00_ContentPlaceHolder1_Login2_Password", "obteam");
		Thread.sleep(3000);
		selenium.click("id=LoginButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(6000);
		assertTrue(selenium.isTextPresent("Produksjoner"));
		assertTrue(selenium.isTextPresent("Min kalender"));
		assertTrue(selenium.isElementPresent("//a[@id='ctl00_lkExternalLinks_lvLinks_ctrl0_HyperLink2']/span"));
		assertTrue(selenium.isElementPresent("//a[@id='ctl00_lkExternalLinks_lvLinks_ctrl1_HyperLink1']/img"));
		assertTrue(selenium.isElementPresent("//a[@id='ctl00_lkExternalLinks_lvLinks_ctrl2_HyperLink1']/img"));
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("I dag"));
		assertTrue(selenium.isTextPresent("I morgen"));
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
		assertTrue(selenium.isTextPresent("Min kalender"));
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
		assertTrue(selenium.isTextPresent("Produksjoner"));
		assertTrue(selenium.isTextPresent("I dag"));
		assertTrue(selenium.isTextPresent("I morgen"));
		assertTrue(selenium.isTextPresent("Min kalender"));
		assertTrue(selenium.isElementPresent("//a[@id='ctl00_lkExternalLinks_lvLinks_ctrl0_HyperLink2']/span"));
		assertTrue(selenium.isElementPresent("//a[@id='ctl00_lkExternalLinks_lvLinks_ctrl1_HyperLink1']/img"));
		assertTrue(selenium.isElementPresent("//a[@id='ctl00_lkExternalLinks_lvLinks_ctrl2_HyperLink1']/img"));
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
		assertTrue(selenium.isTextPresent("Produksjoner"));
		assertTrue(selenium.isTextPresent("I dag"));
		assertTrue(selenium.isTextPresent("I morgen"));
		assertTrue(selenium.isTextPresent("Min kalender"));
		assertTrue(selenium.isElementPresent("//a[@id='ctl00_lkExternalLinks_lvLinks_ctrl0_HyperLink1']/img"));
		assertTrue(selenium.isElementPresent("//a[@id='ctl00_lkExternalLinks_lvLinks_ctrl1_HyperLink1']/img"));
		assertTrue(selenium.isElementPresent("//a[@id='ctl00_lkExternalLinks_lvLinks_ctrl2_HyperLink1']/img"));
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
		assertTrue(selenium.isTextPresent("Min kalender"));
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
		assertTrue(selenium.isTextPresent("Min kalender"));
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
		assertTrue(selenium.isTextPresent("Min kalender"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
	}


}
