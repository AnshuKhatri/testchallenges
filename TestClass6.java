import java.util.Scanner;
import java.lang.*;
class TestClass6 {
	static int a[][];
	
	static int distance(int a,int b)
	{
		
		int res=a-b;
		if(res<0)
			res=res*(-1);
		else
			res=res;
		return res;
		
		
		//return Math.abs(res);
		
	}
	
	static int max(int a,int b)
	{
		
		if(a>b)
			return a;
		else
			return b;
		
		
	}
	
	
    public static void main(String args[] ) throws Exception {
     
    	
    	
    	a=new int[10][2];
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for(int i=0;i<N;i++)
        {
        	
        	a[i][0]=s.nextInt(); //attraction value
        	a[i][1]=s.nextInt();  //position
        	
        }
        
       //calculation
        
        
        
        int result=0;
        for(int i=0;i<N-1;i++)
        {
        	for(int j=i+1;j<N;j++)
        	{
        		
        		int output=distance(a[i][1],a[j][1])*max(a[i][0],a[j][0]);
        		result+=output;
        		
        		
        	}
        	
        }
        
        
        System.out.println(result);
        
        
        
       
    }
}
