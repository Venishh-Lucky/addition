public class SecondLargestElement {

	public static void main(String[] args) {
		int[] a= {12,33,45,33,55,88,66};
		int m1=Integer.MIN_VALUE;
		int m2=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(m1<a[i])
			{
				m2=m1;
				m1=a[i];
			}
			else if(m2 <a[i] && a[i]!=m1)
			{
				m2=a[i];
			}
			
			
		}
		System.out.println("The second largest element in an array is: "+m2);

	}

}
