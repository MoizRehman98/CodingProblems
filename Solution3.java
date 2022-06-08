package CodingProblems;

import java.util.Scanner;

class EmployeeManagement {
	static String employeeName = null;
	static String employeeID = null;

	EmployeeManagement() {
		System.out.println("==========Displaying Record==========");
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee ID: " + employeeID + "\n");
	}

	static void addEmployee(String en, String eid) {
		employeeName = en;
		employeeID = eid;
		System.out.println("\nEmployee " + employeeName + "'s record has been added!\n");
	}
	
	void deleteEmployeeRecord() {
		System.out.println("The emmployee " + employeeName + "'s record has been deleted");
		employeeName = null;
		employeeID = null;
		
	}

}

public class Solution3 {

	public static void main(String[] args) {
		
	    Scanner c = new Scanner(System.in);
		
		System.out.print("Enter Employee Name: ");
		String name = c.nextLine();
		
		System.out.print("Enter Employee ID: ");
		String ID = c.nextLine();
				
		
		EmployeeManagement.addEmployee(name,ID);
		EmployeeManagement e = new EmployeeManagement();
		e.deleteEmployeeRecord();
	}
}
