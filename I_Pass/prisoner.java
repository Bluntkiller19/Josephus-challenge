public class prisoner implements Comparable<prisoner>
{
	private int id;
	private String firstname;
	private String lastname;
	

	public prisoner()
	{
		this(0, "", "");
	}
	public prisoner(int id, String firstname, String lastname)
	{
		setId(id);
		setFirstName(firstname);
		setLastName(lastname);
	}
	
	//set methods
	public void setId(int id)
	{
		this.id = id;
	}
	public void setFirstName(String firstname)
	{
		this.firstname = firstname;
	}
	public void setLastName(String lastname)
	{
		this.lastname = lastname;
	}
	
	//get methods
	public int getId()
	{
		return id;
	}
	public String getFirstName()
	{
		return firstname;
	}
	public String getLastName()
	{
		return lastname;
	}
    
	public int compareTo(prisoner g) 
	{
		String thisField = getFirstName();
		String otherField = g.getFirstName();
		return thisField.compareTo(otherField);
	}
	@Override
	//toString method;
	public String toString()
	{
		return getId() + ". " + getFirstName() + " " + getLastName();
	}
	
	public static void main(String[] args)
	{
		prisoner s1 = new prisoner(1,"Janne","man");
		System.out.println(s1);
	}
}
