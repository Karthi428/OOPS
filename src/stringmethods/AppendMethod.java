package stringmethods;

public class AppendMethod 
{
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello ");
		str.append("World");
		System.out.println(str);
	}
}
