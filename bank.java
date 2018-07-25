import java.util.*;
class account
{
	char acctype;
	int accno;
	double balance;
	account()
	{
		accno=0;
		balance=0;
	}
	void credit(double a)
	{	
		balance=balance+a;
		if(acctype=='c')
		{	balance=balance-5;
			System.out.print(balance);
		}
		else
		{	balance=balance+balance*0.05;
			System.out.print(balance);
		}
	}
	void debit(double a)
	{
		balance=balance-a;
		if(acctype=='c')
		{
			balance=balance-5;
			System.out.print(balance);
		}
		else
		{	balance=balance+balance*0.05;
			System.out.print(balance);
		}
	}
}
public class bank
{	public static void main(String args[])
	{	double amt;char j;
		account ac=new account();
		Scanner s=new Scanner(System.in);
		System.out.print("enter balance");
		ac.balance=s.nextInt();
		
		ac.accno=s.nextInt();
		System.out.print("enter the amount");
		amt=s.nextDouble();
		Scanner u=new Scanner(System.in);
		System.out.print("enter the account type");
		j=u.next().charAt(0);
		if(j=='d')
		{
			ac.debit(amt);	
		}
		else
		{	ac.credit(amt);
		}
	}
}	