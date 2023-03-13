package inhertance;

public class Education extends Student
{
	 int roll,age;
	  char section;
	  String branch=new String();
	public Education(String a, String b, String c, String d, int e, int f, char  g, String h)
	{
		super(a, b, c, d);
		 roll=e;
		 age=f;
		 section=g;
		 branch=h;
	}
	public void display()
	 {
		   System.out.println("Roll Number="+roll);
		   System.out.println("AGE="+age);
		   System.out.println("SECTION="+section);
		   System.out.println("Branch is "+branch);

		 }


}
