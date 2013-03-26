package loginPage;

import qa.OBTeamQA;
import org.junit.Test;


public class ForgotPassword extends OBTeamQA {
	
	@Test
	public void testForgotPassword() throws Exception {
		selenium.open("/Login.aspx");
		selenium.click("id=ctl00_ContentPlaceHolder1_Login2_btnForgetPassword");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Glemt passord?"));
		assertTrue(selenium.isTextPresent("Skriv inn ditt brukernavn for � f� tilsendt passord til din registrerte e-postadresse."));
		assertTrue(selenium.isTextPresent("Dersom du har glemt brukernavnet m� du kontakte OB-Team booking."));
		assertTrue(selenium.isTextPresent("Brukernavn:"));
		assertTrue(selenium.isElementPresent("id=UserName"));
		selenium.click("id=ctl00_ContentPlaceHolder1_prForgetpassword_UserNameContainerID_SubmitButton");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Vi klarte ikke � f� tilgang til informasjonen. Vennligst pr�v igjen."));
	}


}
