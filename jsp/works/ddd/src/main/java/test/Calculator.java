package test;

import java.util.Arrays;

public class Calculator {
	public int expCalc(int su, int exp) {
		int res = (int) Math.pow(su, exp);
		return res;
	}
	
	public int[] sortCalc(String[] su) {
		int[] temp = new int[6];
		for (int i=0; i<su.length; i++) {
			temp[i] = (Integer.parseInt(su[i]));
		}
		
		Arrays.sort(temp);
		
		return temp;
	}
}
