package updoxtest;

import java.util.ArrayList; 
import java.util.List;

public class Prime implements PrimeNumberGenerator {
	List<Integer> list = new ArrayList<Integer>();

	public List<Integer> generate(int startingValue, int endingValue) {
		
		list.clear();
		int temp;
		if (startingValue > endingValue) {
			temp=startingValue;
			startingValue=endingValue;
			endingValue=temp;
		}
		for (int i = startingValue; i <= endingValue; i++) {
			if (isPrime(i)) list.add(i);
		} ; 
		
		return list; 
	}

	public boolean isPrime(int value) {
		
		if (value == 0 || value == 1){
			return false;
		}
		
		double limit = Math.sqrt(value);
		
		for (int i = 2; i <= limit; i++) {
			int remainder = value % i;
			if (remainder == 0) {
				return false;
			}
		}
		
		return true;
	}

}
