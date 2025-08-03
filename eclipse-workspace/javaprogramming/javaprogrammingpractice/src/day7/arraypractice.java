package day7;

public class arraypractice {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int Search_element=30;
		
		boolean status = false ; // false -not found , true -found
		/*for (int i=0; i<a.length;i++)
		{
			if(a[i]==Search_element)
			{
				System.out.println("Element  found");
				status=	true ;
				break;
			}
			
			}
			*/	
		for(int x:a)
		{
			if(x==Search_element){
				
				System.out.println("Element found");
			}
		}
		
		
		
		if(status==false)
		System.out.println("Element not found");
	}

}
