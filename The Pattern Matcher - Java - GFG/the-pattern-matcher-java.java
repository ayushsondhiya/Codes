//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
	     //Taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking count of total testcases
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   
    	   //taking the String
    	   String s=sc.next();
    	   
    	   Geeks obj=new Geeks();
    	   
    	   //calling follPatt() method
    	   //of class Geeks and passing
    	   //String as parameter
    	   obj.follPatt(s);
    	   
    	 }
    }
}


// } Driver Code Ends
//User function Template for Java




class Geeks{
    
    static void follPatt(String s)
    {
        
        //Your code here
      int count = 0;
      char last = s.charAt(0);
      for (int i = 0; i < s.length(); i++) {
          char curr = s.charAt(i);
          
          if (last == 'y' && curr == 'x') {
              if (count != 0) {
                break;
              }
          }
          if (curr == 'x')
              count++;
          if (curr == 'y')
              count--;
          
          last = curr;
      }
      if (count != 0)
          System.out.println("0");
      else
          System.out.println("1");
          //sanju

    }
}

//{ Driver Code Starts.

// } Driver Code Ends