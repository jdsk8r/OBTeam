package publiseringPage;

import junit.framework.Test;

import junit.framework.TestSuite;

public class PubliseringPageTestSuite {
	public static Test suite() {
        TestSuite suite = new TestSuite("OBTeam Project - Publisering Page");
        suite.addTestSuite(VerifyArticleFormPage.class);
        return suite;
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

}
