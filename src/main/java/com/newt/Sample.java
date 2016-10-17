package com.newt;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public List<Integer> convertDecToBin(int num) {
		int decNum=0;
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> li1 = new ArrayList<Integer>();
		while(num!=0){
			decNum=num%2;
			num=num/2;
			li.add(decNum);
		}
		for(int j=li.size()-1;j>=0;j--){
			System.out.print(li.get(j));
			li1.add(li.get(j));
		}
		return li1;
		
	}
	
	public static void main(String[] args) {
		Sample sam = new Sample();
		sam.convertDecToBin(45);
	}

}
