package stringmethods;

public class CapacityMethod 
{
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer();  
		System.out.println(sb.capacity());
		
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());//(16*2)+2 = 32+4 = 34
		}  
}
