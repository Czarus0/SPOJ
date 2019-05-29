package com.spoj.pl.easy;

import java.util.Scanner;

public class E978 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] heap = new String[10];
		int head = 0;
		
		while(scanner.hasNext()) {
			String signToHeap = scanner.nextLine();
						
			if(signToHeap.equals("+")) {
				String number = scanner.nextLine();
				
				if(head == 10) {
					System.out.println(":(");
					continue;
				}
					
				heap[head++] = number;
				System.out.println(":)");
			} else {
				if(head == 0) {
					System.out.println(":(");
					continue;
				}
					
				System.out.println(heap[--head]);
			}
		}
		
		scanner.close();
	}
	
	static void serveHeap(String[] array) {
		for(int i = 0; i < array.length / 2; i++) {
			String temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		
		System.out.println(String.join(" ", array));
	}
}
