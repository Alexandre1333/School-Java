public class EmployeeDemo {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("Susan Meyers");
        emp1.setIdNumber(47899);

        Employee emp2 = new Employee();
        emp2.setName("Mark Jones");
        emp2.setIdNumber(39119);


        System.out.println("Employee 1: " + emp1.getName() + " " + emp1.getIdNumber());
        System.out.println("Employee 2: " + emp2.getName() + " " + emp2.getIdNumber());
    }
}
