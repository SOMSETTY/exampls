package day3;

public class Ternaryoperator {

	public static void main(String[] args) {
		
		
		// var = exp ? result1 : result2 ;
		
		// Example 
		
		/*int a=200 , b=100 ;
		
		int x= (a>b)? a:b;
		
		System.out.println(x);
		
       int Y= (a<b)? a:b;
		
		System.out.println(Y); */
		
		// Example - 2
		
//	  int x=(1==1)? 100:200;
//	  System.out.println(x);
//	  
//	  int y=(1==2)? 200:100;
//		System.out.println(y);
		
		// Example - 3
		
	int person_age=30;
	String res =(person_age<18)? "Eligible":"Not-eligible" ;
	System.out.println(res);

	}

}
