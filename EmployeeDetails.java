package week1.day2;

public class EmployeeDetails {

	public void printEmployeeName(String empName, int empId) {

		System.out.println(empName + "," + empId);

	}

	public void getEmployeeAddress(String doorNo, String cityName, int zipCode) {
		System.out.println(doorNo + "," + cityName + "," + zipCode);
	}

	public double printEmployeeSalary(double salary) {
		
		return salary;

	}

	private void printEmployeeMobileNumber(long mobNum) {
		System.out.println(mobNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDetails emp = new EmployeeDetails();
		emp.printEmployeeName("Ramkumar", 765857);
		emp.getEmployeeAddress("344/4", "nungampakkam", 682485);
		double salary = emp.printEmployeeSalary(32000);
		System.out.println(salary);
		emp.printEmployeeMobileNumber(9876543214l);

	}

}
