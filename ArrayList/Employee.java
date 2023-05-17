package ArrayList;

public class Employee 
{
	int id;
	String name;
	String city;
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getCity()
	{
		return city;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	
	public Employee(int id, String name, String city) 
	{
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}
