public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(FIO fio, int department, int salary, int id) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, в книге закончилось место");
        }
        for (int lineOfBook = 0; lineOfBook < size; lineOfBook++) {
            if (employees[lineOfBook] == null) {
                Employee newEmployee = new Employee(fio, department, salary);
                employees[size++] = newEmployee;
            }
        }
    }
    public void deleteEmployee (FIO fio) {
        for (int lineOfBook = 0; lineOfBook < size; lineOfBook++) {
            if (employees[lineOfBook].getFio().equals(fio)) {
                System.out.println(employees[lineOfBook].getFio() + " удален ");
                employees[lineOfBook] = null;
                size--;
            }
        }
    }

}