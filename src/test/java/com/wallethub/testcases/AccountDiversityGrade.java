package com.wallethub.testcases;

import java.util.Scanner;

/**
 * 
 * @author Amarnath 
 *
 *This class is only for practice purpose, please ignore this.
 *i have written this test to, just check your account diversity logic.
 * 
 */

public class AccountDiversityGrade {

	static int totalAccounts;
	static int totalCount;
	public static void main(String arg[])
	{
		Scanner in= new Scanner(System.in);	
		System.out.println("Enter a user total Home Loan:");
		int HomeLoan =in.nextInt();

		System.out.println("Enter a user total Heloc:");
		int Heloc=in.nextInt();

		System.out.println("Enter a user total CarLoan:");
		int CarLoan=in.nextInt();

		System.out.println("Enter a user total Credit Card:");
		int CreditCard=in.nextInt();

		System.out.println("Enter a user total Collection:");
		int Collection=in.nextInt();

		System.out.println("Enter a user total Unknown:");
		int Unknown=in.nextInt();
		accountManipulation(HomeLoan, Heloc, CarLoan, CreditCard, Collection, Unknown);
		accountDiversityGrade();
		
		in.close();
	}

	public static void accountManipulation(int HomeLoan, int Heloc, int CarLoan,int CreditCard, 
			int Collection, int Unknown)
	{
		totalAccounts=HomeLoan+Heloc+CarLoan+CreditCard;

		System.out.println("totalAccounts :"+totalAccounts);

		if(totalAccounts>0)
		{
			if(HomeLoan>0)
			{
				HomeLoan=1;	
				totalCount+=HomeLoan;

			}else{
				HomeLoan=0;
			}

			if(Heloc>0)
			{
				Heloc=1;
				totalCount+=Heloc;
			}else{
				Heloc=0;
			}

			if(CarLoan>0)
			{
				CarLoan=1;
				totalCount+=CarLoan;
			}else{
				CarLoan=0;
			}

			if(CreditCard>0)
			{
				CreditCard=1;
				totalCount+=CreditCard;
			}else{
				CreditCard=0;
			}
			System.out.println("loanTypeCount :"+totalCount);
		}
	}

	public static void accountDiversityGrade()
	{
		if(totalAccounts>20||totalCount>=4)
		{
			System.out.println("Grade : A");
		}
		else if (totalAccounts>10||totalCount==3)
		{
			System.out.println("Grade : B");
		}
		else if(totalAccounts>=5||totalCount==2)
		{
			System.out.println("Grade : C");
		}
		else if (totalAccounts>0||totalCount==1)
		{
			System.out.println("Grade : D");
		}
		else
		{
			System.out.println("No loan accounts are present! ");
		}
	}
}