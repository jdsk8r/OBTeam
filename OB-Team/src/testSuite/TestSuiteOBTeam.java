package testSuite;


import publiseringPage.PubliseringPageTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;
import loginPage.LoginPageTestSuite;
import adminPage.AdminPageTestSuite;
import startPage.StartPageTestSuite;

public class TestSuiteOBTeam {
	
	/* this class runs the Test Suite of All Packages */
	
	 public static Test suite() {
	        TestSuite suite = new TestSuite("Suite OB-Team Project");
	        suite.addTest(LoginPageTestSuite.suite());
	        suite.addTest(StartPageTestSuite.suite());
	        suite.addTest(AdminPageTestSuite.suite());
	        suite.addTest(PubliseringPageTestSuite.suite());
	        return suite;
	    }

public static void main(String[] args) {
	        junit.textui.TestRunner.run(suite());
	    }

}
