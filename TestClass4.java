/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.*;


class TestClass4 {
	
	//static int f1[],g1[],f2[],g2[],v1[],v2[];
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
      
        
        
        
 
        int m=s.nextInt();
        int n=s.nextInt();
        int m1[]=new int[m];
        int m2[]=new int[n];
        for(int i=0;i<m;i++)
            m1[i]=s.nextInt();
        for(int i=0;i<n;i++)
            m2[i]=s.nextInt();
            
        
        
        int f1[]=new int[m];
        int g1[]=new int[m];
        int f2[]=new int[n];
        int g2[]=new int[n];
        int v1[]=new int[m];
        int v2[]=new int[n];
        
            
            //calculate f1 and g1 for m1
            for(int i=0;i<m;i++)
            {
            	int data=m1[i];
            	int count1=0;
            	int count2=0;
            	for(int j=0;j<n;j++)
            	{
            		if(data>m2[j])
            		{
            			count1++;
            		}
            	    if(data<m2[j])
            	    {
            	    	count2++;
            	    	
            	    }
            	
            	}
            	f1[i]=count1;
            	g1[i]=count2;
            	
            	
            }
        
          
         //calculate f and g for m2
            for(int i=0;i<n;i++)
            {
            	int data=m2[i];
            	int count1=0;
            	int count2=0;
            	for(int j=0;j<m;j++)
            	{
            		if(data>m1[j])
            		{
            			count1++;
            		}
            	    if(data<m1[j])
            	    {
            	    	count2++;
            	    	
            	    }
            	
            	}
            	f2[i]=count1;
            	g2[i]=count2;
                 	
            }
        
        int sum1=0,sum2=0;
       
        //cal v for m1
        for(int i=0;i<m;i++)
           {
           	v1[i]=f1[i]*g1[i];
           sum1+=v1[i];
           	
           }
       
        //cal v for m2
        for(int i=0;i<n;i++)
           {
           	v2[i]=f2[i]*g2[i];   
            sum2+=v2[i];
           	
           }
        
        //check
        if(sum2<sum1)
        System.out.println("Monk "+(sum1-sum2));
        else if(sum1<sum2)
            System.out.println("!Monk "+(sum2-sum1));
        else
        System.out.println("Tie");
        
        
        
        
    }
}
