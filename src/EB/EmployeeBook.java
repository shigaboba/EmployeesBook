package EB;

public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook () {
        this.employees = new Employee[10];
        this.employees[0] = new Employee("Fidan Gafarov", 1, 4);
        this.employees[1] = new Employee("Guzel Urazova", 2, 4);
        this.employees[2] = new Employee("Magafur Gizatullin", 3, 6);
        this.employees[3] = new Employee("Salavat Yulaev", 4, 7);
        this.employees[4] = new Employee("Flura Kildiyarova", 5, 69);
        this.employees[5] = new Employee("Aydar Galimov", 1, 9);
        this.employees[6] = new Employee("Salavat Fathetdinov", 2, 99);
        this.employees[7] = new Employee("Flura Suleimanova", 3, 55);
        this.employees[8] = new Employee("Hania Farhi", 4, 64);
        this.employees[9] = new Employee("Vasilya Fattahova", 5, 45);
    }

    public void printBook() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            } else {
                System.out.println("Место сотрудника вакантно");
            }
            }
        }

    public double calculateSum() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public void findLoser() {
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        for (Employee employee : employees) {
            if (employee.getSalary() == minSalary) {
                System.out.println("Сотрудник с минимальной зарплатой: " + employee.toString());
            }
        }
    }

    public void findMaxSalary() {
        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        for (Employee employee : employees) {
            if (employee.getSalary() == maxSalary) {
                System.out.println("Сотрудник с максимальной зарплатой: " + employee.toString());
            }
        }
    }

    public void findAverageSalary() {
        double AverageSalary = calculateSum() / employees.length;
        System.out.println("Средняя зарплата: " + AverageSalary);
    }

    public void printNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public void indexSalaries(double index) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * (1 + index / 100));
            System.out.println(employee.getSalary());
        }
    }

    public void findLoserOfDepartment(int departmentNumber) {
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber & minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber & employee.getSalary() == minSalary) {
                System.out.println("В отделе " + departmentNumber + " сотрудник с минимальной зарплатой: " + employee.toString());
            }
        }
    }

    public void findMaxSalaryInDeparment(int departmentNumber) {
        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber & maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber & employee.getSalary() == maxSalary) {
                System.out.println("В отделе " + departmentNumber + " сотрудник с максимальной зарплатой: " + employee.toString());
            }
        }
    }

    public double calculateSumForDepartment(int departmentNumber) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public void findAverageSalaryInDepartment(int departmentNumber) {
        int peopleNumberInDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber) {
                peopleNumberInDepartment++;
            }
        }
        double averageSalary = calculateSumForDepartment(departmentNumber) / peopleNumberInDepartment;
        System.out.println("В отделе " + departmentNumber + " средняя зарплата: " + averageSalary);
    }

    public void indexSalariesInDepartment(double index, int departmentNumber) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber){
                employee.setSalary(employee.getSalary() * (1 + index / 100));
                System.out.println(employee.getSalary());
            }
        }
    }

    public void printDepartmentBook(int departmentNumber) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber) {
                System.out.println("ФИО: " + employee.getName() + ", зарплата: " + employee.getSalary());
            }
        }
    }

    public void findSalaryLessNumber(double salaryLevel) {
        System.out.println("Сотрудники с зарплатой меньше " + salaryLevel + ":");
        for (Employee employee : employees) {
            if (employee.getSalary()<salaryLevel) {
                System.out.println("id: " + employee.getId() + ", ФИО: " + employee.getName() + ", зарплата: " + employee.getSalary());;
            }
        }
    }

    public void findSalaryMoreNumber(double salaryLevel) {
        System.out.println("Сотрудники с зарплатой больше " + salaryLevel + ":");
        for (Employee employee : employees) {
            if (employee.getSalary()>salaryLevel) {
                System.out.println("id: " + employee.getId() + ", ФИО: " + employee.getName() + ", зарплата: " + employee.getSalary());;
            }
        }
    }

    public void addEmployee(String name, int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]== null) {
                employees[i] = new Employee(name, department, salary);
                return;
            }
        }
        System.out.println("Свободного места нет, пожалуйста, увольте кого-то");
    }

    public void removeEmployee(String victimName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(victimName)) {
                employees[i] = null;
                return;
            }
        }
    }

    public void changeEmployeeDepartment(String Name, int department) {
        for (Employee employee : employees) {
            if (employee.getName().equals(Name)) {
                employee.setDepartment(department);
                return;
            }
        }
    }

    public void changeEmployeeSalary(String Name, int salary) {
        for (Employee employee : employees) {
            if (employee.getName().equals(Name)) {
                employee.setSalary(salary);
                return;
            }
        }
    }

    public void printNamesWithDepartments() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Сотрудники отдела " + i + ":");
            for (Employee employee : employees) {
                if (employee.getDepartment() == i) {
                    System.out.println(employee.getName());
                }
            }
        }
    }

}
