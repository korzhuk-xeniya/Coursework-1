import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int countSumPayForMonth(Employee[] employees) {
        int sum = 0;
        for (int cell = 0; cell < employees.length; cell++) {
            sum += employees[cell].getSalary();
        }
        return sum;
    }

    public static FIO findEmployeeWithMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        FIO fio = employees[0].getFio();
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getSalary() < minSalary) {
                minSalary = employees[cell].getSalary();
                fio = employees[cell].getFio();
            }
        }
        return fio;
    }

    public static int findMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        FIO fio = employees[0].getFio();
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getSalary() < minSalary) {
                minSalary = employees[cell].getSalary();
                fio = employees[cell].getFio();
            }
        }
        return minSalary;
    }

    public static FIO findEmployeeWithMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        FIO fio = employees[0].getFio();
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getSalary() > maxSalary) {
                maxSalary = employees[cell].getSalary();
                fio = employees[cell].getFio();
            }
        }
        return fio;
    }

    public static int findMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        FIO fio = employees[0].getFio();
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getSalary() > maxSalary) {
                maxSalary = employees[cell].getSalary();
                fio = employees[cell].getFio();
            }
        }
        return maxSalary;
    }

    public static float countAverageValueOfSalaries(Employee[] employees) {
        float averageSalary = (float) countSumPayForMonth(employees) / employees.length;
        return averageSalary;
    }

    public static String writeFullNames(Employee[] employees) {
        FIO[] fio = new FIO[employees.length];
        for (int cell = 0; cell < employees.length; cell++) {
            fio[cell] = employees[cell].getFio();
        }
        return Arrays.toString(fio);
    }

    public static void increaseSalary(Employee[] employees, int percent) {
        for (int cell = 0; cell < employees.length; cell++) {
            employees[cell].setSalary(employees[cell].getSalary() + employees[cell].getSalary() * percent / 100);
        }
    }

    public static FIO findEmployeeWithMinSalaryInDepartment(int department, Employee[] employees) {
        int minSalaryInDepartment = findMaxSalary(employees);
        FIO fio = findEmployeeWithMaxSalary(employees);
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getDepartment() == department) {
                if (employees[cell].getSalary() < minSalaryInDepartment) {
                    minSalaryInDepartment = employees[cell].getSalary();
                    fio = employees[cell].getFio();
                }
            }
        }
        return fio;
    }

    public static FIO findEmployeeWithMaxSalaryInDepartment(int department, Employee[] employees) {
        int maxSalaryInDepartment = findMinSalary(employees);
        FIO fio = findEmployeeWithMinSalary(employees);
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getDepartment() == department) {
                if (employees[cell].getSalary() > maxSalaryInDepartment) {
                    maxSalaryInDepartment = employees[cell].getSalary();
                    fio = employees[cell].getFio();
                }
            }
        }
        return fio;
    }

    public static void main(String[] args) {
        FIO iii = new FIO("Иванов", "Иван", "Иванович");
        FIO ppp = new FIO("Петров", "Пётр", "Петрович");
        FIO pni = new FIO("Перова", "Наталья", "Ивановна");
        FIO nap = new FIO("Носова", "Анна", "Петровна");
        FIO son = new FIO("Семенова", "Ольга", "Николаевна");
        FIO lip = new FIO("Лазарев", "Иван ", "Петрович");
        FIO lpn = new FIO("Лубков", "Павел", "Николаевич");
        FIO sio = new FIO("Смирнова", "Ирина", "Олеговна");
        FIO tds = new FIO("Тарасов", "Дмитрий", "Сергеевич");
        FIO mtv = new FIO("Миронова", "Татьяна", "Валентиновна");

        Employee director = new Employee(iii, 1, 250_000);
        Employee secretary = new Employee(pni, 1, 50_000);
        Employee accountant = new Employee(ppp, 2, 90_000);
        Employee chiefAccountant = new Employee(nap, 2, 120_000);
        Employee hrSpecialist = new Employee(son, 3, 70_000);
        Employee clerk = new Employee(lip, 3, 60_000);
        Employee economist = new Employee(lpn, 2, 55_000);
        Employee prMenedger = new Employee(sio, 4, 80_000);
        Employee designer = new Employee(tds, 5, 75_000);
        Employee artDirector = new Employee(mtv, 5, 150_000);

        Employee[] employees = new Employee[10];
        employees[0] = director;
        employees[1] = secretary;
        employees[2] = accountant;
        employees[3] = chiefAccountant;
        employees[4] = hrSpecialist;
        employees[5] = clerk;
        employees[6] = economist;
        employees[7] = prMenedger;
        employees[8] = designer;
        employees[9] = artDirector;
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        System.out.println("Сумма затрат на зарплаты в месяц: " + countSumPayForMonth(employees));
        System.out.println("Сотрудник с минимальной зарплатой - " + findEmployeeWithMinSalary(employees));
        System.out.println("Сотрудник с максимальной зарплатой - " + findEmployeeWithMaxSalary(employees));
        System.out.println("Среднее значение зарплат: " + countAverageValueOfSalaries(employees));
        System.out.println(writeFullNames(employees));
        increaseSalary(employees, 10);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер отдела (от 1 до 5)");
        int department = scanner.nextInt();
        if (department > 0 && department <= 5) {
            System.out.println("Сотрудник с минимальной зарплатой в " + department + " отделе: " + findEmployeeWithMinSalaryInDepartment(department, employees));
            System.out.println("Сотрудник с максимальной зарплатой в " + department + " отделе: " + findEmployeeWithMaxSalaryInDepartment(department, employees));
        } else {
            System.out.println("Такого отдела не существует");
        }

    }
}


