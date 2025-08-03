package day7;

import java.util.Arrays;

public class sortinganelement {

	public static void main(String[] args) {
		int a[]= {100,600,200,400,500};
		System.out.println("Beforing sorting.....");
		
		System.out.println(Arrays.toString(a)); // [100,600,200,400,500]
		Arrays.sort(a);  // sort element in array
		
		System.out.println("Aeforing sorting.....");
		System.out.println(Arrays.toString(a));
		
		
		
		/*for(int value:a)
		{
			System.out.println(value);
		}
		*/
	}

}
