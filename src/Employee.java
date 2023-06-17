public class Employee {
    private FIO fio;
    private int department;
    private int salary;
    private int id;

    private static int idCounter = 0;

    public Employee(FIO fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = idCounter;
        idCounter++;
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

    @Override
    public String toString() {
        return fio.toString() + " Отдел: " + department + " Зарплата: " + salary + " ID: " + id;
    }


//    public static int payForMonth (Employee[] employees){
//        int sum = 0;
//        for (int cell = 0; cell < employees.length; cell++) {
//            sum += employees[cell].getSalary();
//        }
//        return sum;
    }



