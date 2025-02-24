package Program3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*Resource r = new ClassPathResource("ebean.xml");
		BeanFactory bf= new XmlBeanFactory(r);

   
      Employee e=(Employee)bf.getBean("e");*/
		ApplicationContext context = new ClassPathXmlApplicationContext("ebean.xml");

        // Get the bean from the Spring container
        Employee e = (Employee) context.getBean("e");
      e.show();
	}

}







































