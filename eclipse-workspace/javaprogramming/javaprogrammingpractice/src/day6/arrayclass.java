package day6;

public class arrayclass {

	public static void main(String[] args) {
		
		/*int a[] = new int[5];
		// approcach -1
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		*/
		// approach-2
		int a[] = {100,200,300,400,500};
		
		// find length of the array
		System.out.println("Length of an array:"+a.length);
		
		// Read  single value of an array 
		//System.out.println(a[2]);
		
		// reading all the values of arrays
		
		// for normal for loop
		/*for(int i=0 ; i<5; i++)
		{
			System.out.println(a[2]);
		}
		*/
		
		/*for(int i=0 ; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		/*for(int i=0 ; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		// Enhanced for loops / for.. each loop  	
		for (int x:a) {
			System.out.println(a);
		}
		
		
		

	}

}
