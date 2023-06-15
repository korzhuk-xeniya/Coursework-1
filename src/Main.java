public class Main {
    public static String payForMonth(Employee[] employees) {
        int sum = 0;
        for (int cell = 0; cell < employees.length; cell++) {
            sum += employees[cell].getSalary();
        }
        return "Сумма затрат на зарплаты в месяц: " + sum;
    }
    public static String findMinSalary (Employee[ ]employees) {
        int minSalary = employees[0].getSalary();
        FIO fio = employees[0].getFio();
        for (int cell = 0; cell < employees.length; cell++) {
            if (employees[cell].getSalary()<minSalary) {
                minSalary = employees[cell].getSalary();
                fio = employees[cell].getFio();
            }
        }
        return "Сотрудник с минимальной зарплатой - "+ minSalary+": " + fio;
    }
    public static String
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

        System.out.println(payForMonth(employees));
        System.out.println(findMinSalary(employees));
    }
}


