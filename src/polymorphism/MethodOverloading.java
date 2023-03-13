package polymorphism;

public class MethodOverloading 
{
	public void display(){
		System.out.println("Student Details.....");
	}
	
	public void display(int rollno){
		System.out.println("Student Roll No. "+rollno);
	}
	
	public void display(String firstname, String Lastname){
		System.out.println("Student First name is "+firstname+" and lastname "+Lastname);
	}
	
	public void display(String add,String phoneno,String department)
	{
		System.out.println("Student Address is "+add+" and Phone no "+phoneno+" and Department "+department);
	}
	
	public static void main(String[] args) {
		MethodOverloading med =new MethodOverloading();
		med.display();
		med.display(1);
		med.display("Karthi", "Sampath");
		med.display("Tamilnadu", "99876543210" , "IT");
		
	}
}
