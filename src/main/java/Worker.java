public class Worker {//класс Сотрудник
    private String fullName;
    private String position;
    private String email;
    private int numberPhone;
    private int salary;
    private int age;

    public Worker(String _fullName, String _position, String _email, int _numberPhone, int _salary, int _age) {//конструктор класса
        this.fullName = _fullName;
        this.position = _position;
        this.email = _email;
        this.numberPhone = _numberPhone;
        this.salary = _salary;
        this.age = _age;
    }

    public static void main(String[] args) {

        Worker worker1 = new Worker("Ступка Богдан Сильвестрович", "Актер", "Ivanov@mozga.net", 880055535, 15000, 35);
        Worker worker2 = new Worker("Косач Лариса Петровна", "Писательница", "Petr1@mozga.net", 3800555, 20000, 32);
        Worker worker3 = new Worker("Костенко Лина Васильевна", "Писательница", "KLina@mozga.net", 777777, 25000, 44);
        Worker worker4 = new Worker("Стус Василий Семенович", "Поэт", "Stus@mozga.net", 555555, 30000, 36);
        Worker worker5 = new Worker("Светличный Иван Алексеевич", "Поэт", "Svet@mozga.net", 44444, 35000, 46);

        System.out.println("ФИО: " + worker1.fullName + " Должность- " + worker1.position + " Электронный адресс- " + worker1.email + " Номер телефона-" + worker1.numberPhone + " Зарплата: " + worker1.salary + " Возвраст: " + worker1.age);
        
        Worker[] workers = new Worker[5];//Масив рабочих
        workers[0] = worker1;
        workers[1] = worker2;
        workers[2] = worker3;
        workers[3] = worker4;
        workers[4] = worker5;
        for (Worker worker : workers)
            if (worker.age >= 40) {//this условие отпечатывает только олдов страше 40, если убрать условие отпечатает всех сотрудников
                System.out.println("ФИО " + worker.fullName + " Должность " + worker.position + "Электронный адресс: " + worker.email + "Номер телефона: " + worker.numberPhone + "Зарплата: " + worker.salary + "Возвраст: " + worker.age);
            }


    }
}



