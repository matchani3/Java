public class Array
{
	public static void main(String args[])
	{
		int[] myArray = new int[10];
		int[] array2 = {1,2,3,5,77};

		int [][] twoD = new int[4][5];
		int [][][] threeD = new int[3][4][5];

		System.out.println("Printing the one dimentional array\n\t");
		for(int i: array2)
		{
			System.out.print(i + " ");
		}

		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				twoD[i][j] = i*j;
			}
		}

		System.out.println("Now printing 2d array");
		for(int k[]:twoD)
		{
			for(int z: k)
			{
				System.out.print(z);
			}

			System.out.println();
		}

		
		System.out.println("This array has " + myArray.length + " elements");
		System.out.println("second array has " + array2.length + " elements");
	}
}