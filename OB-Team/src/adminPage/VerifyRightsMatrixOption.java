package adminPage;

import qa.OBTeamQA;
import org.junit.Test;


public class VerifyRightsMatrixOption extends OBTeamQA {
	
	@Test
	public void testVerifyRightsMatrixOption() throws Exception {
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
		selenium.click("id=ctl00_ContentPlaceHolder1_hprightmatrix");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Rights Matrix"));
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnUpdateProfiles"));
		Thread.sleep(3000);
		assertEquals("Functions / Profiles", selenium.getTable("id=tblMatrix.0.0"));
		assertEquals("Ansatt OB-Team", selenium.getTable("id=tblMatrix.0.1"));
		assertEquals("Booking", selenium.getTable("id=tblMatrix.0.2"));
		assertEquals("Frilanser", selenium.getTable("id=tblMatrix.0.3"));
		assertEquals("Kunde", selenium.getTable("id=tblMatrix.0.4"));
		assertEquals("Kunderepr Prosj", selenium.getTable("id=tblMatrix.0.5"));
		assertEquals("Kunderepr VIP", selenium.getTable("id=tblMatrix.0.6"));
		assertEquals("Leverandør", selenium.getTable("id=tblMatrix.0.7"));
		assertEquals("Leverandør rep", selenium.getTable("id=tblMatrix.0.8"));
		assertEquals("Portal admin", selenium.getTable("id=tblMatrix.0.9"));
		assertEquals("Portalforfatter", selenium.getTable("id=tblMatrix.0.10"));
		assertEquals("Service", selenium.getTable("id=tblMatrix.0.11"));
		assertEquals("Xytech-bruker", selenium.getTable("id=tblMatrix.0.12"));
		assertEquals("Modules", selenium.getTable("id=tblMatrix.2.0"));
		assertEquals("Nyheter", selenium.getTable("id=tblMatrix.3.0"));
		assertEquals("Booking", selenium.getTable("id=tblMatrix.4.0"));
		assertEquals("Dokumenter", selenium.getTable("id=tblMatrix.5.0"));
		assertEquals("Publisere", selenium.getTable("id=tblMatrix.6.0"));
		assertEquals("Service", selenium.getTable("id=tblMatrix.7.0"));
		assertEquals("Admin", selenium.getTable("id=tblMatrix.8.0"));
		assertEquals("Restricted Operations", selenium.getTable("id=tblMatrix.10.0"));
		assertEquals("View external web links", selenium.getTable("id=tblMatrix.11.0"));
		assertEquals("View Productions list", selenium.getTable("id=tblMatrix.12.0"));
		assertEquals("Personal calendar", selenium.getTable("id=tblMatrix.13.0"));
		assertEquals("Customer calendar", selenium.getTable("id=tblMatrix.14.0"));
		assertEquals("Article Publishing Groups", selenium.getTable("id=tblMatrix.16.0"));
		assertEquals("OB-Team ansatte", selenium.getTable("id=tblMatrix.17.0"));
		assertEquals("OB-Team alle brukere", selenium.getTable("id=tblMatrix.18.0"));
		assertEquals("Frilansere", selenium.getTable("id=tblMatrix.19.0"));
		assertEquals("Kunder", selenium.getTable("id=tblMatrix.20.0"));
		assertEquals("Leverandører", selenium.getTable("id=tblMatrix.21.0"));
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnManageGroups"));
		selenium.click("id=ctl00_ContentPlaceHolder1_btnManageGroups");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Id"));
		assertTrue(selenium.isTextPresent("Brukergruppe navn"));
		assertTrue(selenium.isTextPresent("Slette"));
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnNewGroup"));
		selenium.click("id=ctl00_ContentPlaceHolder1_btnNewGroup");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isTextPresent("Opprett en ny Brukergruppe"));
		assertTrue(selenium.isTextPresent("Brukergruppe navn:"));
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnSave"));
		selenium.click("id=ctl00_ContentPlaceHolder1_btnSave");
		Thread.sleep(3000);
		assertTrue(selenium.getTable("css=table.last-child.0.1").matches("^[\\s\\S]*$"));
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnCancel"));
		selenium.click("id=ctl00_ContentPlaceHolder1_btnCancel");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_btnBack"));
		selenium.click("id=ctl00_ContentPlaceHolder1_btnBack");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		assertTrue(selenium.isElementPresent("id=ctl00_ContentPlaceHolder1_BtnSave"));
		Thread.sleep(3000);
		selenium.click("link=Admin");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.click("id=ctl00_hplkLogout");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
	}


}
