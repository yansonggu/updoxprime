package updoxtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PrimeTest extends TestCase {
 
	Prime pr = new Prime();
	List<Integer> list = new ArrayList<Integer>();
	
	public PrimeTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(PrimeTest.class);
	}

 	
	public void testPrime() {
		assertEquals(pr.isPrime(0),false);
		assertEquals(pr.isPrime(1),false);
		assertEquals(pr.isPrime(2),true);
		assertEquals(pr.isPrime(3),true);
		assertEquals(pr.isPrime(4),false);
		assertEquals(pr.isPrime(5),true);
		assertEquals(pr.isPrime(6),false);
		assertEquals(pr.isPrime(7900),false);
		assertEquals(pr.isPrime(7901),true); 
	}
	
	
	
	public void testPrimeList() {
		 
		assertEquals(list, pr.generate(0, 0));
		
		assertEquals(list, pr.generate(0, 1));
		 
		assertEquals(list, pr.generate(1, 1));
		
		list = Arrays.asList(2);
		assertEquals(list, pr.generate(2, 2));

		list = Arrays.asList(2);
		assertEquals(list, pr.generate(1, 2));
		
		list = Arrays.asList(2, 3);
		assertEquals(list, pr.generate(2, 3));

		list = Arrays.asList(2, 3);
		assertEquals(list, pr.generate(1, 3));

		list = Arrays.asList( 2, 3);
		assertEquals(list, pr.generate(1, 4));

		list = Arrays.asList(2, 3, 5);
		assertEquals(list, pr.generate(1, 5));

		list = Arrays.asList(7901, 7907, 7919);
		assertEquals(list, pr.generate(7900, 7920));
		
	}
	
	public void testPrimeRangeOder() {
		 
		list = Arrays.asList(2,3,5,7);
		assertEquals(list, pr.generate(1, 10));
		
		list = Arrays.asList(2,3,5,7);
		assertEquals(list, pr.generate(10, 1));
		
	}

}
