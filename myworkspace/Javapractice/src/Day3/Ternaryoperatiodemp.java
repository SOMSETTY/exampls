package Day3;

public class Ternaryoperatiodemp {

	public static void main(String[] args) {
	
		// var = exp ? result1 : result2 ;
		
		// exaple 1 
		int a= 400 , b = 200 ;
		
		int res=(a<b)?a:b;
		System.out.println(res);
		
		int res1=(a>b)?a:b;
		System.out.println(res1);
		
		 // exm 2 
		
		int person_age =20;
		
		String res6 = (person_age >= 18 ) ? "ELIGIBLE " : "Not eligible" ;
		
		System.out.println(res6);
		
		// exm 3 
		
		int x=(1==1)?100:200;
		
		System.out.println(x);
		
	}

}
