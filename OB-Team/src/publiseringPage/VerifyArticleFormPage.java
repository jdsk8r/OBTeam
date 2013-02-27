package publiseringPage;

import qa.OBTeamQA;
import org.junit.Test;


public class VerifyArticleFormPage extends OBTeamQA {
	
	@Test
	public void testVerifyArticleFormPage() throws Exception {
		selenium.open("/Login.aspx?ReturnUrl=%2fDefault.aspx");
		selenium.type("id=UserName", "dos");
		selenium.type("id=ctl00_ContentPlaceHolder1_Login2_Password", "obteam");
		Thread.sleep(3000);
		selenium.click("id=LoginButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(6000);
		selenium.click("link=Publisering");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("ID"));
		assertTrue(selenium.isTextPresent("Tittel"));
		assertTrue(selenium.isTextPresent("Forfatter"));
		assertTrue(selenium.isTextPresent("Publiseringsdato"));
		assertTrue(selenium.isTextPresent("Redigere"));
		assertTrue(selenium.isTextPresent("Slett"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_ContentPlaceHolder1_btnNewArticle");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Type / Mal"));
		assertTrue(selenium.isTextPresent("Title:"));
		assertTrue(selenium.isTextPresent("Avslutt publisering:"));
		assertTrue(selenium.isTextPresent("Vises for:"));
		assertTrue(selenium.isTextPresent("OB-Team ansatte"));
		assertTrue(selenium.isTextPresent("OB-Team alle brukere"));
		assertTrue(selenium.isTextPresent("Frilansere"));
		assertTrue(selenium.isTextPresent("Kunder"));
		assertTrue(selenium.isTextPresent("Leverandører"));
		assertTrue(selenium.isTextPresent("Velg miniatyrbilde for startside:"));
		assertTrue(selenium.isTextPresent("Vennligst lagre før sjekk som standard bilde"));
		assertTrue(selenium.isTextPresent("Kategori:"));
		assertTrue(selenium.isTextPresent("Nøkkelord:"));
		assertTrue(selenium.isTextPresent("Tillate kommentarer?"));
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnSave"));
		Thread.sleep(3000);
		selenium.click("id=ctl00_ContentPlaceHolder1_btnCancel");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.click("//td[5]/input");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.click("id=ctl00_ContentPlaceHolder1_btnCancel");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
	}


}
