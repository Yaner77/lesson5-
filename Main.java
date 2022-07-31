package lesson5;

public class Main {

    public static void main(String[] args) {

        Employee[]employees = new Employee[5];

        employees  [0] = new Employee ("Иванов Иван Иванович","Менеджер", "ivivan@mailbox.com", "2504", 50000, 22);
        employees  [1] = new Employee ("Боб", "Босс", "bob@mailbox.com", "3606", 200000, 41);
        employees  [2] = new Employee ("Зак", "Курьер", "zak@mailbox.com", "9685", 30000, 53);
        employees  [3] = new Employee ("Олег", "Разработчик", "oleg@mailbox.com", "4174", 150000, 33);
        employees  [4] = new Employee ("Вера", "Офис менеджер", "vera@mailbox.com", "6945", 50000, 19);

        for (Employee employee : employees) {
            if(employee.getAge() > 40) {
                employee.printInfo();}}}}

