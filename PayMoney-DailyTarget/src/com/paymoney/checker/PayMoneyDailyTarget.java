package com.paymoney.checker;

import java.util.Scanner;

public class PayMoneyDailyTarget {

	Integer[] transactionList;
	int transactionCount;
	int dailyTarget;
	Scanner sc = new Scanner(System.in);

	void CollectTransacrtionValues() {
		System.out.println("Enter the size of transaction array");
		transactionCount = sc.nextInt();
		transactionList = new Integer[transactionCount];
		System.out.println("Enter the values of array");
		for (int i = 0; i < transactionCount; i++) {
			System.out.printf("Transaction value %d/%d  ", (i + 1), transactionCount);
			System.out.println();
			transactionList[i] = sc.nextInt();
		}

	}

	void CollectDailyTarget() {

		System.out.println("Enter the total number of targets that need t be achieved");

		dailyTarget = sc.nextInt();

	}

	void TargetChecker() {
		int transactionSum = 0;
		boolean targetCheck = false;
		for (int i = 0; i < transactionList.length; i++) {
			transactionSum = transactionSum + transactionList[i];

			if (transactionSum >= dailyTarget) {
				System.out.println("Target achieved after" + (i + 1) + " transactions");
				targetCheck = true;
				break;
			}
		}

		if (targetCheck == false) {
			System.out.println("Given target is not achieved");
		}

	}

}
