public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.id=10;
        employee.name="Subramnaian Murugan";
        employee.salary=2000;
        employee.gender='M';
        employee.isActive=true;

        System.out.println("Id :" + employee.id);
        System.out.println("Name :" + employee.name);
        System.out.println("Salary : " + employee.salary);
        System.out.println("Gender : " + employee.gender);
        System.out.println("Status : " + employee.isActive);

    }
}
