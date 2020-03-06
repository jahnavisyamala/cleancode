package clean_code;

import static org.junit.Assert.*;

import org.junit.Test;

public class Hconsttest {

	@Test
	public void test() {
		Hconst h=new Hconst();
		assertEquals(11250.00 ,h.cost("high", "yes", 4.5),0);
	}

}
