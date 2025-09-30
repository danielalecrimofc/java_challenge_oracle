package hrapp.study.caso;

public class Department {
    private String name;

    private Employee[] employees = new Employee[10];

    private int lastAddedEmployeeIndex = -1;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee anEmployee){
        if(lastAddedEmployeeIndex < employees.length){
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = anEmployee;
        }
    }

    public Employee[] getEmployees() {
        Employee[] actualEmployees = new Employee[lastAddedEmployeeIndex+1];

        for (int i = 0; i < actualEmployees.length; i++){
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }

    public int getEmployeeCount() {
        /*
         * Variable lastAddedEmployeeIndex indicates last valiad position in the employees array.
         * Because the array its start at zero, need to add one to get the number of of elements.
         */
        return lastAddedEmployeeIndex+1;
    }

    // Query method that attemps to locale an employee with specific id in this department.
    public Employee getEmployeeByID(int employeeID) {
        for (Employee employee : employees) {
            if(employee != null) {
                if(employee.getID() == (employeeID)){
                    return employee;
                }
            }
        }
        return null;
    }

    // Query method that get all employee salary information.
    public double getTotalSalary(){
        double totalSalary = 0.0;

        for(int i = 0; i <= lastAddedEmployeeIndex; i++){
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }

    // Query method that get average employee salary information.
    public double getAverageSalary(){
        if(lastAddedEmployeeIndex > -1){
            return getTotalSalary() / (lastAddedEmployeeIndex+1);
        }
        return 0.0;
    }
}
