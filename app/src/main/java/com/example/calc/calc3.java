package com.example.calc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class calc3 extends calc2{

	protected static int eingabe(String s) {
		if(s.contains(" ")) {
			s = s.replace(" ", "");
		}
		ArrayList<String> numbers = new ArrayList<>(Arrays.asList(s.split("[/*+-]")));
		ArrayList<String> operanten= new ArrayList<>(Arrays.asList(s.split("[0123456789.]")));
		
		while(operanten.contains("")) {
			operanten.remove("");
		}
		int ergebnis = ausrechnen(numbers, operanten);
		return ergebnis;
	}
	
	protected static int ausrechnen(ArrayList<String> numbers, ArrayList<String> operanten) {
		int ergebnis = Integer.parseInt(numbers.get(0));
		for(int i = 1; i < numbers.size(); i++) {
			if(operanten.get(i - 1).equals("+")) {
				ergebnis = add(ergebnis, Integer.parseInt(numbers.get(i)));
			}
			else if(operanten.get(i - 1).equals("-")) {
				ergebnis = sub(ergebnis, Integer.parseInt(numbers.get(i)));
			}
			else if(operanten.get(i - 1).equals("*")) {
				ergebnis = mul(ergebnis, Integer.parseInt(numbers.get(i)));
			}
			else if(operanten.get(i - 1).equals("/")) {
				ergebnis = div(ergebnis, Integer.parseInt(numbers.get(i)));
			}
	
		}
		return ergebnis;
	
	}

}
