package updoxtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GetNumbers {
 

	public static void main(String[] args) throws IOException {
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Please enter a range of number like 1-100 or 100-1");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int firstNumber = Integer.valueOf(s.split("-")[0].trim());
		int secondNumber = Integer.valueOf(s.split("-")[1].trim()); 
		Prime pr=new Prime();
		list=pr.generate(firstNumber, secondNumber);
		if( list.isEmpty()) {
			System.out.println("There are no prime numbers in the range specified!");
		}else{
			System.out.println("Prime numbers are: "+list);
		}
	}
}
