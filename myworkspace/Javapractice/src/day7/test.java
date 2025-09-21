package day7;

public class test {

	public static void main(String[] args) {
		
		int a[] = {10,20,10,30,40,10,50,10};
		
		int num= 30;
		
		int count=0;
		
		for (int value : a)
		{
			if(value==num)
			{
				count++ ;
			}
		}
		
		System.out.println("number of times repeated :" +count );
    
	}

}
