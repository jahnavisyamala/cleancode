package clean_code;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmpCmpInttest {

	@Test
	public void test() {
		SmpCmpInt s=new SmpCmpInt();
		assertEquals(1500.00,s.SimpleInterest(10000.00, 3, 5.00),0);
	}
	@Test
	public void testCompoundInterest() {
		SmpCmpInt s=new SmpCmpInt();
		assertEquals(1210.0000000000002,s.CompoundInterest(1000, 2, 10),0);
	}

}
