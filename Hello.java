import java.io.*;
import java.util.*;
public class Hello {
	public static void main(String args[])
	{
		int a[]= {10,8,6,4,2,1,3,5,7,9};
		Arrays.sort(a);
		for(int i=0;i<10;i++) System.out.print(a[i]+" ");
		
		
		//Here Integer is a Wrapper Class
		Integer a1[]={10,8,6,4,2,1,3,5,7,9};
		Arrays.sort(a1,Collections.reverseOrder());
		System.out.println("\n");
		for(int i=0;i<10;i++) System.out.print(a1[i]+" ");
		
		//Both the above methods can be applied with strings
	}
}
/*
 * 
  Arrays.sort(s,Collections.reverseOrder(new Comparator<String>()
    {
        @Override
        public int compare(String s1,String s2)
        {
            BigDecimal b1=new BigDecimal(s1);
            BigDecimal b2=new BigDecimal(s2);
            return b1.compareTo(b2);
        }
    }));
 */
 */