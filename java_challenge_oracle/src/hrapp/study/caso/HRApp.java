package hrapp.study.caso;

public class HRApp {
	public static void main(String[] args) {
		System.out.println("HRApp Starts");
		
		Employee eOne = new Employee(453, "Daniel", 12450.00);
        Employee eTwo = new Employee(454, "Ryan", 12444.00);
        
        Department department = new Department("Education");

        department.addEmployee(eOne);
        department.addEmployee(eTwo);

        Employee[] employees = department.getEmployees();

        for (Employee employee : employees) {
            System.out.println(employee); 
        }
        
        System.out.println("Total: R$ " + department.getTotalSalary());
        System.out.println("Average: R$ " + department.getAverageSalary());

	}
}
