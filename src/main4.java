public class main4 {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setEmployeeId(05);
        employee.setEmployeeName("Thanh Tùng");
        employee.setEmployeeSalary(10.000);

        int employeeId = employee.getEmployeeId();
        String employeeName = employee.getEmployeeName();
        String formattedSalary = employee.getFormattedSalary();

        System.out.println("Employee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + formattedSalary);
    }
}