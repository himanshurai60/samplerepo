import java.util.Scanner;

import com.pojo.Employee;

public class TestEmployeeDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter empID:");
		int empId=s.nextInt();
		
		System.out.println("enter name:");
		String name=s.next();
		System.out.println("enter salary:");
		int salary=s.nextInt();
		Employee myEmployee=new Employee(12,12000,"ABC");
		
		EmployeeDAO dao=new EmployeeDAO();
		int rows =dao.addEmployee(myEmployee);
		if(rows>0)
		{
			System.out.println("record inserted successfully");
		}
		else
			System.out.println("sorry");
	}

}
