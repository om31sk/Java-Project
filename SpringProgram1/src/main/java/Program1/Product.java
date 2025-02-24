package Program1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p")
public class Product
{
   @Value("1")
   private int id;
   @Value("mno")
   private String name;
   @Value("500")
   private int price;

   
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}
   
}
