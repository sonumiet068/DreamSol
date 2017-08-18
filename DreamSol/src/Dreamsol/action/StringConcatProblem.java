package Dreamsol.action;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

public class StringConcatProblem {
    public static void main(String args[] )  {
        String str="Tom_Dick_Harry_Joe_Dick_Chris";
        int[] flag=new int[100];
       String[] s=str.split("_");
       StringBuffer sf=new StringBuffer();
       String result="";
      int n=s.length;
      for(int i=0;i<n;i++)
    	  flag[i]=0;
      int j=0;
      for(int i=0;i<n;i++)
      {
    	  j=i+1;
    	  while(j<n)
    	  {
    		  if(s[i].equals(s[j]))
    			  flag[j]=1;
    	  j++;
    	  }
      }
      for(int i=0;i<n;i++)
      {
    	  if(flag[i]==0)
    	  {
    		  sf.append(s[i]);
    		  if(i<n-1)
    		  sf.append("_");
    	 }  
     }
     result=sf.toString();
System.out.println(result);
    }
}
