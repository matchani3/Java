public class MySelf
{
	private int age;
	private String name;
	private int num_classes;
	private String color;

	public MySelf()
	{
		age = 21;
		name = "Sangeetha";
		num_classes = 4;
		color = "Brown";
	}

	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}

	public int getNum_classes()
	{
		return num_classes;
	}

	public String getColor()
	{
		return color;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public void getName(String s)
	{
		name = s;
	}

	public void setNum_classes(int n)
	{
		num_classes = n;
	}

	public void setColor(String e)
	{
		color = e;
	}

	public void toPrint()
	{
		System.out.println("Name is: "+ name);
		System.out.println("Age is: "+ age);
		System.out.println("Number of class taking is: "+ num_classes);
		System.out.println("Color is: "+ color);

	}

	public static void main(String args[])
	{
			MySelf m = new MySelf();

			m.toPrint();

	}

}



   	
	


