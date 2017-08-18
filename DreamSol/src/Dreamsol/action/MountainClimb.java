package Dreamsol.action;

public class MountainClimb {
	public static void main(String args[])
	{
		int flag=0;
		int mount=0;
		String s="1_2_5_7_3_9_2";
		String[] v=new String[100];
		int[] a=new int[100];
		v=s.split("_");
		for(int i=0;i<v.length;i++)
		a[i]=Integer.parseInt(v[i]);
		for(int i=0;i<v.length;i++)
		{
			if(flag==0)
			{
				if(a[i]>=a[i+1])
				{
					mount++;
					flag=1;
				}
			}
			if(flag==1)
			{
				if(a[i]<=a[i+1])
					flag=0;
			}
		}
	System.out.println(mount);	
	}
}
