package com.example.calc;

public class calc2 extends calc1 {
	
	protected static int add2(double... i) {
		int sum = 0;
		for(int j = 0; j < i.length; j++) {
			sum += i[j];
		}
		return sum;
	}
	
	protected static int quer(int i) {
		int quersumme = 0;
		String q = Integer.toString(i);
		for(int j = 0 ; j < q.length(); j++) {
			System.out.println(q.substring(0,1));
			quersumme += Integer.parseInt(q.substring(0, 1));
			q = q.substring(1);
		}
		return quersumme;
	}


}
