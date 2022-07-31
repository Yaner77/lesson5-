package lesson5;


public class Employee {
    private String fullName;
    private String jobTitle;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Employee (String fullName, String jobTitle, String email, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';}
    public int getAge() {
        return age;}}




