package adminPage;

import junit.framework.Test;
import junit.framework.TestSuite;


public class AdminPageTestSuite {
	
	  public static Test suite() {
	        TestSuite suite = new TestSuite("OBTeam Project - Admin Page");
	        suite.addTestSuite(VerifyAdminOptions.class);
	        suite.addTestSuite(VerifyLinksOption.class);
	        suite.addTestSuite(VerifyHeaderImageOption.class);
	        suite.addTestSuite(VerifyArticleTemplatesOption.class);
	        suite.addTestSuite(VerifyArticleCategoryOption.class);
	        suite.addTestSuite(VerifyArticleTypeOption.class);
	        suite.addTestSuite(VerifyRightsMatrixOption.class);
	        suite.addTestSuite(VerifyTimeCalendar.class);
	        return suite;
	    }

	    public static void main(String[] args) {
	        junit.textui.TestRunner.run(suite());
	    }

}
