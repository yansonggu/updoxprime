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
		assertEquals("test 0 is not a prime number is corretly handled", pr.isPrime(0),false);
		assertEquals("test 1 is not a prime number is corretly handled", pr.isPrime(1),false);
		assertEquals("test 2 is  a prime number is corretly handled", pr.isPrime(2),true);
		assertEquals("test 3 is  a prime number is corretly handled", pr.isPrime(3),true);
		assertEquals("test 4 is not a prime number is corretly handled", pr.isPrime(4),false);
		assertEquals("test 5 is a prime number is corretly handled", pr.isPrime(5),true);
		assertEquals("test 6 is not a prime number is corretly handled", pr.isPrime(6),false);
		assertEquals("test big even number is not a prime number is corretly handled", pr.isPrime(7900),false);
		assertEquals("test big prime number is corretly handled", pr.isPrime(7901),true); 
	}
	
	
	
	public void testPrimeList() {
		 
		assertEquals("test no list of primes is indeed the case with 0", list, pr.generate(0, 0));
		
		assertEquals("test no list of primes is indeed the case with 0 and 1", list, pr.generate(0, 1));
		 
		assertEquals("test no list of primes is indeed the case with 1", list, pr.generate(1, 1));
		
		list = Arrays.asList(2);
		assertEquals("test a prime number can be returned as list", list, pr.generate(2, 2));

		list = Arrays.asList(2);
		assertEquals("test a prime number can be returned as list when 1 and 2 are input",list, pr.generate(1, 2));
		
		list = Arrays.asList(2, 3);
		assertEquals("test two prime numbers can be returned as list with two primes",list, pr.generate(2, 3));

		list = Arrays.asList(2, 3);
		assertEquals("test two prime numbers are returned with a range from 1 to a prime 3", list, pr.generate(1, 3));

		list = Arrays.asList( 2, 3);
		assertEquals("test two prime numbers are returned with a range from 1 to a non-prime number 4", list, pr.generate(1, 4));

		list = Arrays.asList(2, 3, 5);
		assertEquals("test 3 prime numbers are returned withno even number 4", list, pr.generate(1, 5));

		list = Arrays.asList(7901, 7907, 7919);
		assertEquals("test the asked range return the desired result", list, pr.generate(7900, 7920));
		
	}
	
	public void testPrimeRangeOder() {
		 
		list = Arrays.asList(2,3,5,7);
		assertEquals("test a ascending range", list, pr.generate(1, 10));
		
		list = Arrays.asList(2,3,5,7);
		assertEquals("test a descending range",list, pr.generate(10, 1));
		
	}

}
