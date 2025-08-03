package day5;

public class largestnumber {
	/* a>b and a>c --- a is largest
	b>a and b>c  --- b is largest
	c>a and c>b ---- c is largest
	 */


	public static void main(String[] args) {
		
		int a=100,b=60,c=30;
		if (a>b && a>c) {
			System.out.println("a is largest number"+a);	
		} else if (b>a && b>c) {
			System.out.println("b is largest number"+b);
		} else 
		{
			System.out.println("c is largest number"+c);
		}
	}
}
