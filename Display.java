class Student
{
	int rollnumber;
	int marks;
	String name;
	void insertRecord(int r, int m, String n)
	{
		rollnumber= r;
		marks= m;
		name= n;
		System.out.println("Name of the student: " +name);
		System.out.println("Rollnumber: " +rollnumber);
		System.out.println("Marks: " +marks);
	}
}
class Myrecord extends Student
{
	
}
class Display
{
	public static void main(String args[])
	{
		Myrecord obj=new Myrecord();
		obj.insertRecord(006, 87, "Manoj");
	}
}
