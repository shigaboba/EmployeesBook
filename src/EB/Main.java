package EB;

public class Main {
    public static void printBook( Employee[] EmployeeBook) {
        for (Employee employee : EmployeeBook) {
            System.out.println(employee.toString());
        }
    }

    public static int calculateSum( Employee[] EmployeeBook) {
        int sum = 0;
        for (Employee employee : EmployeeBook) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static void findLoser( Employee[] EmployeeBook){
        int minSalary = EmployeeBook[0].getSalary();
        for (Employee employee : EmployeeBook) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        for (Employee employee : EmployeeBook) {
            if (employee.getSalary() == minSalary) {
                System.out.println("Сотрудник с минимальной зарплатой: " + employee.toString());
            }
        }
    }

    public static void findMaxSalary( Employee[] EmployeeBook){
        int maxSalary = EmployeeBook[0].getSalary();
        for (Employee employee : EmployeeBook) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        for (Employee employee : EmployeeBook) {
            if (employee.getSalary() == maxSalary) {
                System.out.println("Сотрудник с максимальной зарплатой: " + employee.toString());
            }
        }
    }

    public static void  findMidSalary( Employee[] EmployeeBook) {
        int midSalary = calculateSum(EmployeeBook)/EmployeeBook.length;
        System.out.println("Средняя зарплата: " + midSalary);
    }

    public static void printNames( Employee[] EmployeeBook) {
        for (Employee employee : EmployeeBook) {
            System.out.println(employee.getName());
        }
    }

    public static void main(String[] args) {
        Employee[] EmployeeBook = new Employee[10];
        EmployeeBook[0] = new Employee("Marsik Semakov", 1, 4);
        EmployeeBook[1] = new Employee("Bulka Shigapov", 2, 4);
        EmployeeBook[2] = new Employee("Persik Shigapov", 3, 6);
        EmployeeBook[3] = new Employee("Joke Galaxy", 4, 7);
        EmployeeBook[4] = new Employee("Tia Rocket", 5, 69);
        EmployeeBook[5] = new Employee("May Rice", 1, 9);
        EmployeeBook[6] = new Employee("Ahito Avito", 2, 99);
        EmployeeBook[7] = new Employee("Tran Klemp", 3, 55);
        EmployeeBook[8] = new Employee("Arch Simbaev", 4, 64);
        EmployeeBook[9] = new Employee("Sined Artegor", 5, 45);
        printBook(EmployeeBook);
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateSum(EmployeeBook));
        findLoser(EmployeeBook);
        findMaxSalary(EmployeeBook);
        findMidSalary(EmployeeBook);
        printNames(EmployeeBook);
    }
}
