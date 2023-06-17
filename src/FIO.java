public class FIO {
    private String name;
    private String  patronymic;
    private String lastName;
    public FIO (String lastName, String name, String  patronymic) {
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public String toString () {
        return "Ф.И.О. " + lastName + " " + name + " " + patronymic;
    }
}
