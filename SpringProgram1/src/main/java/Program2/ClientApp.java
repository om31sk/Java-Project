package Program2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.out.xml");
       Courier c=(Courier)context.getBean("c");
	    Parcel p1=c.getPar();
	    System.out.println(p1.getId()+"\t"+p1.getName()+"\t"+p1.getSourceAddress()+"\t"+p1.getDestAddress());

	}

}
