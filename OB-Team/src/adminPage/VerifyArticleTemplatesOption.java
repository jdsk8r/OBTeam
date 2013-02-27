package adminPage;

import qa.OBTeamQA;
import org.junit.Test;



public class VerifyArticleTemplatesOption extends OBTeamQA {
	

	@Test
	public void testVerifyArticleTemplatesOption() throws Exception {
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
		selenium.click("id=ctl00_ContentPlaceHolder1_hparticletemplates");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Id"));
		assertTrue(selenium.isTextPresent("Navn"));
		assertTrue(selenium.isTextPresent("Redigere"));
		assertTrue(selenium.isTextPresent("Slett"));
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnNew"));
		selenium.click("id=ctl00_ContentPlaceHolder1_btnNew");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Navn:"));
		assertTrue(selenium.isTextPresent("Layout:"));
		assertTrue(selenium.isTextPresent("Bare htm og html-filer er tillatt"));
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnSave"));
		selenium.click("id=ctl00_ContentPlaceHolder1_btnSave");
		Thread.sleep(3000);
		assertTrue(selenium.getTable("css=table.first-child.0.1").matches("^[\\s\\S]*$"));
		assertEquals("Fil påkrevd \n Bare htm og html-filer er tillatt", selenium.getTable("css=table.first-child.1.1"));
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


}
