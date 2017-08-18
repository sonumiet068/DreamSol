package Dreamsol.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import Dreamsol.Form.InsertionForm;
import Dreamsol.Services.*;
import Dreamsol.entities.Employee;
public class CurdOperationAction extends ActionSupport implements ModelDriven<InsertionForm> {
 private InsertionForm form=new InsertionForm();
 public String home()
 {
	 return "success";
 }
public String insert()
{
	char[] c={};
	String s1="hiii";

	 c=s1.toCharArray();
/*	for(int i=1;i<l;i++)
	{
		if(i==4)
		{
			
		}
	}
*/	
	return "success";
}
public String update()
{
	System.out.println(getModel().getMobile());
	System.out.println(getModel().getPass());
	System.out.println("updateee orderss");
	return "success";
}
public String delete()
{
	System.out.println(getModel().getMobile());
	System.out.println(getModel().getPass());
	System.out.println("Delete orderss");
	return "success";	
}
public String shows()
{
	System.out.println(getModel().getMobile());
	System.out.println(getModel().getPass());
	System.out.println("shows orderss");
	CurdOperationService service=new CurdOperationService();
    List<Employee> e=service.retirve();
    
    getModel().setE1(e);
    
	return "success";	
}

	
	
	
	
	@Override
	public InsertionForm getModel() {
		// TODO Auto-generated method stub
		return form;
	}

	
	
}
