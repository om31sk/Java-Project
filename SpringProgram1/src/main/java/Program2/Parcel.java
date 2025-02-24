package Program2;

public class Parcel 
{
   private int id;
   private String name;
   private String SourceAddress;
   private String DestAddress;

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

	public String getSourceAddress() 
	{
		return SourceAddress;
	}

	public void setSourceAddress(String sourceAddress)
	{
		SourceAddress = sourceAddress;
	}

	public String getDestAddress()
	{
		return DestAddress;
	}

	public void setDestAddress(String destAddress) 
	{
		DestAddress = destAddress;
	}
   
}
