/* IMPORTANT: Multiple classes and nested static classes are supported */
 
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
 
 
class TestClass {
	
	/*static boolean isPrime=true;
	static boolean checkPrime(int n)
	{
		int temp;
		
		for(int i=2;i<=n/2;i++)
		{
			temp=n%i;
			if(temp==0)
			{
				isPrime=false;
				break;
				
			}
			
		}
		
		return isPrime;
	}
	*/
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
 
       */
       
        Scanner s = new Scanner(System.in);
        //System.out.println("Enter the number of test cases you want to check");
        int testnumber=s.nextInt();
       
        int x[]=new int[testnumber];
        int k[]=new int[testnumber];
        int m[]=new int[testnumber];
        int result[]=new int[testnumber];
        
        for(int a1=0;a1<testnumber;a1++)
        {
        	
            x[a1]=s.nextInt();
           
            k[a1]=s.nextInt();
         
            m[a1]=s.nextInt();
           
        	
        }
        
       // s.nextLine();
      int ch=0;
      if((1<=ch)&&(ch<=Math.pow(10, 5)))
      {
    
    	  while(ch<testnumber)
       //check if x is prime
       {
      
      // 	boolean res=checkPrime(x[ch]);
        //if(res)
       //{
       	  //compute result
    	  if(((1<=m[ch])&&(m[ch]<=Math.pow(10,7)))&&((1<=k[ch])&&(k[ch]<=Math.pow(10,18)))&&((m[ch]<x[ch])&&(x[ch]<=Math.pow(10,8))))
       	  {
    		  //result[ch]=0;
    		  int num=x[ch];
       	      result[ch]=x[ch];
       	      for(int i=2;i<=k[ch];i++)
       	      {
       	    	result[ch]=(int)Math.pow(result[ch],num);
       	    	
       	      }
            	result[ch]=result[ch]%m[ch];
            	//System.out.println(result[ch]);
       
       //}
        
       /* else
        {
        	System.out.println("x is not prime. Enter prime value for x");
        }
        */
       	  }
        
    	  ch++;
       } 
     
      }
        for(int a=0;a<testnumber;a++)
        {
        	
        	System.out.println(result[a]);
        	
        }
        
        
        int res=Math.abs(-10);
       int k2= Math.negateExact(res);
        System.out.println(k2);
    }
}
