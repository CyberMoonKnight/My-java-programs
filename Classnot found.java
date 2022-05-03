public class Classnotfound
{
	public static void main(String args[])
	{
		try {
			Class.forName("myPackage.exampl.sample");
		}catch  (ClassnotfoundException ex) {
		ex.printStackTrace();
		}
	}
}
