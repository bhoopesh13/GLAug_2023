package com.greatlearning.transaction.service;

import java.util.Scanner;

public class TransactionService {

	public void checkTransaction(int[] arr, int targetNo) {

		
		// 20, 12, 31   -> targetNo 2
		Scanner s = new Scanner(System.in);

		while (targetNo-- != 0) {
			
			System.out.println(targetNo);
			//targetNo -> 0
			int flag = 0;

			int target;

			System.out.println("enter the value of target");
			target = s.nextInt();

			int sum = 0;

			//20, 12, 31
			//target = 21
			for (int i = 0; i < arr.length; i++) { //linear iteration , linear searching

				sum += arr[i];  // sum = sum + arr[i] // 0+ 20 = 20 + 12 = 32 + 31 = 63

				if (sum >= target) {

					System.out.println("Target achieved after "+(i + 1) + " transactions ");

					flag = 1;

					break;

				}

			}

			if (flag == 0) {

				System.out.println(" Given target is not achieved ");

			}

		}
		
		s.close();
	}

}
