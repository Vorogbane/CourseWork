import java.util.Arrays;

public class List {
    int i;
    private Employee [] list;

    public List() {
        list = new Employee[10];
    }

    public void fillList (Employee a) {
        for (int i=0; i<10; i++) {
            if (this.list[i] == null) {
                this.list[i] = a;
                break;
            }
        }
    }
    public void print () {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
    public double CountSalary () {
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list [i] != null) {
                sum = sum + list[i].getSalary();
            }
        }
        return sum;
    }
    public double CountSalaryPerDepartment (int department) {
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list [i] != null & list[i].getDepartment() == department) {
                sum = sum + list[i].getSalary();
            }
        }
        return sum;
    }

    public Employee findMaxSalary () {
        double maximum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null & maximum < list[i].getSalary()) {
                maximum = list[i].getSalary();
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (maximum == list[i].getSalary())
                return list[i];
        }
        return list[i];
    }
    public Employee findMaxSalaryPerDepartment (int department) {
        double maximum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null & list[i].getDepartment() == department & maximum < list[i].getSalary()) {
                maximum = list[i].getSalary();
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (maximum == list[i].getSalary())
                return list[i];
        }
        return list[i];
    }

    public Employee findMinSalaryPerDepartment (int department) {
        double minimum = 1000000000;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null & list[i].getDepartment() == department & minimum > list[i].getSalary()) {
                minimum = list[i].getSalary();
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (minimum == list[i].getSalary())
                return list[i];
        }
        return list[i];
    }
    public Employee findMinSalary () {
        double minimum = 1000000000;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null & minimum > list[i].getSalary()) {
                minimum = list[i].getSalary();
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (minimum == list[i].getSalary())
            return list[i];
        }
        return list[i];
    }

    public double findAverageSalary () {
        int objectsCounter = 0;
        for (int i = 0; i < list.length; i++) {
            objectsCounter++;
        }
        double averageSalary = CountSalary() / objectsCounter;
        return averageSalary;
    }

    public double findAverageSalaryPerDepartment (int department) {
    int objectsCounter = 0;
        for (int i = 0; i < list.length; i++) {
            if (department == list[i].getDepartment()) {
                objectsCounter++;
            }
        }
        double averageSalary = CountSalaryPerDepartment(department) / objectsCounter;
        return averageSalary;
    }
    public Employee getEmployee (int i) {
        return list[i];
    }
    public void printFio () {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getFio());
        }
    }

    public void printEmployeesPerDepartment (int department) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == department) {
                System.out.println(list[i].getFio() + " " + list[i].getId() + " " + list[i].getSalary());

            }
        }
    }

    public void printEmployeesWithLesserSalary (double salary) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() < salary) {
                System.out.println(list[i].getFio() + " " + list[i].getId() + " " + list[i].getSalary());

            }
        }
    }
    public void printEmployeesWithBiggerSalary (double salary) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() >= salary) {
                System.out.println(list[i].getFio() + " " + list[i].getId() + " " + list[i].getSalary());

            }
        }
    }
    public void salaryIndexation (double percent) {
        double newSalary;
        for (int i = 0; i < list.length; i++) {
            newSalary = list[i].getSalary() + list[i].getSalary() * (percent / 100);
            list[i].setSalary(newSalary);
        }
    }
    public void salaryIndexationPerDepartment (double percent, int department) {
        double newSalary;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == department) {
                newSalary = list[i].getSalary() + list[i].getSalary() * (percent / 100);
                list[i].setSalary(newSalary);
            }
        }
    }

    public void deleteFromTheList (int id) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getId() == id) {
                list[i] = null;
            }
        }
    }
    public void changeSalaryRecord (String fio, double newSalary) {
        for (int i = 0; i < list.length; i++) {
            if (fio.equalsIgnoreCase(list[i].getFio())) {
                list[i].setSalary(newSalary);
            }
        }
    }
    public void changeDepartmentRecord (String fio, int newDepartment) {
        for (int i = 0; i < list.length; i++) {
            if (fio.equalsIgnoreCase(list[i].getFio())) {
                list[i].setDepartment(newDepartment);
            }
        }
    }
    public void printListSortedByDepartment () {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted=true;
            for (int i = 1; i < list.length; i++) {
                if (list[i].getDepartment() < list[i -1].getDepartment()) {
                    Employee temp = list[i];
                    list[i] = list[i-1];
                    list[i-1]=temp;
                    isSorted=false;
                }
            }
        }
        printFioAndDepartment();
    }
    public void printFioAndDepartment () {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getFio() + ", " + list[i].getDepartment() + " отдел");
        }
    }

}