package startPage;

import junit.framework.Test;
import junit.framework.TestSuite;


public class StartPageTestSuite {
	
	  public static Test suite() {
		  
		  /* this class runs the Test Suite of the Start Page */
		  
	        TestSuite suite = new TestSuite("OBTeam Project - Start Page");
	        suite.addTestSuite(VerifyAccessToModules.class);
	        suite.addTestSuite(VerifyAccessToOperations.class);
	        suite.addTestSuite(VerifySearchWithNoResults.class);
	        suite.addTestSuite(VerifyProductionList.class);
	        return suite;
	    }

	    public static void main(String[] args) {
	        junit.textui.TestRunner.run(suite());
	    }

}
