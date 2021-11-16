/** 
* Java 1. HomeWork - 5
*
* @author Pavel Pulyk
* @version 16.11.2021
*/
 
class HomeWork5 { 
    public static void main(String[] args) { 
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Alexsandrov Alex Vasil'evich", "Director", "aa@alex.ru", "81111111111", 40000, 56); 
        emplArray[1] = new Employee("Matyukhina Irina Anatol'yevna", "Accountant", "buh@alex.ru", "82222222222", 30000, 55); 
        emplArray[2] = new Employee("Zhukova Yulia Vladimirovna", "Chief Project Engineer", "zy@alex.ru", "83333333333", 20000, 38);
        emplArray[3] = new Employee("Migunov Dmitry Alexsandrovich", "Estimator", "estimator@alex.ru", "84444444444", 20000, 40);
        emplArray[4] = new Employee("Nechayev Andrey Dmitriyevich", "Engineer", "engineer@alex.ru", "85555555555", 20000, 28);

        for (Employee employee : emplArray) {
            if (employee.getAge()>40) {
                System.out.println(employee);
            }
        }
    }
}

class Employee {
    private String fullname;
    private String position;
    private String email;
    private String telefon;
    private int salary;
    private int age;

    Employee(String fullname, String position, String email, String telefon,  int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.telefon = telefon;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {  
        return age;
    }

    @Override
    public String toString() {
        return "Fullname: " + fullname + ",\nposition: " + position + ",\nemail: " + email + ",\ntelefon: " + telefon + ",\nsalary: " + salary + ",\nage: " + age;
    }
}