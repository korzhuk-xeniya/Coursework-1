public class Main {
    public static void main(String[] args) {
        FIO iii = new FIO("Иванов", "Иван", "Иванович");
        FIO ppp = new FIO("Петров", "Пётр", "Петрович");
        FIO pni = new FIO("Перова", "Наталья", "Ивановна");
        Employee director = new Employee(iii, 1, 100_000);
        Employee secretary = new Employee(pni, 1, 50_000);
        Employee accountant = new Employee(ppp, 2, 90_000);
        System.out.println(director.toString());
        System.out.println(secretary.toString());
        System.out.println(accountant.toString());


    }
}