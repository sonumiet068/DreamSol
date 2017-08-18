package Dreamsol.action;

public class password {
	
	static int upperCase_char(String p)
	{
		int flag=0;
		for(int i=0;i<p.length();i++)
		{
			if(Character.isUpperCase(p.charAt(i)))
			{
				flag=1;
				break;
			}
		}
		return flag;
	}
	static int lowerCase_char(String p)
	{
		int flag=0;
		for(int i=0;i<p.length();i++)
		{
			if(Character.isLowerCase(p.charAt(i)))
			{
				flag=1;break;
			}
		}
		return flag;
	}
	static int special_char(String p)
	{
		int flag=0;
		for(int i=0;i<p.length();i++)
		{
			if(p.charAt(i)=='@'||p.charAt(i)=='`'||p.charAt(i)=='#'||p.charAt(i)=='%'||p.charAt(i)=='$')
			{
			flag=1;break;	
			}
		}
		return flag;
	}
	static int contain_digit(String p)
	{
		int flag=0;
		for(int i=0;i<p.length();i++)
		{
		if(Character.isDigit(p.charAt(i)))
		{
			flag=1;break;
		}
		}
		return flag;
	}
	public static void main(String args[])
	{
		String pass="n@nukjkjlkljk";
		if(pass.length()<8)
		{
			System.out.println("Too short");
		}
		else
			if(upperCase_char(pass)==0)  
			{
				System.out.println("Weak");
			}
			else
				if(lowerCase_char(pass)==0)
				{
					System.out.println("Weak");
				}
				else
				if(special_char(pass)==0)
				{
					System.out.println("Medium");
				}
				else
					if(contain_digit(pass)==1)
					{
						System.out.println("Strong");
					}
	
	}

}
