package startPage;

import qa.OBTeamQA;
import org.junit.Test;

public class VerifyProductionList extends OBTeamQA {
	

	@Test
	public void testVerifyProductionList() throws Exception {
		selenium.open("/Login.aspx?ReturnUrl=%2fDefault.aspx");
		selenium.type("id=UserName", "dos");
		selenium.type("id=ctl00_ContentPlaceHolder1_Login2_Password", "obteam");
		Thread.sleep(3000);
		selenium.click("id=LoginButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(6000);
		assertTrue(selenium.isTextPresent("Produksjoner"));
		Thread.sleep(3000);
		selenium.click("id=firstChildMenuLink");
		selenium.click("id=secondChildMenuLink");
		selenium.click("id=secondChildMenuLink");
		selenium.click("id=firstChildMenuLink");
		selenium.click("id=ctl00_ContentPlaceHolder2_ActivityControl1_btnAll");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=ctl00_ContentPlaceHolder2_ActivityControl1_btnNormal");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=secondChildMenuLink");
		selenium.click("id=ctl00_ContentPlaceHolder2_ActivityControl1_btnAllTomorrow");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=ctl00_ContentPlaceHolder2_ActivityControl1_btnNormalTomorrow");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=secondChildMenuLink");
		assertTrue(selenium.isTextPresent("I dag"));
		assertTrue(selenium.isTextPresent("I morgen"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
	}


}
