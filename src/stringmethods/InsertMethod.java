package stringmethods;

public class InsertMethod 
{
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello ");
		str.insert(3, "World");
		System.out.println(str);
	}
}
