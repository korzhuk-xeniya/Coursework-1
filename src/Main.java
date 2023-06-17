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

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[cell];
            }
        }
        return employeeWithMinSalary;
    }

    public static FIO findFioEmployeeWithMinSalary(Employee[] employees) {
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

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[cell];
            }
        }
        return employeeWithMaxSalary;
    }

    public static FIO findFioEmployeeWithMaxSalary(Employee[] employees) {
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
        FIO fio = findFioEmployeeWithMaxSalary(employees);
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
        FIO fio = findFioEmployeeWithMinSalary(employees);
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

    public static int countAmountOfSalaryCostsByDepartment(int department, Employee[] employees) {
        int amountOfSalaryCostsByDepartment = 0;
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getDepartment() == department) {
                amountOfSalaryCostsByDepartment += employees[cell].getSalary();
            }
        }
        return amountOfSalaryCostsByDepartment;
    }

    public static float countAverageSalaryByDepartment(int department, Employee[] employees) {
        float averageSalaryByDepartment = 0;
        int count = 0;
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getDepartment() == department) {
                count++;
                averageSalaryByDepartment = (float) countAmountOfSalaryCostsByDepartment(department, employees) / count;
            }
        }
        return averageSalaryByDepartment;
    }

    public static int countEmployeesInDepartment(int department, Employee[] employees) {
        int count = 0;
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getDepartment() == department) {
                count++;
            }
        }
        return count;
    }

    public static void increaseSalaryInDepartment(int department, Employee[] employees, int percent) {
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getDepartment() == department) {
                employees[cell].setSalary(employees[cell].getSalary() + employees[cell].getSalary() * percent / 100);
            }
        }
    }

    public static String writeEmployeesOfDepartment(int department, Employee[] employees) {
        String[] employeesOfDepartment = new String[countEmployeesInDepartment(department, employees)];
        int employee = 0;
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getDepartment() == department) {
                employeesOfDepartment[employee] = employees[cell].getFio() + " Зарплата: " + employees[cell].getSalary() + " ID: " + employees[cell].getId();
                employee++;
            }
        }
        return Arrays.toString(employeesOfDepartment);
    }


    public static String getEmployeesWithSalaryLessDigit(int digit, Employee[] employees) {
        int count = 0;

        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getSalary() < digit) {
                count++;
            }
        }
        String[] employeesWithSalaryLessDigit = new String[count];
        int i = 0;
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getSalary() < digit) {
                employeesWithSalaryLessDigit[i] = " ID: " + employees[cell].getId() + " " + employees[cell].getFio() + " Зарплата: " + employees[cell].getSalary();
                i++;
            }
        }
        return Arrays.toString(employeesWithSalaryLessDigit);
    }

    public static String getEmployeesWithSalaryMoreDigit(int digit, Employee[] employees) {
        int count = 0;

        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getSalary() >= digit) {
                count++;
            }
        }
        String[] employeesWithSalaryMoreDigit = new String[count];
        int i = 0;
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getSalary() >= digit) {
                employeesWithSalaryMoreDigit[i] = " ID: " + employees[cell].getId() + " " + employees[cell].getFio() + " Зарплата: " + employees[cell].getSalary();
                i++;
            }
        }
        return Arrays.toString(employeesWithSalaryMoreDigit);
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
            System.out.println("Сумма затрат на зарплату в " + department + " отделе: " + countAmountOfSalaryCostsByDepartment(department, employees));
            System.out.println("Средняя зарплата в " + department + " отделе: " + countAverageSalaryByDepartment(department, employees));
            increaseSalaryInDepartment(department, employees, 5);
            System.out.println("Сотрудники " + department + " отдела: " + writeEmployeesOfDepartment(department, employees));
        } else {
            System.out.println("Такого отдела не существует");

        }
        System.out.println("Сотрудники с зарплатой меньше 100_000 " + getEmployeesWithSalaryLessDigit(100_000, employees));
        System.out.println("Сотрудники с зарплатой больше 100_000 " + getEmployeesWithSalaryMoreDigit(100_000, employees));
    }
}


