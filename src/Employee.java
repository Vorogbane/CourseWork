import java.util.SplittableRandom;

public class Employee {
    private String fio;
    private static int index =1;
    private int department;
    private double salary;
    private int id;

    public Employee (String fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = index;
        index++;
    }
    public int getId () {
        return this.id;
    }
    public double getSalary () {
        return this.salary;
    }
    public int getDepartment () {
        return this.department;
    }
    public void setDepartment (int department) {
        this.department = department;
    }
    public void setSalary (double salary) {
        this.salary = salary;
    }
    public String getFio () {
        return this.fio;
    }
    public String toString() {
        return fio + " " + id;
    }
    public void setFio (String fio) {
        this.fio = fio;
    }
    public void setDepartment (String fio) {
        this.department = department;
    }

}
