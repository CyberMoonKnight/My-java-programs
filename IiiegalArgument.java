public class IiiegalArgument
{
	int m;
	public void setMarks(int marks)
	{
		if(marks<0 || marks>100)
		throw new IllegalArgumentException(Integer.toString(marks));
		else
		m=marks;
	}
	public static void main(String args[])
	{
		IiiegalArgument s1 = new IiiegalArgument();
		s1.setMarks(45);
		IiiegalArgument s2 = new IiiegalArgument();
		s2.setMarks(101);
		System.out.println(s2.m);
	}
}
