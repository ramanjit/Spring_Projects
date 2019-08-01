package E_service.E_serviceProject;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;

import E_service.E_service.Registeration.UserRegisteration;
public class App 
{
    public static void main( String[] args )
    {
    
    		//Configuration cfg = new Configuration();
    		//cfg.configure("hibernate.cfg.xml");
    		//SessionFactory sf = cfg.buildSessionFactory();
    		SessionFactory sf = HibernateUtil.getSessionFactory();
    		insertEmployeeRecords(sf);
    }
    		private static void insertEmployeeRecords(SessionFactory sf)
    		{
    			try(Session session = sf.openSession() ) {
    			
    			String HQL = "INSERT INTO UserRegisteration(FirstName, LastName, dob, username, upassword, ZipCode)" + 
    		"SELECT FirstName, LastName, dob, username, upassword, ZipCode from BackUpUser";
    			
    			Query query = session.createQuery(HQL);
    			session.beginTransaction();
    			int executeUpdate = query.executeUpdate();
    			if(executeUpdate>0)
    				System.out.println(executeUpdate+" records are inserted successfully..");
    			session.getTransaction().commit();
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
        
    }
}
