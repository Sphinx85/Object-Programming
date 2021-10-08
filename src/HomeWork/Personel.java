package HomeWork;

public class Personel {
    private final String name;
    private final String email;
    private final int phoneNumber;
    private final int salary;
    private final int age;

    public Personel(String name, String email, int phoneNumber, int salary, int age) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
    public void personelInfo(){
        System.out.println("Имя: " + getName());
        System.out.println("Адрес электронной почты: " + getEmail());
        System.out.println("Номер телефона: " + getPhoneNumber());
        System.out.println("Уровень зарплаты: " + getSalary());
        System.out.println("Возраст: " + getAge());
    }
}
