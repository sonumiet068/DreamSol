package Dreamsol.action;

public class snailClimb {
public static void main(String arg[])
{
	int input1=4;
	int input2=11;
	String input3="cAda";
	String input4="AbrAcadAbRa";
	 int count=0;
     int lcount=0;
     for(int i=0;i<input2;i++)
     {
         int j=0;
         
         while(j<input1 && !(Character.toString(input4.charAt(i)).equals(Character.toString(input3.charAt(j)))))
         {
             j++;
         }
         if(j<input1)
         {
             lcount++;
         }
         else
         {
         lcount=0;
         }
         if(lcount==input1)
         {
             count++;
              i=i-4;
              lcount=0;
         }
     }

  System.out.println("hiii"+count);
	
}
}
