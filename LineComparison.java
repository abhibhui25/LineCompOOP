import java.util.Scanner;
public class LineComparison {
	double Length()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int res1=(a-c)*(a-c);
		int res2=(b-d)*(b-d);
		double res=Math.sqrt(res1+res2);
		return res;
	}
	void compare()
	{	System.out.println("Enter the coordinates of first line");
		String p=String.valueOf(Length());
		System.out.println("Enter the coordinates of second line");
		String q=String.valueOf(Length());
		if(p.compareTo(q)==0)
		{
			System.out.println("THE TWO LINES ARE EQUAL");
		}
		else if(p.compareTo(q)<0)
		{
			System.out.println("THE FIRST LINE IS SMALLER IN LENGTH COMPARED TO THE SECOND LINE");
		}
		else if(p.compareTo(q)>0)
		{
			System.out.println("THE FIRST LINE IS LARGER IN LENGTH COMPARED TO THE SECOND LINE");
		}
	}
	void equal()
	{	System.out.println("Enter the coordinates of first line");
		String p=String.valueOf(Length());
		System.out.println("Enter the coordinates of second line");
		String q=String.valueOf(Length());
		if(p.equals(q))
		{
			System.out.println("THE TWO LINES ARE EQUAL");
		}
		else
		{
			System.out.println("THE TWO LINES ARE NOT EQUAL");
		}
	}
	
	public static void main (String a0rgs[])
	{
		LineComparison l=new LineComparison();
		Scanner sc=new Scanner(System.in);
		l.compare();	
		l.equal();
	}
}