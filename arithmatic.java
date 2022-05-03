class arithmatic
{
	public static void main(String arg[])
	{
		try {
			int a=15, b=0;
			int output=a/b;
			System.out.println("result: " +output);
		}
		catch(ArithmeticException e){
			System.out.println("a number never be divided by zero");
		}
	}
}
