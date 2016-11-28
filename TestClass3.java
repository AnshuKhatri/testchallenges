


//import for Scanner and other utility  classes
import java.util.*;


class TestClass3 {
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner s = new Scanner(System.in);
        int num;
        int temp;
        System.out.println("Enter the length of numbers to be entered");
        num=s.nextInt();
       // System.out.println(""num);
        s.nextLine();
        int a[]=new int[num];

System.out.println("Enter the numbers");
        for(int k=0;k<num;k++)
        	{//s.nextLine();
        	a[k]=s.nextInt();
        	//s.nextLine();
        	}

        
        for (int i = 0; i < num-1; i++)
        {
        	for (int j = 0; j < num-i-1; j++)
        	{   
        		int aa=Math.abs(a[j]);
        	     int bb=Math.abs(a[j+1]);
        		
        		if (aa > bb)
                {
                	
                      	
                	
                    // swap temp and arr[i]
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }	
        }	
        	 
        	
        } 	
        System.out.println("Sorted numbers as per the criteria");
        for(int k=0;k<num;k++)
        	 {
        		 System.out.println(a[k]);
        	
        	 }
        	        
    }
}
