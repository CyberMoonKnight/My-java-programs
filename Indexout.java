public class Indexout
{
	public static void main(String args[])
	{
		char[] matrix = new char[] {'M' , 'B',};
		System.out.println(matrix);
		
		for(int i=0; i<=matrix.length; ++i) 
		{
			try
			{ 
			   System.out.println(matrix[i]);
			} catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println(e);
			}
			System.out.println("Error is handled");
		}
	}
}

			