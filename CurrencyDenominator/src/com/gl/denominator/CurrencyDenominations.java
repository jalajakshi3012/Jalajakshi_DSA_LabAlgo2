package com.gl.denominator;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDenominations {
	
	
	Integer[] currencyList;
	int currencyListSize;
	int amount;
	
	Scanner input=new Scanner(System.in);
	
	//Collect the input from the User
	void CollectCurrencyList()
	{
		System.out.println("enter the size of currency denominations");
		currencyListSize=input.nextInt();
		currencyList=new Integer[currencyListSize];
		System.out.println("enter the currency denominations value");
		for(int i=0;i<currencyListSize;i++)
		{
			currencyList[i]=input.nextInt();
		}
		
	}
	
	
	//Collect the Amount
	void CollectAmount() {
		System.out.println("enter the amount you want to pay");
		amount=input.nextInt();
		
	}
	
	
	void CalculateDenominations()
	{
		//Sorting the currency list for getting the highest denominations
		Arrays.sort(currencyList);
		int blncAmount=amount;
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i=currencyListSize-1;i>=0;i--)
		{
			
			int exactDenomination=blncAmount%currencyList[i];
			int noOfDenomination=blncAmount/currencyList[i];
					if(noOfDenomination!=0) {		
					System.out.println(currencyList[i]+":"+noOfDenomination);	
				blncAmount=exactDenomination;
					}
		}
		
		if(blncAmount!=0)
		{
			System.out.println("Unable to provide exact denominations");
			System.out.printf("Balance Amount %d", blncAmount);
		}
		else
		{
			System.out.println("Able to find exact denominatins");
		}
	}
	

}
