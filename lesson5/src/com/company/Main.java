package com.company;

//import java.io.IOException;


public class Main {


    static final int AGE_LIMIT = 40;
    static final int ARRAY_WORKERS = 5;


    public static void main(String[] args){

        System.out.println("Workers of company: " );
        Employee[] employee = new Employee[ARRAY_WORKERS];

        employee[0] = new Employee("Кондратьев Иван Кириллович", "Аудитор","ivan@gmail.com", "+375295541122", 1200, 50);
        employee[1] = new Employee("Романова Сафия Яновна", "Аналитик", "romanova@mail.ru", "+375336987412",1000,25);
        employee[2] = new Employee("Орцхоева Амелия Артуровна", "Бухгалтер", "ameliaorex@icloud.com", "+375296541230",1500,41);
        employee[3] = new Employee("Леонов Георгий Елисеевич","Маркетолог", "eliseevichgeorg@gmail.com", "+375441234567", 900, 40);
        employee[4] = new Employee("Чернышев Лев Ильич", "Страховой агент", "ilichlion@mail.ru", "+375296547812", 2500, 55);

        for(Employee employees : employee){
            System.out.println(employees.getInformEmployee());
        }
        System.out.println();

        for (Employee employees : employee) {
            if (employees.getAge() > AGE_LIMIT) {
                System.out.println("Сотрудник старше " + AGE_LIMIT + " лет: " + employees.getInformEmployee());

            } if (employees.getAge() == AGE_LIMIT){
                System.out.println("Сотруднику " + AGE_LIMIT + " лет: " + employees.getInformEmployee());

            } else {
                continue;
              //  System.out.println("This company not has employee older than " + AGE_LIMIT);

            }
        }

    }
}
