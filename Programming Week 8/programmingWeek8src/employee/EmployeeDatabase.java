package employee;

public class EmployeeDatabase {

	
		
		private String firstName;
		private String lastName;
		private int employeeNumber;
		private static int count = 0;
		
		
		public EmployeeDatabase(String firstNameP, String lastNameP) {
			count++;
			this.firstName = firstNameP;
			this.lastName = lastNameP;
			employeeNumber = count;
	}


		@Override
		public String toString() {
			return "EmployeeDatabase [firstName=" + firstName + ", lastName=" + lastName + ", employeeNumber="
					+ employeeNumber + "]";
		}
		}
		
		


