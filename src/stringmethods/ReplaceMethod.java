package stringmethods;

public class ReplaceMethod
{
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello ");
		str.replace(2, 2, "World");
		System.out.println(str);
	}
}
