package stringmethods;

public class DeleteMethod 
{
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello ");
		str.delete(2, 4);
		System.out.println(str);
	}
}
