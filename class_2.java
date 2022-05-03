class class_1 
{

    private int value1;

    public class_1(int value1In) 
	{
		value1 = value1In;
	} 
    public int getValue() 
	{
		return value1; 
	}
    public void insertValue(int value1In) 
	{
		value1 = value1In;
	}
}
	class class_2
{

    static void swap(class_1 rW, class_1 sW) 
	{

        int value2 = rW.getValue();
        rW.insertValue(sW.getValue());
        sW.insertValue(value2);
    }

    public static void main(String[] args) 
	{
        int a = 23, b = 47;
        System.out.println("Before. a:" + a + ", b: " + b);
        class_1 aWrap = new class_1(a);
        class_1 bWrap = new class_1(b);
        swap(aWrap, bWrap);
        a = aWrap.getValue();
        b = bWrap.getValue();
        System.out.println("After.  a:" + a + ", b: " + b);
    }
}
