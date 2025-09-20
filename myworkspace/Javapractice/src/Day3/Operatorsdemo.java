package Day3;

public class Operatorsdemo {

	public static void main(String[] args) 
	{
      // Arithmetic operator +  -  /  *  %
		int a =20 ;
		int b = 10 ;
		
		System.out.println("Sum of a & b is:" +(a+b));
     	System.out.println("diff of a & b is:" +(a-b));
	    System.out.println("div of a & b is:" +(a/b));
	    System.out.println("mul of a & b is:" +(a*b));
		System.out.println("modular div  of a & b is:" +(a%b));
		
		// Relational operators > >= < <=  !=  ==
		// return  boolean  value - true or false 
		
		System.out.println(a>b);  // true
		System.out.println(a>=b);  // true
		System.out.println(a<b);  // false
		System.out.println(a<=b); // false 
		System.out.println(a==b); //false
		System.out.println(a!=b);  // true
		
		// logical  &&  ||  !
		// returns  boolean  value true/false 
		// works between 2 boolean  values
		
		boolean  x = true ;
		boolean  y = false ;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1 = 10>20;
		System.out.println(b1);  // false 
		
		boolean b2 = 20 > 10;
		System.out.println(b2);  // true 
		
		System.out.println(b1 && b2); // false 
		System.out.println(b1 || b2);  // true 
		
		System.out.println((10<20) && (20>10)); // true
		System.out.println((10<20) || (20>10));  // false 
		
		
		
		
		
		 

		
	}

}
