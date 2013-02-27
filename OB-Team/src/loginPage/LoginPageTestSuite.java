package loginPage;

import junit.framework.Test;

import junit.framework.TestSuite;


public class LoginPageTestSuite {
	
	  public static Test suite() {
	        TestSuite suite = new TestSuite("OBTeam Project - Login Page");
	        suite.addTestSuite(LoginCorrectAccces.class);
	        suite.addTestSuite(LoginIncorrectAccces.class);
	        suite.addTestSuite(ForgotPassword.class);
	        return suite;
	    }

	    public static void main(String[] args) {
	        junit.textui.TestRunner.run(suite());
	    }


}
