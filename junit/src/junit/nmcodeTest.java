package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class nmcodeTest {
	static nmcode d;
	int num1,num2,expected,result;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		d=new nmcode(3,3);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		d=null;
		
	}

	@Before
	public void setUp() throws Exception {
		assertTrue(d.validate());
	}

	@After
	public void tearDown() throws Exception {
		//d.reset;
	}

	@Test
	public void test() {
		result = d.add();
		expected = 6;
		assertEquals(result,expected);
	}
	@Test
	public void testsub() {
		result = d.sub();
		expected = 0;
		assertEquals(result,expected);
	}

	@Test
	public void testm() {
		result = d.mul();
		
		assertEquals(result,9);
	}

	@Test
	public void testdiv() {
		result = d.div();
		expected = 1;
		assertEquals(result,expected);
	}



}
