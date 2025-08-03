package day6;

public class multiplydimensionalarray {

	public static void main(String[] args) {
		
		// declaring an array 
		// approach - 1
		/*int a[][] = new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		
		// Approach 2
		int a[][] = {
				{100,200},
				{300,400},
				{500,600}
		};
		{
//			System.out.println("length of rows:"+a.length);
//			System.out.println("number of column:"+a[0].length);
			
			//read single value for an array
//			System.out.println(a[2][1]);
//			System.out.println(a[0][1]);

			//normal
//			for (int r=0; r<= 2;r++)
//			{
//				
//				for (int c=0; c<=1 ;c++)
//				{
//					//System.out.println(a.length);
//					System.out.print(a[r][c]+ " ");
//				}
//				System.out.println();
//			}
//			for (int r=0; r<= a.length-1;r++)
//			{
//				
//				for (int c=0; c<=a[r].length-1 ;c++)
//				{
//					//System.out.println(a.length);
//					System.out.print(a[r][c]+ " ");
//				}
//				System.out.println();
//			}
			
				for (int arr []:a)
			{
				for (int x: arr)
				{System.out.println(x);}
			}
			
			
			

		}

	}

}
