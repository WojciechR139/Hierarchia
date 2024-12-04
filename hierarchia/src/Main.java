public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jan Kowalski", 4000);
        employee.displayInfo();

        Manager manager = new Manager("Anna Nowak", 7000, 10);
        manager.displayInfo();


        Director director = new Director("Marek Wiśniewski", 12000, 20, "IT");
        director.displayInfo();
    }
}










