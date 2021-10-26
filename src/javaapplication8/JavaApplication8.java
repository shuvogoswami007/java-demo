
package javaapplication8;

import java.util.Scanner ;
public class JavaApplication8 {

 
     
    public static void main(String[] args) {
      int p=0,n=0,i;
		Scanner in = new Scanner (System.in);
		int[] a= new int[2];
		
		for(i=1; i<=2; i++)
		{
			a[i] = in.nextInt();
		}
		
		for(i=1; i<=2; i++)
		{
			if(a[i]>0)
			{
				p++;
			}
			else if(a[i]<0)
			{
				n++;
			}
		}
		
		System.out.printf("There are %d pos integers and %d neg integers",p,n);
		

	}
    
}
   
    







    
  
    
