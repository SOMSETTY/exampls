package day7;
public class evenoroddnum {

	public static void main(String[] args) {
		
		int a[] = {2,5,6,7,9,12,18,19};
		
		int even = 0;
		
		int odd = 0;
		
		for (int value : a)
		{
			if(value%2==0)
			{
				even++;
			}
			else {
				odd++ ;
			}
		}
    System.out.println("Numer of even numbers:"+even);
    
    System.out.println("Numer of odd numbers:"+odd);
	
	
    
	}

}
