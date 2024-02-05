package lesson.third;

public class Employee {

    private final String fullName;
    private final String position;
    private final String email;
    private final String phoneNumber;
    private final double salary;
    private final int age;

    // Конструктор класса для заполнения полей при создании объекта
    public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        // Создаем массив из 5 сотрудников
        Employee[] employeesArray = new Employee[5];

        // Заполняем массив объектами
        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeesArray[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "891023456", 40000, 45);
        employeesArray[2] = new Employee("Sidorov Sidor", "Analyst", "sidorov@mailbox.com", "895678912", 35000, 35);
        employeesArray[3] = new Employee("Kuznetsov Kuzma", "Designer", "kuznetsov@mailbox.com", "898765432", 32000, 28);
        employeesArray[4] = new Employee("Smirnov Dmitry", "Developer", "smirnov@mailbox.com", "896543219", 42000, 50);

        // Выводим информацию только о сотрудниках старше 40 лет
        System.out.println("Employees older than 40:");
        for (Employee employee : employeesArray) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }

    // Метод для вывода информации об объекте в консоль
    public void printInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println("--------------------");
    }

    // Геттеры для доступа к полям
    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
