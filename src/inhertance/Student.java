package inhertance;

public class Student
{
	String name=new String();
	  String fname=new String();
	  String add=new String();
	  String phno=new String();
	  
	  public Student(String a,String b,String c,String d)
	  {
		  name=a;
		  fname=b;
		  add=c;
		  phno=d;
	  }
	  public void display2()
	  {
		   System.out.println("Name is "+name);
		    System.out.println("Address  "+add);
		    System.out.println("Father's Name is "+fname);
		   System.out.println("Contact number "+phno);
		 }
	
}
