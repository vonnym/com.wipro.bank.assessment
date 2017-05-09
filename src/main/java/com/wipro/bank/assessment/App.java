package com.wipro.bank.assessment;

import java.util.ArrayList;
import java.util.List;

import com.wipro.bank.entity.Account;

public class App 
{
	public static final List<Account> accounts=new ArrayList<Account>();
	
	public Account getAccountDetailsByID(int id)
	{

		Account account = null;
		if(accounts != null)
		{
			for(Account a:accounts)
			{
				if(a.getAccountID() == id)
				{	
						account = a;
						break;
				}
			}
			
		
		}
	
		return account;
			
	}
	
	public List<Account> getAccountDetailsByBalance(double amount)
	{

		
		List<Account> account = new ArrayList<Account>();
		boolean flag= true;
		if(accounts != null)
		{
			for(Account a:accounts)
			{
				if(a.getBalance() >= amount)
				{	
						account.add(a);
						flag = false;
				}				
			}		
		}
		
		if(flag)
		{
			account = null;
		}

		return account;
	}
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
