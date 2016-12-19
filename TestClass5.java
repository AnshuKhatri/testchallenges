import java.util.Scanner;

class TestClass5 {
	
	static String name="milly";
	
	static void check(String str)
	{
		int k=0;
		Boolean flag=false;
		int i=0;
		int j=0;
		while(i<str.length() && j<name.length())
		{
			if(str.charAt(i)!=(name.charAt(j)))
			{i++;}
			else
			{i++;j++;k++;}
			
			
		}
		if(k==5)
			System.out.println("Milly is Intelligent");
		else
			System.out.println("Milly is not Intelligent");
		
		
		
		
	}
	
	
	
    public static void main(String args[] ) throws Exception {
      
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        String str[]=new String[100];
       for(int i=0;i<N;i++)
       { 
    	   //String query=s.next();
    	   //str[i]=new String(query);
    	   str[i]=s.next();
    	     
       }
       
    //calling check method
       
       
       for(int j=0;j<N;j++)
        check(str[j]);
        
        
        
    }
}
