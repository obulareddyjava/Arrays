package exceptionMar27;

public class Employee {
	private int id;
	private String ename;
	private double esalary;
	public Employee(int id, String ename, double esalary) {
		super();
		this.id = id;
		this.ename = ename;
		this.esalary = esalary;
		//System.out.println("id is "+id+" ename is  "+ename+" e salary is "+esalary);
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
	


	

	
	

}
