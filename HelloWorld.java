/*
	javac HelloWorld.java
	java HelloWorld */

public class HelloWorld
{
	public static void main(String args[])
	{
		int x = 100;
		double f = 3.1415;
		float d = 3.1415F;

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String(s1);
		System.out.println(s1.equals(s2)); // TRUE
		System.out.println(s1==s2); // TRUE
		System.out.println(s1.equals(s3)); // TRUE
		System.out.println(s1==s3); // FALSE

		for(int y = 0; y < 10; y++ )
		{
			System.out.println(y);
		}
		System.out.println("Hello World!");	
		System.out.println("Number is "+ x);
		System.out.println(f);
		System.out.println(d);
	}

}