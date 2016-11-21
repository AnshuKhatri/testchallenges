/* IMPORTANT: Multiple classes and nested static classes are supported */


//import for Scanner and other utility classes
import java.util.*;


class testclass2 {
	
	static void commonnumber(int n1,int n2)
	{
		int n=0;
		int large;
		//find larger number
		if(n1<n2)
		large=n2;
		else
		large=n1;
		for(int k=1;k<=large;k++)
		{
			if((n1%k==0) &&(n2%k==0))
			n++;
		}
		System.out.println(n);
		
	}
    public static void main(String args[] ) throws Exception {
      
        //Scanner
        Scanner s = new Scanner(System.in);
       
       int a,b;
       a=s.nextInt();
       b=s.nextInt();
       
       commonnumber(a,b);
       
    }
}
