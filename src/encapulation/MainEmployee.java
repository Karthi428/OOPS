package encapulation;

public class MainEmployee
{
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.setEmpid(12);
		emp.setName("Nithiya");
		emp.setSalary(23000);
		
		System.out.println("Employee Details:");
		System.out.println("Name: "+emp.getName());
		System.out.println("ID: "+emp.getEmpid());
		System.out.println("Salary "+emp.getSalary());
	}

}
