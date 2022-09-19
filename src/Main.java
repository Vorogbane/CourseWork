import java.util.Arrays;
public class Main {
    public static List array = new List ();
    public static void main(String[] args) {
        Employee oleg = new Employee("Vorontsov Oleg Nikolaevich", 1, 30000);
        Employee olga = new Employee("Vorontsova Olga Alexandrovna", 2, 15000);
        Employee vladimir = new Employee("Eliseev Vladimir Victorovich", 1, 58000);
        Employee svyatogor = new Employee("Kuznets Svyatogor Izyaslavich", 3, 109000);
        Employee svyatoslav = new Employee("Druzhinnik Svyatoslav Igorevich", 3, 67000);
        Employee julius = new Employee("Gaius Julius Caesar",2, 23000);
        Employee adolf = new Employee("Adolf Hitler", 4, 1488);
        Employee yaropolk = new Employee("Ryazanskiy Yaropolk Sergeevich", 4, 21000);
        Employee bogdan = new Employee ("Manko Bogdan Ruslanovich", 5, 45000);
        Employee dobrynya = new Employee("Bogatyr Dobrynya Nikitich", 5, 97000);
        System.out.println("olga.getId() = " + olga.getId());
        System.out.println("olga.getFio() = " + olga.getFio());
        System.out.println(oleg.getId());
        System.out.println("Hello world!");
        System.out.println(array.getEmployee(1));
        array.fillList(oleg);
        array.fillList(olga);
        array.fillList(vladimir);
        array.fillList(svyatogor);
        array.fillList(svyatoslav);
        array.fillList(julius);
        array.fillList(adolf);
        array.fillList(yaropolk);
        array.fillList(bogdan);
        array.fillList(dobrynya);
        olga.setSalary(22000);
        System.out.println("olga.getSalary() = " + olga.getSalary());
        System.out.println("array.CountSalary() = " + array.CountSalary());
        array.print ();
        System.out.println("array.findMinSalaryPerDepartment(4) = " + array.findMinSalaryPerDepartment(3));
        System.out.println("array.findMinSalary() = " + array.findMinSalary());
        System.out.println("array.findAverageSalary() = " + array.findAverageSalary());
        System.out.println("array.findAverageSalaryPerDepartment(3) = " + array.findAverageSalaryPerDepartment(3));
        System.out.println("array.findMaxSalary() = " + array.findMaxSalary());
        System.out.println("array.findMaxSalaryPerDepartment(1) = " + array.findMaxSalaryPerDepartment(1));
        array.printFio();
        array.printEmployeesPerDepartment(4);
        array.printEmployeesWithLesserSalary(10000);
        array.salaryIndexation(5);
        System.out.println("svyatogor.getSalary() = " + svyatogor.getSalary());
        array.salaryIndexationPerDepartment(100, 3);
        System.out.println("svyatogor.getSalary() = " + svyatogor.getSalary());
        array.deleteFromTheList(1);
        System.out.println("array.getEmployee(1) = " + array.getEmployee(0));
        array.fillList(oleg);
        System.out.println("array.getEmployee(1) = " + array.getEmployee(0));
        array.changeSalaryRecord("Kuznets Svyatogor Izyaslavich", 250000);
        System.out.println("svyatogor.getSalary() = " + svyatogor.getSalary());
        System.out.println("adolf.getSalary() = " + adolf.getSalary());
        array.changeDepartmentRecord("adolf hitler", 1);
        System.out.println("adolf.getDepartment() = " + adolf.getDepartment());
        array.changeDepartmentRecord("adolf hitler", 4);
        array.printListSortedByDepartment();


    }
}