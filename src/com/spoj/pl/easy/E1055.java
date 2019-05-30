package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class E1055 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= numberOfTests; i++) {
			String[] passedData = reader.readLine().split(" ");
						
			List<Integer> evens = new LinkedList<Integer>();
			List<Integer> odds = new LinkedList<Integer>();
			
			for(int j = 1; j < passedData.length; j++) {
				Integer number = Integer.valueOf(passedData[j]);
				
				if(j % 2 == 0) {
					evens.add(number);
				} else {
					odds.add(number);
				}
			}
			
			evens.addAll(odds);
			
			int[] result = evens.stream().mapToInt(Integer::intValue).toArray();
			String sortedString = Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" "));
			
			System.out.println(sortedString);
		}
	}
}
