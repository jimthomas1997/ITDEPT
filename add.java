import java.util.*;
class sum
{	int a;
	int b;
	sum()
	{	a=0;
		b=0;
	}
}
class add
{
	public static void main(String args[])
	{sum ad=new sum();
	int s=0;
	Scanner u=new Scanner(System.in);
	ad.a=u.nextInt();
	ad.b=u.nextInt();
	s=ad.a+ad.b;
	System.out.println(s);}
} 

	