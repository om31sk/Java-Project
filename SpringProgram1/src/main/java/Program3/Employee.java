package Program3;

public class Employee
{
   private int id;
   private String name;
   private double sal;
   
   public Employee() 
   {
       // Empty constructor for Spring to use
   }
   
   Employee(int id,String name,double sal)
   {
	   this.id=id;
	   this.name=name;
	   this.sal=sal;
   }
  
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

   public void show() 
   {
       System.out.println("Employee Details: ");
       System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + sal);
   }
}
