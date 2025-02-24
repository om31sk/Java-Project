package Program1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import Program1.Product;
import Program1.Config;

@Component(value = "Program1")
public class ProductApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		 Product p=(Product)context.getBean("p");
	       System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getPrice());
	}

}
