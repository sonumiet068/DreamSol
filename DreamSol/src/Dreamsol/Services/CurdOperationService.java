package Dreamsol.Services;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.objectweb.asm.attrs.Annotation;

import Dreamsol.entities.Employee;

public class CurdOperationService {

	public String saveData(String mob,Date bod,String pass,String user)
	{
SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();	
 Session session=factory.openSession();	
Transaction tx=session.beginTransaction();
   tx.begin();
Employee e=new Employee();
   e.setBod(bod);
   e.setMobile(mob);
 e.setPass(pass);
e.setUserName(user);
session.persist(e);
tx.commit();
session.close();
return "Success";
	}
	public List<Employee> retirve()
	{
	SessionFactory factory=	new AnnotationConfiguration().configure().buildSessionFactory();
	Session se=factory.openSession();
	Transaction tx=se.beginTransaction();
	  tx.begin();
	Criteria cr=se.createCriteria(Employee.class);
   //cr.add(Restrictions.or(Restrictions.eq("userName", "sonu"),Restrictions.eq("mobile","8354997958")));
   // cr.addOrder(Order.asc("mobile"));	
    // cr.add(Projections.projectionList().add(Projections.rowCount()));
	//cr.setProjection(Projections.distinct(Projections.property("mobile")));
//double s=(Double)cr.uniqueResult();

  List<Employee> employee=cr.list();
	
	
	
	return employee;
	}
	
}
