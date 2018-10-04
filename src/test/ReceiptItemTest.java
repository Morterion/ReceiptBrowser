
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ReceiptItemTest extends TestCase {

	public ReceiptItemTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(new ReceiptItemTest("testReceiptItem"));
		suite.addTest(new ReceiptItemTest("testGetReceiptId"));

		return suite;
	}
	
	public void testReceiptItem() {
		fail("Not yet implemented");
	}

	public void testGetReceiptId() {
		fail("Not yet implemented");
	}

	public void testGetName() {
		fail("Not yet implemented");
	}

	public void testSetName() {
		fail("Not yet implemented");
	}

	public void testGetTags() {
		fail("Not yet implemented");
	}

	public void testSetTags() {
		fail("Not yet implemented");
	}

	public void testGetPrice() {
		fail("Not yet implemented");
	}

	public void testSetPrice() {
		fail("Not yet implemented");
	}

}
