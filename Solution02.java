package CodingProblems;

import java.util.Scanner;

class SchoolRecords {
	String schoolName;
	String schoolId;
	String schoolAddress;
	
	void addRecords(String sn, String si, String sa) {
		schoolName = sn;
		schoolId = si;
		schoolAddress = sa;
		System.out.println("\nThe record has been added!\n");
	}
	
	void dispRecords () {
		System.out.println("==============Displaying Record==============");
		System.out.println("School Name: " + schoolName);
		System.out.println("School ID: " + schoolId);
		System.out.println("School Address: " + schoolAddress);
	}
}


public class Solution02 {

	public static void main(String[] args) {
		SchoolRecords s = new SchoolRecords();
		Scanner c = new Scanner(System.in);
		
		System.out.print("Enter School Name: ");
		String name = c.nextLine();
		
		System.out.print("Enter School ID: ");
		String ID = c.nextLine();
		
		System.out.print("Enter School Address: ");
		String address = c.nextLine();
			
		s.addRecords(name, ID, address);
		s.dispRecords();
	}
}
