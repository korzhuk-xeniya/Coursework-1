public class Employee {
    private FIO fio;
    private int department;
    private int salary;
    private int id;
    Counter idCounter = new Counter();

    public Employee(FIO fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = idCounter.getCount();
        idCounter.increment();
    }

    public FIO getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
